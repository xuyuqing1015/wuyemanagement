import Vue from 'vue'
import Router from 'vue-router'

import HelloWorld from '@/components/HelloWorld'
//import Drill from '@/components/ChenHaoNuo/drill'

import notice from '@/components/xuyuqing/notice'
import index from '@/components/index'
import Owners from '@/components/gonyandan/Owners'
import selectresdence from '@/components/Tjj/Selectresdence'
import updateresdence from '@/components/Tjj/Updateresdence'
import insertresdence from '@/components/Tjj/Insertresdence'
import Carjc from '@/components/wj/Carjc'
import Zhiqin from '@/components/wj/Zhiqin'
import Visit from '@/components/wj/Visit'

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
			component: notice
		},
		{
		  path: '/carjc',
		  name: 'Carjc',
		  component: Carjc
		}, 
		{
		  path: '/zhiqin',
		  name: 'Zhiqin',
		  component: Zhiqin
		},
		{
		  path: '/visit',
		  name: 'Visit',
		  component: Visit
		},
		/* {
			path:'/drill',
			name:'Drill',
			component:Drill
		} */
   

  ]
})
