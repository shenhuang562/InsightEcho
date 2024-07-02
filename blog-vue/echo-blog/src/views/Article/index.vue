<template>
  <main class="mainContent">
    <MainContent/>
  </main>

</template>

<script >
import MainContent from '@/components/MainContent/MainContent.vue'
export default {
    components: { MainContent },
}
</script>

<style scoped>
.mainContent{
  margin-top:80px;
  display:flex;
  justify-content: center;
  align-items:flex-start;
}
</style>