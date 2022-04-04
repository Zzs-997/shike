<template>
  <div id="app">
    <!--    在登录页面隐藏-->
    <Header v-show="$route.meta.show"></Header>
    <Menu v-show="$route.meta.show"></Menu>
    <!--  路由组件出口的地方  -->
    <router-view></router-view>
    <!--    在登录页面隐藏-->
    <Footer v-show="$route.meta.show"></Footer>
  </div>
</template>

<script>
//引入
import Header from './components/Header/index.vue'
import Footer from './components/Footer/index.vue'
import Menu from "./components/Menu";

export default {
  name: 'App',
  components: {
    Header,
    Footer,
    Menu
  },
  mounted() {
    this.ifLogin();
  },
  methods:{
    //阻止在退出账号后，在输入框中返回系统中
    ifLogin(){
      let oApp = document.getElementById("app");
      if (!this.cookie("name")){
        this.$router.push("Login");
      }
    }
  }
}
</script>

<style scoped>

</style>
