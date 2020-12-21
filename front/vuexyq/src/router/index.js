import Vue from 'vue'
import Router from 'vue-router'
import index from '@/components/index'
import Owners from '@/components/gonyandan/Owners'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index,

    },
    {
      path: '/owners',
      name: 'Owners',
      component: Owners
    }
  ]
})
