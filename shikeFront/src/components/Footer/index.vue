<template>
  <div id="foot" class="container-fluid">
    <div class="container">
      <p class="l">基于微信支付的会员制社区餐饮收费管理系统</p>
      <div class="r">
        <router-link to="/Home">主页</router-link>
        |
        <router-link to="/Choice">购物车</router-link>
        |
        <router-link to="/Member">会员</router-link>
        |
        <router-link to="">后台</router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
#foot {
  background: #d80c1c;
}

#foot .container {
  height: 54px;
  line-height: 54px;
  font-size: 12px;
  color: white;
}

#foot div a {
  color: white;
  margin: 0 10px;
}
</style>
