<template>
  <div id="show" class="container-fluid">
    <div class="container">
      <div class="area_title">
        <h2>食客美食</h2>
        <p>DINER FOOD</p>
        <p>作为一个社区餐饮门店，食客秉承诚信经营的理念，以提升食品质量的稳定性和安全性为前提条件，
          <br>
          为广大消费者提供更贴心的服务，更健康、更安全、更营养和更放心的食品。</p>
      </div>
      <ul class="show_list clear">
        <li>
          <img src="./images/show1.jpg" alt="" width="339px" height="181px">
        </li>
        <li>
          <img src="./images/show2.jpg" alt="" width="339px" height="181px">
        </li>
        <li>
          <img src="./images/show3.jpg" alt="" width="339px" height="181px">
        </li>
      </ul>
      <div class="show_btn">
        <router-link to="/Choice">选餐</router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Show'
}
</script>

<style scoped>
#show {
  background: #f8f8f8;
}

#show .container {
  min-height: 460px;
  overflow: hidden;
}

#show .area_title {
  margin-top: 55px;
}

#show .show_list {
  margin-top: 10px;
}

#show .show_list li {
  float: left;
  width: 340px;
  margin: 0 10px;
}

#show .show_btn {
  width: 176px;
  height: 37px;
  background: #D80C1C;
  margin: 0 auto;
  border-radius: 25px;
  line-height: 37px;
  text-align: center;
  font-size: 14px;
  margin-top: 26px;
  position: relative;
  top: 0;
  transition: .1s;
}

#show .show_btn:hover {
  top: -3px;
  box-shadow: 0 5px 10px 3px #ccc;
}

#show .show_btn a {
  display: block;
  width: 100%;
  height: 100%;
  color: white;
}
</style>
