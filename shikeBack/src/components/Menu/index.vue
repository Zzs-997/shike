<template>
  <aside id="menu" class="l">
    <ul>
      <li>
        <router-link to="/Food">
          <i class="iconfont icon-bianji"></i>
          <p>菜品管理</p>
        </router-link>
      </li>
      <li>
        <router-link to="/Member">
          <i class="iconfont icon-yonghuxinxi"></i>
          <p>会员管理</p>
        </router-link>
      </li>
      <li>
        <router-link to="/Set">
          <i class="iconfont icon-shezhi"></i>
          <p>系统设置</p>
        </router-link>
      </li>
    </ul>
  </aside>
</template>

<script>
export default {
  name: '',
}
</script>

<style scoped>
#menu {
  width: 200px;
  background: #f8f8f8;
  height: 600px;
}

#menu ul {
  color: #A4A4A4;
  text-align: center;
}

#menu li {
  height: 140px;
  border-bottom: 1px #A4A4A4 solid;
  border-top: 1px #A4A4A4 solid;
}

#menu li a {
  color: inherit;
  width: 100%;
  height: 100%;
  display: block;
  padding-top: 35px;
  box-sizing: border-box;
  position: relative;
  top: 0;
  transition: .1s;
}

#menu li a:hover {
  top: -3px;
}

#menu li i {
  font-size: 40px;
}

#menu li p {
  margin-top: 15px;
}
</style>
