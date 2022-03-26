//配置路由的地方
import Vue from 'vue'
import Router from 'vue-router'
//使用插件
Vue.use(Router)
//引入路由组件
import About from "../pages/About";
import Choice from "../pages/Choice";
import Contact from "../pages/Contact";
import Home from '../pages/Home'
import Join from "../pages/Join";
import Login from "../pages/Login";
import Map from "../pages/Map";
import member from "../pages/Member";
//配置路由
export default new Router({
  //配置路由，有很多个，所以用数组保存
  routes: [
    //重定向，在项目跑起来的时候，访问立马把它定向到首页
    {
      path: '*',
      redirect: '/home'
    },
    {
      path: '/about',
      component: About,
      meta: {
        show: true,
        title: '食客-关于食客'
      }
    },
    {
      path: '/choice',
      component: Choice,
      meta: {
        show: true,
        title: '食客-选餐'
      }
    },
    {
      path: '/contact',
      component: Contact,
      meta: {
        show: true,
        title: '食客-联系我们'
      }
    },
    {
      path: '/home',
      component: Home,
      meta: {
        show: true,
        title: '食客-主页'
      }
    },
    {
      path: '/join',
      component: Join,
      meta: {
        show: true,
        title: '食客-加入食客'
      }
    },
    {
      path: '/login',
      component: Login,
      meta: {
        show: false,
        title: '食客-登录'
      }
    },
    {
      path: '/map',
      component: Map,
      meta: {
        show: true,
        title: '食客-食客位置'
      }
    },
    {
      path: '/Member',
      component: member,
      meta: {
        show: true,
        title: '食客-食客会员'
      }
    },
  ]
})
