<template>
  <div class="app">
    <router-view></router-view>
  </div>
</template>

<script setup>
console.log("helloworld")
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;

}
body, html {
  margin: 0;
  padding: 0;
}
</style>