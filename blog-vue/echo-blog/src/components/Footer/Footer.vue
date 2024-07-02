<template>
    <footer class="footer-wrapper">
        <p>
            © 2024 -
            {{ new Date().getFullYear() }} By
        </p>
    </footer>
</template>

<style>
.footer-wrapper {
  width: 100%;
  height: 2rem;
  padding: 2.5rem 0;
  font-size: 0.875rem;
  text-align: center;
  line-height:2rem;
  color: grey;
  background: pink;
  background-size: 300% 300%;
  /* -webkit-animation: gradientBG 10s ease infinite;
  animation: gradientBG 10s ease infinite; */
}

@keyframes gradientBG {
  0% {
    background-position: 0 50%;
  }

  50% {
    background-position: 100% 50%;
  }

  100% {
    background-position: 0 50%;
  }
}
</style>