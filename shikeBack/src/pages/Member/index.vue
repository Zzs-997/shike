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
              <div class="member_add l">
                用户名：
                <input type="text" placeholder="用户名">
                <br>
                手机号：
                <input type="text" placeholder="手机号">
                <br>
                邮箱：
                <input type="text" placeholder="邮箱">
                <br>
                <div class="clear">
                  <span class="l">密码：</span>
                  <input class="l" type="password" placeholder="密码">
                  <p class="l">
                    * 密码由8-16位字符（字母、数字、_@#.特殊字符）组成!
                  </p>
                </div>
                <div class="clear">
                  <span class="l">会员等级：</span>
                  <input class="l" type="text" placeholder="会员等级">
                  <p class="l">
                    *会员分为1~5级&nbsp;&nbsp;&nbsp;1级：9.8折&nbsp;&nbsp;&nbsp;2级：9.5折&nbsp;&nbsp;&nbsp;3级：9折&nbsp;&nbsp;&nbsp;4级：8.5折&nbsp;&nbsp;&nbsp;5级：8折
                  </p>
                </div>
                <label class="label">
                  <input type="submit">
                  <input type="reset">
                </label>
              </div>
            </form>
          </div>
          <!-- 删除会员信息 -->
          <div>
            <table class="member_table l">
              <thead>
              <tr>
                <th width="49"><input type="checkbox" disabled></th>
                <th width="150">用户名</th>
                <th width="150">手机号</th>
                <th width="150">邮箱</th>
                <th width="150">会员等级</th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td><input type="checkbox"></td>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>zeng.zs@outlook.com</td>
                <td>5级</td>
              </tr>
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div class="member_search">
              <input type="text" placeholder="请输入关键字">
              <button>
                <i class="iconfont icon-sousuo"></i>
              </button>
            </div>
            <div class="member_btns r">
              <button>删除</button>
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
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>zeng.zs@outlook.com</td>
                <td><input type="text" placeholder="5级"></td>
              </tr>
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div class="member_search">
              <input type="text" placeholder="请输入关键字">
              <button>
                <i class="iconfont icon-sousuo"></i>
              </button>
            </div>
            <div class="member_btns r">
              <button>修改</button>
            </div>
          </div>
          <!-- 查询会员信息 -->
          <div>
            <table class="member_table l">
              <thead>
              <tr>
                <th width="150">用户名</th>
                <th width="150">手机号</th>
                <th width="150">日期</th>
                <th>菜品评价</th>
                <th>消费记录</th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>2022.01.01</td>
                <td>好吃实惠！</td>
                <td>红烧肉</td>
              </tr>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>2022.01.03</td>
                <td>好吃实惠！</td>
                <td>茄子炒肉</td>
              </tr>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>2022.01.05</td>
                <td>好吃实惠！</td>
                <td>红烧排骨</td>
              </tr>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>2022.01.07</td>
                <td>好吃实惠！</td>
                <td>剁椒鱼头</td>
              </tr>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>2022.01.09</td>
                <td>好吃实惠！</td>
                <td>啤酒鸭</td>
              </tr>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>2022.01.11</td>
                <td>好吃实惠！</td>
                <td>干锅牛腩</td>
              </tr>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>2022.01.13</td>
                <td>好吃实惠！</td>
                <td>土豆烧鸡</td>
              </tr>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>2022.01.15</td>
                <td>好吃实惠！</td>
                <td>黄豆鸡脚</td>
              </tr>
              <tr>
                <td>曾子升</td>
                <td>15207074966</td>
                <td>2022.01.20</td>
                <td>好吃实惠！</td>
                <td>鱼香肉丝</td>
              </tr>
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div class="member_search l">
              <input type="text" placeholder="请输入关键字">
              <button>
                <i class="iconfont icon-sousuo"></i>
              </button>
            </div>
            <div class="member_page l">
              <a href="#">共12条</a>
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
      </section>
    </section>
  </main>
</template>

<script>
export default {
  name: '',
  mounted() {
    this.change();
  },
  methods:{
    change () {
      var oDiv1 = document.getElementById("projectList_btns");
      var oDiv2 = document.getElementById("projectList_cons");
      var aLis = oDiv1.getElementsByTagName("li");
      var aDivs = oDiv2.children;
      // 给每一个按钮添加点击函数
      for (var i = 0; i < aLis.length; i++) {
        // 拿到当前按钮的下标
        aLis[i].index = i;
        aLis[i].onclick = function () {
          // 取消所有按钮的样式
          for (var j = 0; j < aLis.length; j++) {
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

#projectList .member_add .label {
  width: 200px;
  margin-left: 100px;
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

/* 添加、删除按钮 */
#projectList .member_btns button {
  width: 60px;
  height: 40px;
  background: white;
  border: 1px solid #A4A4A4;
  border-radius: 5px;
  position: relative;
  top: 150px;
  right: 100px;
}

#projectList .member_btns button:hover {
  cursor: pointer;
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

#projectList .member_table th:first-child,
#projectList .member_table td:first-child {
  text-align: center;
  text-indent: 0;
}

#projectList .member_table tr input:hover {
  cursor: pointer;
}

#projectList .member_table td {
  text-indent: 12px;
}

/* 换页 */
#projectList .member_page {
  font-size: 0;
  line-height: 24px;
  margin: 15px 48px 0 0;
}

#projectList .member_page a {
  border: 1px #A4A4A4 solid;
  padding: 6px 9px;
  font-size: 12px;
  margin-left: 10px;
}

#projectList .member_page a.active {
  background: #D80C1C;
  color: white;
}
</style>
