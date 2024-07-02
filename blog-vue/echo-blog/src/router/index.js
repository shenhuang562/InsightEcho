import { createRouter, createWebHistory } from 'vue-router'
import Home from '@/views/Home/Home.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/article',
      name: 'article',
      component: () => import('@/views/Article/index.vue')
    },
    {
      path: '/friend-links',
      name: 'friend-links',
      component: () => import('@/views/Friend/index.vue')
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('@/views/About/index.vue')
    },
    {
      path: '/talk',
      name: 'talk',
      component: () => import('@/views/Talk/index.vue')
    },
    {
      path: '/album',
      name: 'album',
      component: () => import('@/views/Album/index.vue')
    },

  ]
})

export default router
