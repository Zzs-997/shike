<template>
  <div id="introduction" class="container-fliud">
    <div class="container">
      <div class="area_title">
        <h2>账号管理</h2>
        <p>ACCOUNT MANAGEMENT</p>
      </div>
      <div id="setlist_btns" class="clear">
        <ul>
          <li class="active">基本资料</li>
          <li>密码管理</li>
          <li>消费记录</li>
        </ul>
      </div>
      <div id="detail">
        <!-- 基本资料 -->
        <div style="display: block;">
          <div class="list_zl clear">
            <span class="l">姓名：</span>
            <p class="message l"></p>
          </div>
          <div class="list_zl clear">
            <span class="l">邮箱：</span>
            <p class="message l"></p>
          </div>
          <div class="list_zl clear">
            <span class="l">手机号：</span>
            <p class="message l"></p>
          </div>
          <div class="list_zl clear">
            <span class="l">会员等级：</span>
            <p class="message l"></p>
            <p class="message l">
              *会员分为1~5级&nbsp;&nbsp;&nbsp;1级：9.8折&nbsp;&nbsp;&nbsp;2级：9.5折&nbsp;&nbsp;&nbsp;3级：9折&nbsp;&nbsp;&nbsp;4级：8.5折&nbsp;&nbsp;&nbsp;5级：8折
            </p>
          </div>
        </div>
        <!-- 密码管理 -->
        <div>
          <div class="list_mm">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;旧密码：<input type="text" placeholder="请输入旧密码">
          </div>
          <div class="list_mm clear">
            <span class="l">&nbsp;&nbsp;&nbsp;&nbsp;新的密码：</span><input class="l" type="password" placeholder="请输入新密码">
            <p class="l">
              * 密码由8-16位字符（字母、数字、_@#.特殊字符）组成!
            </p>
          </div>
          <div class="list_mm">确认新密码：<input type="password" placeholder="请再次输入新密码">
          </div>
          <div class="list_mm">
            <button type="button" class="submit">提交</button>
          </div>
        </div>
        <!-- 消费记录 -->
        <div>
          <table class="food_table l">
            <thead>
            <tr>
              <th width="150">账号</th>
              <th width="150">日期</th>
              <th>菜品评价</th>
              <th>消费记录</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td>曾子升</td>
              <td>2022.01.01</td>
              <td>好吃实惠！</td>
              <td>红烧肉</td>
            </tr>
            <tr>
              <td>曾子升</td>
              <td>2022.01.03</td>
              <td>好吃实惠！</td>
              <td>茄子炒肉</td>
            </tr>
            <tr>
              <td>曾子升</td>
              <td>2022.01.05</td>
              <td>好吃实惠！</td>
              <td>红烧排骨</td>
            </tr>
            <tr>
              <td>曾子升</td>
              <td>2022.01.07</td>
              <td>好吃实惠！</td>
              <td>剁椒鱼头</td>
            </tr>
            <tr>
              <td>曾子升</td>
              <td>2022.01.09</td>
              <td>好吃实惠！</td>
              <td>啤酒鸭</td>
            </tr>
            <tr>
              <td>曾子升</td>
              <td>2022.01.11</td>
              <td>好吃实惠！</td>
              <td>干锅牛腩</td>
            </tr>
            </tbody>
          </table>
          <div class="food_page l">
            <a href="#">共18条</a>
            <a href="#">首页</a>
            <a href="#">上一页</a>
            <a href="#" class="active">1</a>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">下一页</a>
            <a href="#">尾页</a>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import request from "../../../../utils/request";

