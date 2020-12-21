import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import notice from '@/components/xuyuqing/notice'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld,
			children:[
				{
					path: '/notice',
					name: 'notice',
					component: notice,
				}
			]
    }
  ]
})
