import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import selectresdence from '@/components/Tjj/Selectresdence'
import updateresdence from '@/components/Tjj/Updateresdence'
import insertresdence from '@/components/Tjj/Insertresdence'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/sres',
      name: 'selectresdence',
      component: selectresdence
    },
    {
      path: '/ures',
      name: 'updateresdence',
      component: updateresdence
    },
    {
      path: '/ires',
      name: 'insertresdence',
      component: insertresdence
    }
  ]
})
