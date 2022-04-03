<template>
  <main id="main">
    <section class="main_container">
      <section id="projectTitle" class="clear">
        <div class="projectTitle_text l">
          <h2>食客会员信息</h2>
          <p>
            添加会员信息：<span>添加新的会员</span>
            <br>
            删除会员信息：<span>注销会员</span>
            <br>
            更改会员信息：<span>调整不同级别会员的折扣力度等信息</span>
            <br>
            查询会员信息：<span>查询会员的消费记录等信息</span>
          </p>
        </div>
        <div class="projectTitle_img r">
          <img src="./images/logo.png" alt="">
        </div>
      </section>
      <section id="projectList">
        <div id="projectList_btns">
          <ul>
            <li class="active">添加会员信息</li>
            <li>删除会员信息</li>
            <li>更改会员信息</li>
            <li>查询会员信息</li>
          </ul>
        </div>
        <div id="projectList_cons">
          <!-- 添加会员信息 -->
          <div style="display: block;">
            <form action="#">
              <div id="add" class="member_add l">
                用户名：<input type="text" placeholder="用户名" required>
                <br>
                手机号：<input type="text" placeholder="手机号" required>
                <span id="phone_text">* 请输入正确的手机号！</span>
                <br>
                &nbsp; &nbsp; 邮箱：<input type="text" placeholder="邮箱" required>
                <span id="email_text">* 请输入正确的邮箱！</span>
                <br>
                &nbsp; &nbsp; 密码：<input type="password" placeholder="密码" required>
                <div class="clear">
                  <p class="l">会员等级：5（默认）</p>
<<<<<<< HEAD
<<<<<<< HEAD
                  <p class="l">
=======
                  <p class="l" style="color: #D80C1C">
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
                  <p class="l" style="color: #D80C1C">
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
                    *会员分为1~5级&nbsp;&nbsp;&nbsp;1级：9.8折&nbsp;&nbsp;&nbsp;2级：9.5折&nbsp;&nbsp;&nbsp;3级：9折&nbsp;&nbsp;&nbsp;4级：8.5折&nbsp;&nbsp;&nbsp;5级：8折
                  </p>
                </div>
                <button type="button" @click="saveMember">注册</button>
              </div>
            </form>
          </div>
          <!-- 删除会员信息 -->
          <div>
            <table class="member_table l">
              <thead>
              <tr>
                <th width="150">用户名</th>
                <th width="150">手机号</th>
                <th width="150">邮箱</th>
                <th width="150">会员等级</th>
                <th width="50">操作</th>
              </tr>
              </thead>
              <tbody id="deleteTable">
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div id="deleteMember" class="member_search">
              <input type="text" placeholder="请输入手机号">
              <button @click="findDelMember">
                <i class="iconfont icon-sousuo"></i>
              </button>
            </div>
          </div>
          <!-- 更改会员信息 -->
          <div>
            <table class="member_table l">
              <thead>
              <tr>
                <th width="150">用户名</th>
                <th width="150">手机号</th>
                <th width="150">邮箱</th>
                <th width="150">会员等级</th>
                <th width="50">操作</th>
              </tr>
              </thead>
              <tbody id="modifyTable">
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div id="modifyMember" class="member_search">
              <input type="text" placeholder="请输入手机号">
              <button @click="findModMember">
                <i class="iconfont icon-sousuo"></i>
              </button>
            </div>
          </div>
          <!-- 查询会员信息 -->
          <div>
            <table class="member_table l">
              <thead>
              <tr>
                <th width="100">手机号</th>
<<<<<<< HEAD
<<<<<<< HEAD
                <th width="150">日期</th>
                <th width="150">菜品评价</th>
                <th width="200">消费记录</th>
                <th width="50">金额</th>
              </tr>
              </thead>
              <tbody id="billTable">
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div id="bill" class="member_search l">
              <input type="text" placeholder="请输入手机号">
              <button @click="findBill">
=======
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
                <th width="100">日期</th>
                <th width="200">菜品评价</th>
                <th width="200">消费记录</th>
                <th width="50">用户名</th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>15207074966</td>
                <td>2022.01.01</td>
                <td>好吃实惠！</td>
                <td>红烧肉</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.03</td>
                <td>好吃实惠！</td>
                <td>茄子炒肉</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.05</td>
                <td>好吃实惠！</td>
                <td>红烧排骨</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.07</td>
                <td>好吃实惠！</td>
                <td>剁椒鱼头</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.09</td>
                <td>好吃实惠！</td>
                <td>啤酒鸭</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.11</td>
                <td>好吃实惠！</td>
                <td>干锅牛腩</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.13</td>
                <td>好吃实惠！</td>
                <td>土豆烧鸡</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.15</td>
                <td>好吃实惠！</td>
                <td>黄豆鸡脚</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
                <td>曾子升</td>
