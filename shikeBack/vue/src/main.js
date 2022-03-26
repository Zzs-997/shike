// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import '../static/common.css'
import '../static/iconfont/iconfont.css'
import cookie from "../utils/cookie.js"

Vue.prototype.cookie = cookie;
Vue.config.productionTip = false

router.beforeEach((to, from, next) => {
    /* 路由发生变化修改页面title */
    if (to.meta.title) {
      document.title = to.meta.title
    }
    next()
  }
)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router, //注册路由 注意是小写
  components: {App},
  template: '<App/>',
})
