<template>
  <div id="head" class="container">
    <div class="head_logo l">
      <router-link to="/Home">
        <img src="./images/logo.png" alt="食客" title="食客"/>
      </router-link>
    </div>
    <ul class="head_menu r">
      <li>
        <router-link to="/About">关于食客</router-link>
      </li>
      <li>
        <router-link to="/Choice">食客美食</router-link>
      </li>
      <li>
        <router-link to="/Join">加入食客</router-link>
      </li>
      <li>
        <router-link to="/Member">食客会员</router-link>
      </li>
      <li>
        <!--        声明式导航，务必要有to属性-->
        <router-link to="/login">登录</router-link>
      </li>
    </ul>
  </div>
</template>
<script>
export default {
  methods: {
    jump(selector) {
      let anchor = this.$el.querySelector(selector);
      anchor.scrollIntoView();
    }
  }
};
</script>

<style scoped>
#head {
  height: 100px;
  padding-bottom: 8px;
}

#head .head_logo img {
  width: 200px;
  height: 80px;
  margin-top: 20px;
}

#head .head_menu {
  font-size: 16px;
  line-height: 80px;
  margin-top: 20px;
  font-weight: bold;
}

#head .head_menu li {
  float: left;
  margin-left: 58px;
  position: relative;
  top: 0;
  transition: 0.1s;
}

#head .head_menu li:hover {
  top: -3px;
}
</style>

