<template>
    <div class="blog-editor">    
        <el-form ref="formRef" :model="form" :rules="rules" label-width="75px" @submit.prevent>
            <el-form-item prop="title" label="标题">
                <el-input v-model="form.title"></el-input>
            </el-form-item>
            <el-form-item label="发布日期">
                <el-date-picker v-model="form.date" type="date" placeholder="选择日期" value-format="YYYY-MM-DD"/>
                <el-button type="primary" @click="submit" style="position:fixed;right:20px;">发布文章</el-button>
            </el-form-item>
            <div class="blog-content">
                <div class="markdown-editor">
                    <div class="editor-container">
                        <el-input type="textarea" v-model="form.content" resize="none" :rows="35" placeholder="请输入文章内容..."/>
                    </div>
                    <div class="preview-container">
                        <div v-html="form.parsedContent"/>
                    </div>
                </div>
            </div>
        </el-form>

        <el-dialog v-model="showsubmit" title="发布文章" width="500" :before-close="handleDialogClose" class="submit-dialog">
          <el-form :model="form" :rules="rules" ref="formRef" @submit.prevent >

            <!-- 分类选项 -->
            <el-form-item label="文章分类" prop="category">
              <el-tag type="success" v-show="form.category" :disable-transitions="true"
                  :closable="true" @close="removeCategory">
                  {{ form.category }}
              </el-tag>
              <el-popover v-if="!form.category" placement="bottom-start" width="460" trigger="click">
                  <template #reference>
                      <el-button type="success" plain>添加分类</el-button>
                  </template>
                  <!-- 搜索框 -->
                  <el-input
                  ref="InputRef"
                  v-model="inputValue"
                  class="w-20"
                  size="small"
                  @keyup.enter="saveCategory"
                  @blur="saveCategory"
                  />
                  <!-- 分类 -->
                  <div class="popover-container">
                      <div v-for="item of categoryList" :key="item.id" class="category-item"
                          @click="addCategory(item.category)">
                          {{ item.category }}
                      </div>
                  </div>
              </el-popover>
            </el-form-item>

            <!-- 标签部分 -->
            <el-form-item prop="tags" label="标签">
                <el-tag v-for="tag in form.tags" :key="tag" closable :disable-transitions="false" @close="handleClose(tag)">
                    {{ tag }}
                </el-tag>
                <el-input
                v-if="inputVisible"
                ref="InputRef"
                v-model="inputValue"
                class="w-20"
                size="small"
                @keyup.enter="handleInputConfirm"
                @blur="handleInputConfirm"
                />
                <el-button v-else class="button-new-tag" size="small" @click="showInput">
                + New Tag
                </el-button>
            </el-form-item>

            <el-form-item label="缩略图" prop="cover">
                <el-upload drag :show-file-list="false" :headers="authorization" action="/api/admin/article/upload"
                    accept="image/*" :before-upload="beforeUpload" :on-success="handleSuccess">
                    <el-icon class="el-icon--upload"
                        v-if="form.cover === ''"><upload-filled /></el-icon>
                    <div class="el-upload__text" v-if="form.cover === ''">
                        将文件拖到此处，或<em>点击上传</em>
                    </div>
                    <img v-else :src="form.cover" width="360" />
                </el-upload>
            </el-form-item>

            <!-- 置顶 -->
            <el-form-item label="置顶" prop="isTop">
                <el-switch v-model="form.isTop" :active-value="1" :inactive-value="0"></el-switch>
            </el-form-item>
            <!-- 推荐 -->
            <el-form-item label="推荐" prop="isRecommend">
                <el-switch v-model="form.isRecommend" :active-value="1" :inactive-value="0"></el-switch>
            </el-form-item>
            
            <el-form-item label="发布形式" prop="status">
                <el-radio-group v-model="form.status">
                    <el-radio :value="1">公开</el-radio>
                    <el-radio :value="2">私密</el-radio>
                    <el-radio :value="3">草稿</el-radio>
                </el-radio-group>
            </el-form-item>
            
            <el-form-item label="文章摘要" prop="summary">
                <el-input type="textarea" v-model="form.summary" placeholder="文章摘要" 
                rows="5" :maxlength="100" resize="none" show-word-limit></el-input>
            </el-form-item>
            
            <el-button type="primary" @click="submitArticle">发布文章</el-button>
            <el-button @click="handleDialogClose();">取消</el-button>
          </el-form>
        </el-dialog>
    </div>
