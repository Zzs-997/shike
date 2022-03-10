<template>
  <div>
    <!--图片展示-->
    <Banner/>
    <!--服务中心-->
    <Service/>
    <!--食客美食-->
    <Show/>
    <!--食客简介-->
    <Introduction/>
  </div>
</template>

<script>
//引入其余的组件
import Banner from "./Banner"
import Service from "./Service";
import Show from "./Show";
import Introduction from "./Introduction";

export default {
  name: '',
  components: {
    Banner,
    Service,
    Show,
    Introduction
  },
}
</script>

<style scoped>

</style>
