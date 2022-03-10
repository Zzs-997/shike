<template>
  <div id="banner" class="container-fliud">
    <ul id="banner_list">
      <li class="active">
        <img src="./images/banner1.png" alt="">
      </li>
      <li>
        <img src="./images/banner2.png" alt="">
      </li>
      <li>
        <img src="./images/banner3.png" alt="">
      </li>
      <li>
        <img src="./images/banner4.png" alt="">
      </li>
      <li>
        <img src="./images/banner5.png" alt="">
      </li>
    </ul>
    <ol id="banner_btns">
      <li class="active"></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
    </ol>
  </div>
</template>

<script>
export default {
  mounted() {
    this.slide()
  },
  methods: {
    slide() {
      let oDiv1 = document.getElementById("banner_list");
      let oDiv2 = document.getElementById("banner_btns");
      let aLi1 = oDiv1.getElementsByTagName("li");
      let aLi2 = oDiv2.getElementsByTagName("li");

      // 给每一个按钮添加点击函数
      for (let i = 0; i < aLi2.length; i++) {
        // 拿到当前按钮的下标
        aLi2[i].index = i;
        aLi2[i].onmousemove = function () {
          // 取消所有按钮的样式
          for (let j = 0; j < aLi2.length; j++) {
            aLi1[j].className = '';
            aLi2[j].className = '';
          }
          this.className = 'active';
          aLi1[this.index].className = 'active';
        }
      }
    }
  }
}
</script>

<style scoped>
#banner {
  position: relative;
}

#banner #banner_list {
  width: 100%;
  height: 620px;
  position: relative;
}

#banner #banner_list li {
  width: 100%;
  height: 100%;
  background: center 0 no-repeat;
  position: absolute;
  left: 0;
  top: 0;
  opacity: 0;
  z-index: 1;
}

#banner #banner_list li img {
  width: 100%;
  height: 100%;
}

#banner #banner_list li.active {
  opacity: 1;
  z-index: 10;
}

#banner #banner_list li:hover::after {
  content: active;
}

#banner #banner_list a {
  display: block;
  width: 100%;
  height: 100%;
}

#banner #banner_btns {
  width: 100%;
  position: absolute;
  bottom: 19px;
  z-index: 20;
  font-size: 0;
  text-align: center;
}

#banner #banner_btns li {
  display: inline-block;
  width: 12px;
  height: 12px;
  border: 2px solid white;
  border-radius: 50%;
  box-sizing: border-box;
  margin: 0 6px;
  cursor: pointer;
}

#banner #banner_btns li.active {
  background: white;
}
</style>
