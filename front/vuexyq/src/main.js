// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'


/* 1.引用ElementUI */
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.use(ElementUI)

//2.在main.js引入qs
import qs from 'qs'

//配全局属性配置，在任意组件内可以使用this.$qs获取qs对象
Vue.prototype.$qs = qs;

//3.导入axios
import axios from './utils/utils'
//在Vue对象添加了一个属性，以后访问axios   this.$axios
Vue.prototype.$axios = axios;

//4.导入font-awesome
import 'font-awesome/css/font-awesome.min.css'

//导入ionicons.js

//5、农历和阳历相互转换
import dates from './utils/calendar'
Vue.prototype.$date = dates;

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
