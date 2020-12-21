import Vue from 'vue'
import Router from 'vue-router'
<<<<<<< HEAD
import app from '@/app'
import index from '@/components/index'
import Owners from '@/components/gonyandan/Owners'
=======
import HelloWorld from '@/components/HelloWorld'
import selectresdence from '@/components/Tjj/Selectresdence'
import updateresdence from '@/components/Tjj/Updateresdence'
import insertresdence from '@/components/Tjj/Insertresdence'
>>>>>>> 181044efc78b6da1d438b44c682a1441cc6e5418

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
<<<<<<< HEAD
      name: 'index',
      component: index,

    },
    {
      path: '/owners',
      name: 'Owners',
      component: Owners
=======
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
>>>>>>> 181044efc78b6da1d438b44c682a1441cc6e5418
    }
  ]
})
