<template>
  <header id="header">
    <hgroup class="header_logo l">
      <h1 class="l">
        <img src="./images/logo.png" alt="">
      </h1>
      <router-link to="/Home" class="l">
        <h2>食客餐饮内部管理平台</h2>
      </router-link>
    </hgroup>
    <ul class="header_nav r">
      <li>
        <i class="iconfont icon-wode"></i>欢迎您，管理员
      </li>
      <li>
        <i class="iconfont icon-yuechi_o"></i>
        <a href="#" onclick="javascript:alert('暂不支持修改管理员密码')">修改密码</a>
      </li>
      <li>
        <i class="iconfont icon-shouye"></i>
        <a href=""></a>
        <router-link to="">食客官网</router-link>
      </li>
      <li>
        <i class="iconfont icon-tuichu"></i>
        <a @click="exit">退出</a>
      </li>
    </ul>
  </header>
</template>

<script>
export default {
  name: '',
  methods: {
    exit() {
      this.cookie("name", "");
      this.cookie("password", "");
      location.replace(this.href);
      this.$router.push("Login");
    }
  }
}

</script>

<style scoped>
#header {
  height: 80px;
  background: #D80C1C;
}

#header .header_logo {
  position: relative;
  top: 0;
  transition: .1s;
}

#header .header_logo:hover {
  top: -3px;
}

#header .header_logo h1 {
  margin: 20px 14px 0 20px;
}

#header .header_logo h1 img {
  width: 40px;
  height: 40px;
}

#header .header_logo h2 {
  color: white;
  font-size: 22px;
  line-height: 25px;
  margin-top: 28px;
}

#header .header_nav {
  color: white;
  font-size: 14px;
  line-height: 14px;
  margin-top: 33px;
}

#header .header_nav li {
  float: left;
  margin-right: 25px;
}

#header .header_nav li:nth-child(2), #header .header_nav li:nth-child(3), #header .header_nav li:nth-child(4) {
  position: relative;
  top: 0;
  transition: .1s;
}

#header .header_nav li:nth-child(2):hover, #header .header_nav li:nth-child(3):hover, #header .header_nav li:nth-child(4):hover {
  top: -3px;
}

#header .header_nav a {
  color: white;
  cursor: pointer;
}

#header .header_nav i {
  margin-right: 4px;
}

#header .header_nav i.icon-wode {
  font-size: 22px;
  position: relative;
  top: 3px;
  line-height: 10px;
}

#header .header_nav i.icon-yuechi_o {
  font-size: 23px;
  position: relative;
  top: 3px;
  line-height: 10px;
}

#header .header_nav i.icon-shouye {
  font-size: 20px;
  position: relative;
  top: 3px;
  line-height: 10px;
}

#header .header_nav i.icon-tuichu {
  font-size: 20px;
  position: relative;
  top: 3px;
  line-height: 10px;
}
</style>
