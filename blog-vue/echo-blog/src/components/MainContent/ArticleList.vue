<template>
  <div class="article-item"  v-for="article of articles" :key="article.id">
		<!-- 文章缩略图 -->
		<div class="article-cover">
			<router-link :to="`/article/${article.id}`" href="">
				<img class="cover" :src="article.cover" width="60px"/>
			</router-link>
		</div>
		<!-- 文章信息 -->
		<div class="article-info">
			<div class="article-meta">
				<!-- 发表时间 -->
				<span class="meta-item ml-3.75">
					<img src="@/assets/icon/date.svg" width="15px"  style="margin-right: 0.15rem"> 
          {{ article.createTime }}
				</span>
			</div>
			<!-- 文章标题 -->
			<router-link :to="`/article/${article.id}`" class="article-title">
        <h3 >
					{{ article.title }}
        </h3>
			</router-link>
			
			<!-- 文章内容 -->
			<div class="article-content">{{ article.content }}</div>

			<!-- 阅读按钮 -->
			<router-link class="article-btn" :to="`/article/${article.id}`">more...</router-link>
		</div>
	</div>
</template>


<script>
export default {
  data() {
    return {
      articles: [
        {title:"第一篇", content:"这里是内容",id:0,createTime:"2024-01-01",
        cover:new URL("@/assets/images/MainPic.jpg",import.meta.url)},
        {title:"第二篇", content:"这里是内容2",id:0,createTime:"2024-02-02",
        cover:new URL("@/assets/images/AlbumPic.jpg",import.meta.url)}
      ],  // 初始可以为空，loadMoreArticles时填充
      page: 1,       // 分页参数
    };
  },
  async created() {
    await this.loadMoreArticles();
  },
  methods: {
    async loadMoreArticles() {
      // 模拟异步获取数据
      const response = await fetch(`/api/articles?page=${this.page}&limit=10`);
      const newData = await response.json(); // 返回的是文章列表数组
      this.articles.push(...newData);
      this.page++;
    },
    openArticle(id) {
      this.$router.push(`/articles/${id}`); // 文章详情页路由为/articles/:id
    },
  },
};
</script>

<style scoped>
.article-item{
  display:flex;
  height: 14rem;
  margin: 1.25rem 0.5rem 0;
	border-radius: 0.5rem;


  &:hover {
		box-shadow: 0 0 1.5rem rgb(223, 223, 223);

		.cover {
			transform: scale(1.05) rotate(1deg);
		}
	}
  &:nth-child(even) {
		flex-direction: row-reverse;

		.article-cover {
			margin-right: auto;
			margin-left: 1.5rem;
			-webkit-clip-path: polygon(0 0, 100% 0, 100% 100%, 8% 100%);
			clip-path: polygon(0 0, 100% 0, 100% 100%, 8% 100%);
			border-radius: 0 0.625rem 0.625rem 0;
		}

		.article-info {
			padding: 1rem 0 3rem 1.5rem;

			.article-meta {
				justify-content: flex-start;
			}
		}

		.article-btn {
			left: 0;
			right: auto;
			border-radius: 0 1rem;
      background-image: linear-gradient(to right, pink 0, orange 100%);

			&:hover {
				transform: translateZ(2rem);
			}
		}

		.article-category {
			right: 0.5rem;
			justify-content: flex-start;
		}
	}
}

.article-cover {
	width: 50%;
	margin-right: 1.5rem;
	clip-path: polygon(0 0, 92% 0, 100% 100%, 0 100%);
	border-radius: 0.625rem 0 0 0.625rem;
	overflow: hidden;

	.cover {
		width: 100%;
		height: 100%;
		object-fit: cover;
		transition: all 0.2s ease-in-out 0s;
	}
}

.article-info {
	position: relative;
	width: 50%;
	padding: 1rem 1.5rem 3rem 0;
	perspective: 62.5rem;

	.article-meta {
		display: flex;
		justify-content: flex-end;
		font-size: 0.8125rem;
		color: grey;
	}

	.top {
		color: orange;
	}

	.meta-item {
		display: flex;
		align-items: center;
	}

	.ml:not(:first-child) {
		margin-left: 0.625rem;
	}

	.article-title {
		text-overflow: ellipsis;
		white-space: nowrap;
		margin: 0.625rem 0;
		color: rgba(231, 118, 108, 0.919);
		overflow: hidden;
    text-align:left;
    text-decoration:none;
	}

	.article-content {
		display: -webkit-box;
		-webkit-box-orient: vertical;
		max-height: 5rem;
		font-size: 0.875em;
		overflow: hidden;
    text-align:left;
	}
}

.article-btn {
	position: absolute;
	bottom: 0;
	right: 0;
	padding: 0.3rem 1rem;
	border-radius: 1rem 0;
	color: grey;
	background-image: linear-gradient(to right, pink 0, orange 100%);

	&:hover {
		transform: translateZ(2rem);
	}
}

@media (max-width: 767px) {
	.article-item {
		flex-direction: column;
		height: fit-content;

		.article-cover {
			width: 100%;
			height: 14rem;
			margin: auto;
			clip-path: polygon(0 0, 100% 0, 100% 92%, 0 100%);
			border-radius: 0.625rem 0.625rem 0 0;
		}

		.article-info {
			width: 100%;
			height: 14rem;
			padding: 0 1rem 3rem;
		}

		&:nth-child(even) {
			flex-direction: column;

			.article-cover {
				width: 100%;
				margin: auto;
				clip-path: polygon(0 0, 100% 0, 100% 100%, 0 92%);
				border-radius: 0.625rem 0.625rem 0 0;
			}

			.article-info {
				padding: 0 1rem 3rem;
			}
		}
	}
}
</style>