</template>
  
<script setup>

import { ref, reactive, watch,nextTick } from 'vue';
import { ElInput } from 'element-plus'
import MarkdownIt from 'markdown-it';
import { UploadFilled } from '@element-plus/icons-vue';
const formRef = ref(null);
const form = reactive({
  title: "标题",
  date: new Date().toISOString().slice(0, 10),
  content: "## 你好！！ ",
  parsedContent: "",
  category:"",
  tags : ['Tag 1', 'Tag 2', 'Tag 3'],
  isTop:false,
  isRecommend:true,
  status:1,
  cover:"",
  summary:"",
});

const rules = reactive({
  title: [{ required: true, message: '标题不能为空', trigger: 'blur' }],
  content: [{ required: true, message: '内容不能为空', trigger: 'blur' }],
  tags: [{ required: true, message: '至少添加一个标签', trigger: 'change' }],
  summary: [{ required: true, message: '摘要不能为空', trigger: 'blur' }],
});

const showsubmit = ref(false);

const submit = () => {
  if (form.title && form.content) {
    showsubmit.value = true;
  } else {
    alert('标题与文本内容不得为空');
  }
};

const submitArticle = () => {
    formRef.value.validate((valid) => {
    if (valid) {
      // 提交表单
      alert(`tags: ${form.tags}\n置顶: ${form.isTop}\n推荐: ${form.isRecommend}\nstatus:${form.status}\n摘要:${form.summary}`);
    } else {
      alert('请补全信息');
      return false;
    }
  });

};

const parseMarkdown = () => {
  const md = new MarkdownIt({html:true});
  form.parsedContent = md.render(form.content);
};

watch(() => form.content, () => {
  parseMarkdown();
}, { immediate: true });

const handleDialogClose = (done) => {
  // 当对话框即将关闭时，设置 showsubmit 为 false
  showsubmit.value = false;
};

const inputValue = ref('')
const inputVisible = ref(false)
const InputRef = ref('')

const handleClose = (tag) => {
  const index = form.tags.indexOf(tag);
  if (index > -1) {
    form.tags.splice(index, 1);
  }
};

const showInput = () => {
  inputVisible.value = true
  nextTick(() => {
    InputRef.value.focus()
  })
}

const handleInputConfirm = () => {
  
  if (inputValue.value) {
    form.tags.push(inputValue.value)
  }
  inputVisible.value = false
  inputValue.value = ''
  
}


const categoryList = [{id:1,category:"算法"},{id:2,category:"测试"},{id:3,category:"项目"},{id:4,category:"规划"}]
const removeCategory = () => {
    form.category = "";
};

const saveCategory = () => {
    form.category = inputValue.value
    inputValue.value = ''
};
const addCategory = (item) => {
    form.category = item;
};
</script>
  
<style scoped>
.blog-editor {
  margin-top: 20px;
  height: 96%;
  display: flex;
  flex-direction: column;
}

.el-form--inline .el-form-item {
  margin-bottom: 0;
}

.blog-content {
  flex: 1;
  display: flex;
  flex-direction: row;
  overflow: auto;
}

.markdown-editor {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: stretch;
  width: 100%;
  height: 100%;
}

.editor-container {
  flex: 1;
  display: flex;
  flex-direction: column;
  overflow: auto;
  border-right: 1px solid #ddd;
}

.preview-container {
  flex: 1;
  display: flex;
  flex-direction: column;
  overflow: auto;
  background-color: #f8f8f8;
  padding: 8px;
  box-sizing: border-box;
  font-size: 14px;
  line-height: 1.6em;
  color: #333;
  font-family: Menlo, Monaco, Consolas, "Courier New", monospace;
  white-space: pre-wrap;
  word-break: break-all;
  max-height:745px;
}

.tag-div{
    margin-bottom:20px;
}

.category-item {
    cursor: pointer;
    padding: 0.6rem 0.5rem;
}

.category-item:hover {
    background-color: #f0f9eb;
    color: #67c23a;
}
</style>