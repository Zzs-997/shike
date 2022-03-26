//配置路由的地方
import Vue from 'vue'
import Router from 'vue-router'
//使用插件
Vue.use(Router)
//引入路由组件
import Food from "../pages/Food";
import Home from "../pages/Home";
import Login from "../pages/Login";
import Member from "../pages/Member";
import Set from "../pages/Set";

export default new Router({
  mode:"history",
  //配置路由，有很多个，所以用数组保存
  routes: [
    //重定向，在项目跑起来的时候，访问立马把它定向到首页
    {
      path: '*',
      redirect: '/Login'
    },
    {
      path: '/Food',
      component: Food,
      meta: {
        show: true,
        title: '食客-菜品管理'
      }
    },
    {
      path: '/Home',
      component: Home,
      meta: {
        show: true,
        title: '食客-后台主页'
      }
    },
    {
      path: '/Login',
      component: Login,
      meta: {
        show: false,
        title: '食客-后台登录'
      }
    },
    {
      path: '/Member',
      component: Member,
      meta: {
        show: true,
        title: '食客-会员管理'
      }
    },
    {
      path: '/Set',
      component: Set,
      meta: {
        show: true,
        title: '食客-系统设置'
      }
    }
  ]
})