<<<<<<< HEAD
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
                <td>曾子升</td>
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
<<<<<<< HEAD
=======
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
                <td>曾子升</td>
              </tr>
              <tr>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
                <td>曾子升</td>
              </tr>
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div class="member_search l">
              <input type="text" placeholder="请输入手机号">
              <button>
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
                <i class="iconfont icon-sousuo"></i>
              </button>
            </div>
          </div>
        </div>
      </section>
    </section>
  </main>
</template>

<script>
import request from "../../../utils/request";
import axios from "axios";

export default {
  name: '',
  mounted: function () {
    this.change();
    this.test();
  },
  methods: {
<<<<<<< HEAD
<<<<<<< HEAD
    //查找会员账单
    findBill(){
      let oBill = document.getElementById("bill");
      let oBillTable = document.getElementById("billTable");
      let oInput = oBill.getElementsByTagName("input");
      let Phone = oInput[0].value;
      request.get('/bill/selectBillBybillPhone/' + Phone).then(function (result) {
        let arr = result.data;
        let str = `<tr>
                    <td>${arr.phone}</td>
                    <td>${arr.time}</td>
                    <td>${arr.report}</td>
                    <td>${arr.foods}</td>
                    <td>${arr.money}</td>
                  </tr>`;
        oBillTable.innerHTML = str;
      }).catch(function (msg) {
        // alert(msg);
        alert("查询失败，未查询到此手机号的会员")
      });
    },
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
    //查找会员，并且把会员添加到更改会员信息的列表
    findModMember() {
      let oMod = document.getElementById("modifyMember");
      let oModTable = document.getElementById("modifyTable");
      let oInput = oMod.getElementsByTagName("input");
      let Phone = oInput[0].value;
<<<<<<< HEAD
<<<<<<< HEAD
      request.get('/member/selectMemberBymemberPhone/' + Phone).then(function (result) {
=======
      request.get('/member/selectMemberByMemberPhone/' + Phone).then(function (result) {
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
      request.get('/member/selectMemberByMemberPhone/' + Phone).then(function (result) {
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
        let arr = result.data;
        let str = `<tr>
                    <td>${arr.name}</td>
                    <td>${arr.phone}</td>
                    <td>${arr.email}</td>
                    <td>
                        <input type="text" placeholder="${arr.rank}" style="width: 70%">
                    </td>
                    <td style="text-indent: 0px">
                        <button style="height: 30px;width: 100%; border: none;background: white;cursor: pointer;">更改</button>
                    </td>
                  </tr>`;
        oModTable.innerHTML = str;
      }).catch(function (msg) {
        // alert(msg);
        alert("查询失败，未查询到此手机号的会员")
      });
    },
    //查找会员，并且把会员添加到删除会员的列表
    findDelMember() {
      let oDel = document.getElementById("deleteMember");
      let oDelTable = document.getElementById("deleteTable");
      let oInput = oDel.getElementsByTagName("input");
      let Phone = oInput[0].value;
      request.get('/member/selectMemberByMemberPhone/' + Phone).then(function (result) {
        let arr = result.data;
        let str = `<tr>
                    <td>${arr.name}</td>
                    <td>${arr.phone}</td>
                    <td>${arr.email}</td>
                    <td>${arr.rank}</td>
                    <td  style="text-indent: 0px">
                        <button style="height: 30px;width: 100%;border: none;background: white;cursor: pointer;">删除</button>
                    </td>
                  </tr>`;
        oDelTable.innerHTML = str;
      }).catch(function (msg) {
        // alert(msg);
        alert("查询失败，未查询到此手机号的会员")
      });
    },
    //添加会员
    saveMember() {
      let oAdd = document.getElementById("add");
      let aInputs = oAdd.getElementsByTagName("input");
      let data = {
        name: aInputs[0].value,
        phone: aInputs[1].value,
        email: aInputs[2].value,
        password: aInputs[3].value,
        rank: 5
      };
      if (!data.name){
        alert("用户名不能为空");
        return false;
      }
      if (!data.phone){
        alert("手机号不能为空");
        return false;
      }
      if (!data.email){
        alert("邮箱不能为空");
        return false;
      }
      if (!data.password){
        alert("密码不能为空");
        return false;
      }
<<<<<<< HEAD
<<<<<<< HEAD
      request.get('/member/selectMemberBymemberPhone/' + data.phone).then(function (result) {
=======
      request.get('/member/selectMemberByMemberPhone/' + data.phone).then(function (result) {
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
      request.get('/member/selectMemberByMemberPhone/' + data.phone).then(function (result) {
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
        alert("对不起，该号码已被注册");
      }).catch(function (msg) {
        request.post('/member/createMember', data).then(function (result) {
          alert("注册成功");
        }).catch(function (meg) {
          alert("注册失败");
          return false;
        });
      });

    },
    //添加会员验证
    test() {
      // 添加失去焦点事件
      // 手机号验证
      let oAdd = document.getElementById("add");
      let aInputs = oAdd.getElementsByTagName("input");
      let oText1 = document.getElementById("phone_text");
      let oText2 = document.getElementById("email_text");
      let ifPhone = false;
      let ifEmail = false;

      // 添加失去焦点事件
      // 手机号验证
      aInputs[1].onblur = function () {
        let oValue1 = aInputs[1].value;

        if (!/^1\d{10}$/.test(oValue1)) {
          oText1.innerHTML = "* 手机号有误！";
          oText1.style.color = "red";
        } else {
          oText1.innerHTML = "* 该手机号可注册√";
          oText1.style.color = "green";
        }
      }
      // 邮箱验证
      aInputs[2].onblur = function () {
        let oValue2 = aInputs[2].value;
<<<<<<< HEAD
<<<<<<< HEAD
        let reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");
        if (!reg.test(oValue2)) {
=======

        if (oValue2.length < 5) {
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======

        if (oValue2.length < 5) {
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
          oText2.innerHTML = "* 邮箱地址有误！";
          oText2.style.color = "red";
        } else {
          oText2.innerHTML = "* 该邮箱可注册√";
          oText2.style.color = "green";
        }
      }
    },
    //转换页面
    change() {
      let oDiv1 = document.getElementById("projectList_btns");
      let oDiv2 = document.getElementById("projectList_cons");
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
/* 简述 */
#projectTitle .projectTitle_text {
  margin: 10px 0 0 22px;
}

#projectTitle .projectTitle_text h2 {
  font-size: 24px;
  color: #333333;
  line-height: 25px;
}

#projectTitle .projectTitle_text p {
  font-size: 14px;
  line-height: 30px;
  margin: 5px 0 5px 0;
}

#projectTitle .projectTitle_text span {
  color: #999999;
}

#projectTitle .projectTitle_img {
  margin: 20px 20px 0 0;
}

#projectTitle .projectTitle_img img {
  width: 300px;
  height: 120px;
}

/* 选项 */
#projectList #projectList_btns {
  height: 40px;
  background: #f9f9f9;
  border-top: 1px #A4A4A4 solid;
  border-bottom: 0.5px #A4A4A4 solid;
}

#projectList #projectList_btns ul {
  margin: 5px 0 0 20px;
}

#projectList #projectList_btns li {
  float: left;
  width: 140px;
  height: 34px;
  border: 1px solid #A4A4A4;
  border-bottom: none;
  background: white;
  color: #666666;
  text-align: center;
  line-height: 39px;
  margin-right: 12px;
  border-radius: 5px 5px 0 0;
  cursor: pointer;
}

#projectList #projectList_btns li.active {
  color: white;
  background: #D80C1C;
}

/* 内容显示 */
#projectList #projectList_cons {
  margin: 15px 0 0 20px;
}

#projectList #projectList_cons > div {
  display: none;
}

/* 添加 */
#projectList .member_add {
  font-size: 14px;
  margin: 32px 0 0 100px;
}

