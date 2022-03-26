<template>
  <div id="app">
    <!--    在登录页面隐藏-->
    <Header v-show="$route.meta.show"></Header>
    <!--    路由组件出口的地方   -->
    <router-view></router-view>
    <!--    在登录页面隐藏-->
    <Footer v-show="$route.meta.show"></Footer>
  </div>
</template>

<script>
// 引入
import Header from './components/Header/index.vue'
import Footer from './components/Footer/index.vue'
// 注册
export default {
  name: '',
  components: {
    Header,
    Footer
  }
}
</script>

<style scoped>

</style>
