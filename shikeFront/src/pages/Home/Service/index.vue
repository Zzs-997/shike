<template>
  <div id="service" class="container">
    <div class="area_title">
      <h2>服务中心</h2>
      <p>OUR SERVICES</p>
    </div>
    <ul class="service_list">
      <li>
        <a href="#show">
          <div></div>
          <h3>菜品信息</h3>
          <p>Dish information</p>
        </a>
      </li>
      <li>
        <router-link to="/Member">
          <div></div>
          <h3>会员信息</h3>
          <p>Dish information</p>
        </router-link>
      </li>
      <li>
        <router-link to="/Map">
          <div></div>
          <h3>门店搜索</h3>
          <p>Store search</p>
        </router-link>
      </li>
      <li>
        <router-link to="/Contact">
          <div></div>
          <h3>联系我们</h3>
          <p>contact us</p>
        </router-link>
      </li>
    </ul>
  </div>
</template>

<script scoped>
export default {
  name: '',
}
</script>

<style>
#service {
  overflow: hidden;
  min-height: 407px;
}

#service .service_list {
  text-align: center;
  margin-top: 34px;
}

#service .service_list li {
  float: left;
  width: 250px;
  margin: 0 10px;
}

#service .service_list div {
  width: 102px;
  height: 102px;
  margin: 0 auto;
  position: relative;
  top: 0;
  transition: .1s;
}

#service .service_list div:hover {
  top: -3px;
}

#service .service_list li:nth-of-type(1) div {
  background-image: url(./images/菜品信息.png);
}

#service .service_list li:nth-of-type(2) div {
  background-image: url(./images/会员信息.png);
}

#service .service_list li:nth-of-type(3) div {
  background-image: url(./images/门店搜索.png);
}

#service .service_list li:nth-of-type(4) div {
  background-image: url(./images/联系我们.png);
}

#service .service_list a h3 {
  font-size: 18px;
  color: #434343;
  line-height: 36px;
  margin-top: 25px;
}

#service .service_list a p {
  font-family: 14px;
  color: #6D6D6D;
  line-height: 22px;
}
</style>