#projectList .member_add input {
  margin-bottom: 20px;
}

#projectList .member_add p {
  margin-left: 20px;
}

#projectList .member_add button {
  width: 100px;
  height: 30px;
  margin: 30px 80px;
  cursor: pointer;
}

#projectList .member_add .label input {
  display: block;
  float: left;
  margin-left: 50px;
  margin-top: 10px;
}

/* 搜索框样式 */
#projectList .member_search {
  width: 230px;
  height: 30px;
  border: 1px solid #A4A4A4;
  border-radius: 5px;
  overflow: hidden;
  margin-right: 20px;
}

#projectList .member_search input {
  border: none;
  width: 193px;
  height: 100%;
  font-size: 14px;
  color: #999999;
  text-indent: 9px;
  position: relative;
  top: -2px;
  outline: none;
}

#projectList .member_search button {
  width: 32px;
  height: 32px;
  border: none;
  border-left: 1px solid #A4A4A4;
  background: #f9f9f9;
  cursor: pointer;
}

#projectList .member_search i {
  font-size: 18px;
  font-weight: bold;
  color: #A4A4A4;
}

/* 展示列表 */
#projectList .member_table {
  margin: 0 20px 0 10px;
  width: calc(100% - 282px);
  border: 1px #A4A4A4 solid;
  font-size: 14px;
  border-collapse: collapse;
}

#projectList .member_table tr {
  height: 32px;
  border-bottom: 1px solid #A4A4A4;
}

#projectList .member_table th {
  border-right: 1px solid #A4A4A4;
  color: #666666;
  font-weight: normal;
  text-align: left;
  text-indent: 12px;
  background: #f9f9f9;
}

#projectList .member_table tr input:hover {
  cursor: pointer;
}

#projectList .member_table tbody {
  height: 32px;
  text-indent: 12px;
}

#add span {
  margin-left: 10px;
}
</style>