export default {
  name: '',
  mounted() {
    this.change();
    this.write_member();
  },
  methods: {
    write_member() {
      let oDetail = document.getElementById("detail");
      let aPs = oDetail.getElementsByTagName("p");
      if(this.cookie("phone")){
        let phone = this.cookie("phone");
        request.get('/member/selectMemberBymemberPhone/' + phone).then(function (result) {
          let arr = result.data;
          aPs[0].innerHTML += arr.name;
          aPs[1].innerHTML += arr.email;
          aPs[2].innerHTML += arr.phone;
          aPs[3].innerHTML += arr.rank;
        });
      }
    },
    change() {
      let oDiv1 = document.getElementById("setlist_btns");
      let oDiv2 = document.getElementById("detail");
      let aLis = oDiv1.getElementsByTagName("li");
      let aDivs = oDiv2.children;
      // 给每一个按钮添加点击函数
      for (let i = 0; i < aLis.length; i++) {
        // 拿到当前按钮的下标
        aLis[i].index = i;
        aLis[i].onclick = function () {
          // 取消所有按钮的样式
          for (let j = 0; j < aLis.length; j++) {
            aLis[j].className = '';
            aDivs[j].style.display = 'none';
          }
          aDivs[this.index].style.display = 'block';
          this.className = 'active';
        }
      }
    }
  }
}
</script>

<style scoped>
#introduction {
  background: #f8f8f8;
  border-top: 54px solid #D80C1C;
}

#introduction .container {
  min-height: 512px;
  overflow: hidden;
  border-left: 1px #3F3F3F solid;
}

#introduction .area_title {
  margin-top: 55px;
  margin-bottom: 16px;
}

#introduction #setlist_btns ul li {
  float: left;
  margin-left: 70px;
  font-weight: bolder;
  cursor: pointer;
}

#introduction #setlist_btns ul li.active {
  color: #D80C1C;
}

/* 内容显示 */
#introduction .container #detail > div {
  display: none;
}

/* 基本资料 */
#introduction .list_zl {
  margin: 30px 0 30px 40px;
}

#introduction .list_zl .message {
  margin-left: 30px;
  font-size: 14px;
  line-height: 24px;
}

/* 密码管理 */
#introduction .list_mm {
  margin: 30px 0 30px 40px;
}

#introduction .list_mm p {
  margin-left: 30px;
  font-size: 14px;
  line-height: 24px;
}
#introduction .list_mm button{
  margin-left: 30px;
  width: 200px;
  height: 30px;
}
<<<<<<< HEAD:shikeFront/vue/src/pages/Member/Introduction/index.vue
<<<<<<< HEAD:shikeFront/vue/src/pages/Member/Introduction/index.vue

<<<<<<< HEAD:shikeFront/vue/src/pages/Member/Introduction/index.vue
#introduction .list_mm button {
  margin-left: 30px;
  width: 200px;
  height: 30px;
}

/* 消费记录 */
=======
  /* 消费记录 */
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f:shikeFront/src/pages/Member/Introduction/index.vue
=======

  /* 消费记录 */
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f:shikeFront/src/pages/Member/Introduction/index.vue
=======

  /* 消费记录 */
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f:shikeFront/src/pages/Member/Introduction/index.vue
/* 展示列表 */
#introduction .food_table {
  margin: 30px 20px 0 30px;
  width: calc(100% - 282px);
  border: 1px #A4A4A4 solid;
  font-size: 14px;
  border-collapse: collapse;
}

#introduction .food_table tr {
  height: 32px;
  border-bottom: 1px solid #A4A4A4;
}

#introduction .food_table th {
  border-right: 1px solid #A4A4A4;
  color: #666666;
  font-weight: normal;
  text-align: left;
  text-indent: 12px;
  background: #f9f9f9;
}

#introduction .food_table th:first-child,
#introduction .food_table td:first-child {
  text-align: center;
  text-indent: 0;
}

#introduction .food_table td {
  text-indent: 12px;
}

/* 换页 */
#introduction .food_page {
  font-size: 0;
  line-height: 24px;
  margin: 30px 48px 0 30px;
}

#introduction .food_page a {
  border: 1px #A4A4A4 solid;
  padding: 6px 9px;
  font-size: 12px;
  margin-left: 10px;
}

#introduction .food_page a.active {
  background: #D80C1C;
  color: white;
}
</style>
