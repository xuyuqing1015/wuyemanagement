import Vue from 'vue'
import Router from 'vue-router'


import index from '@/components/index'
import Owners from '@/components/gonyandan/Owners'

import HelloWorld from '@/components/HelloWorld'

import notice from '@/components/xuyuqing/notice'

import selectresdence from '@/components/Tjj/Selectresdence'
import updateresdence from '@/components/Tjj/Updateresdence'
import insertresdence from '@/components/Tjj/Insertresdence'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index
    },
    {
      path: '/owners',
      name: 'Owners',
      component: Owners
	},
	{
	  path:'/HelloWorld',
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
    },
	{
		path: '/notice',
		name: 'notice',
		component: notice,
	}
  ]
})
