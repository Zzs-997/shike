<template>
  <main id="main">
    <section class="main_container">
      <section id="projectTitle" class="clear">
        <div class="projectTitle_text l">
          <h2>修改菜品信息</h2>
          <p>
            更换今日菜品：<span>根据今日上架的菜品，调整菜品选项</span>
            <br>
            添加菜品选项：<span>添加新上新的菜品选项</span>
            <br>
            删除菜品选项：<span>删除不再需要的菜品选项</span>
            <br>
            设置菜品价格：<span>重新设置菜品价格</span>
          </p>
        </div>
        <div class="projectTitle_img r">
          <img src="./images/logo.png" alt="">
        </div>
      </section>
      <section id="projectList">
        <div id="projectList_btns">
          <ul>
            <li class="active">更换今日菜品</li>
            <li>添加菜品选项</li>
            <li>删除菜品选项</li>
            <li>设置菜品价格</li>
          </ul>
        </div>
        <div id="projectList_cons">
          <!-- 更换今日菜品 -->
          <div style="display: block;">
            <table class="food_table l">
              <thead>
              <tr>
                <th width="50"></th>
                <th width="100">菜品名称</th>
                <th width="100">菜品价格</th>
                <th width="100">菜品图片</th>
                <th width="250">菜品描述</th>
                <th width="50"></th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td><input type="checkbox" disabled></td>
                <td>麻婆豆腐</td>
                <td>￥6.88</td>
                <td><img src="./images/麻婆豆腐.jpg" alt=""></td>
                <td>豆腐；麻辣</td>
                <td>
                  <button>添加</button>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" disabled></td>
                <td>手撕包菜</td>
                <td>￥12</td>
                <td><img src="./images/手撕包菜.jpeg" alt=""></td>
                <td>包菜；素；热；酸辣</td>
                <td>
                  <button>添加</button>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" disabled></td>
                <td>茄子炒肉</td>
                <td>￥15</td>
                <td><img src="./images/茄子炒肉.jpg" alt=""></td>
                <td>茄子、猪肉；香味</td>
                <td>
                  <button>添加</button>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" disabled></td>
                <td>西红柿炒蛋</td>
                <td>￥10</td>
                <td><img src="./images/西红柿炒蛋.jpeg" alt=""></td>
                <td>鸡蛋、西红柿；荤；热；不辣</td>
                <td>
                  <button>添加</button>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" disabled></td>
                <td>小炒牛肉</td>
                <td>￥19.6</td>
                <td><img src="./images/小炒牛肉.jpeg" alt=""></td>
                <td>牛肉、辣椒；荤；热；辣</td>
                <td>
                  <button>添加</button>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" disabled></td>
                <td>香辣猪舌头</td>
                <td>￥16.8</td>
                <td><img src="./images/香辣猪舌头.jpeg" alt=""></td>
                <td>猪舌头、辣椒；荤；热；中辣</td>
                <td>
                  <button>添加</button>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" disabled></td>
                <td>香辣猪舌头</td>
                <td>￥16.8</td>
                <td><img src="./images/香辣猪舌头.jpeg" alt=""></td>
                <td>猪舌头、辣椒；荤；热；中辣</td>
                <td>
                  <button>添加</button>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" disabled></td>
                <td>香辣猪舌头</td>
                <td>￥16.8</td>
                <td><img src="./images/香辣猪舌头.jpeg" alt=""></td>
                <td>猪舌头、辣椒；荤；热；中辣</td>
                <td>
                  <button>添加</button>
                  <button>删除</button>
                </td>
              </tr>
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div class="food_search l">
              <input type="text" placeholder="请输入关键字">
              <button>
                <i class="iconfont icon-sousuo"></i>
              </button>
            </div>
          </div>
          <!-- 添加菜品选项 -->
          <div>
            <table class="food_table l">
              <thead>
              <tr>
                <th width="100">菜品名称</th>
                <th width="100">菜品价格</th>
                <th width="100">菜品图片</th>
                <th width="300">菜品描述</th>
                <th width="50"></th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>麻婆豆腐</td>
                <td>￥6.88</td>
                <td><img src="./images/麻婆豆腐.jpg" alt=""></td>
                <td>豆腐；麻辣</td>
                <td></td>
              </tr>
              <tr>
                <td>手撕包菜</td>
                <td>￥12</td>
                <td><img src="./images/手撕包菜.jpeg" alt=""></td>
                <td>包菜；素；热；酸辣</td>
                <td></td>
              </tr>
              <tr>
                <td>茄子炒肉</td>
                <td>￥15</td>
                <td><img src="./images/茄子炒肉.jpg" alt=""></td>
                <td>茄子、猪肉；香味</td>
                <td></td>
              </tr>
              <tr>
                <td>西红柿炒蛋</td>
                <td>￥10</td>
                <td><img src="./images/西红柿炒蛋.jpeg" alt=""></td>
                <td>鸡蛋、西红柿；荤；热；不辣</td>
                <td></td>
              </tr>
              <tr>
                <td>小炒牛肉</td>
                <td>￥19.6</td>
                <td><img src="./images/小炒牛肉.jpeg" alt=""></td>
                <td>牛肉、辣椒；荤；热；辣</td>
                <td></td>
              </tr>
              </tbody>
            </table>
            <form action="#">
              <div class="food_upload l">
                菜品名称：
                <input type="text" placeholder="菜品名称">
                <br>
                菜品价格：
                <input type="text" placeholder="菜品价格">
                <br>
                菜品描述：
                <input type="text" placeholder="菜品描述">
                <br>
                <label class="label">
                  <input type="file" accept="image/png, image/jpeg, image/gif, image/jpg">
                  <i class="iconfont icon-yunshangchuan_o"></i>&nbsp;&nbsp;上传菜品图片
                </label>
                <br>
                <button>添加</button>
              </div>
            </form>
          </div>
          <!-- 删除菜品选项 -->
          <div>
            <table class="food_table l">
              <thead>
              <tr>
                <th width="100">菜品名称</th>
                <th width="100">菜品价格</th>
                <th width="100">菜品图片</th>
                <th width="300">菜品描述</th>
                <th width="50"></th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>麻婆豆腐</td>
                <td>￥6.88</td>
                <td><img src="./images/麻婆豆腐.jpg" alt=""></td>
                <td>豆腐；麻辣</td>
                <td>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td>手撕包菜</td>
                <td>￥12</td>
                <td><img src="./images/手撕包菜.jpeg" alt=""></td>
                <td>包菜；素；热；酸辣</td>
                <td>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td>茄子炒肉</td>
                <td>￥15</td>
                <td><img src="./images/茄子炒肉.jpg" alt=""></td>
                <td>茄子、猪肉；香味</td>
                <td>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td>西红柿炒蛋</td>
                <td>￥10</td>
                <td><img src="./images/西红柿炒蛋.jpeg" alt=""></td>
                <td>鸡蛋、西红柿；荤；热；不辣</td>
                <td>
                  <button>删除</button>
                </td>
              </tr>
              <tr>
                <td>小炒牛肉</td>
                <td>￥19.6</td>
                <td><img src="./images/小炒牛肉.jpeg" alt=""></td>
                <td>牛肉、辣椒；荤；热；辣</td>
                <td>
                  <button>删除</button>
                </td>
              </tr>
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div class="food_search l">
              <input type="text" placeholder="请输入关键字">
              <button>
                <i class="iconfont icon-sousuo"></i>
              </button>
            </div>
          </div>
          <!-- 设置菜品价格 -->
          <div>
            <table class="food_table l">
              <thead>
              <tr>
                <th width="100">菜品名称</th>
                <th width="100">菜品价格</th>
                <th width="100">菜品图片</th>
                <th width="300">菜品描述</th>
                <th width="50"></th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>麻婆豆腐</td>
                <td>￥<input type="text" placeholder="6.88"></td>
                <td><img src="./images/麻婆豆腐.jpg" alt=""></td>
                <td>豆腐；麻辣</td>
                <td>
                  <button>修改</button>
                </td>
              </tr>
              <tr>
                <td>手撕包菜</td>
                <td>￥<input type="text" placeholder="12"></td>
                <td><img src="./images/手撕包菜.jpeg" alt=""></td>
                <td>包菜；素；热；酸辣</td>
                <td>
                  <button>修改</button>
                </td>
              </tr>
              <tr>
                <td>茄子炒肉</td>
                <td>￥<input type="text" placeholder="15"></td>
                <td><img src="./images/茄子炒肉.jpg" alt=""></td>
                <td>茄子、猪肉；香味</td>
                <td>
                  <button>修改</button>
                </td>
              </tr>
              <tr>
                <td>西红柿炒蛋</td>
                <td>￥<input type="text" placeholder="10"></td>
                <td><img src="./images/西红柿炒蛋.jpeg" alt=""></td>
                <td>鸡蛋、西红柿；荤；热；不辣</td>
                <td>
                  <button>修改</button>
                </td>
              </tr>
              <tr>
                <td>小炒牛肉</td>
                <td>￥<input type="text" placeholder="19.6"></td>
                <td><img src="./images/小炒牛肉.jpeg" alt=""></td>
                <td>牛肉、辣椒；荤；热；辣</td>
                <td>
                  <button>修改</button>
                </td>
              </tr>
              </tbody>
            </table>
            <!-- 搜索框 -->
            <div class="food_search l">
              <input type="text" placeholder="请输入关键字">
              <button>
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
export default {
  name: '',
  mounted: function () {
    this.change()
  },
  methods: {
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
#projectList .food_upload {
  font-size: 14px;
  width: 250px;
  margin-top: 32px;
}

#projectList .food_upload input {
  margin-bottom: 20px;
}

#projectList .food_upload .label {
  display: block;
  width: 130px;
  height: 32px;
  line-height: 32px;
  text-align: center;
  color: #f9f9f9;
  background: #A4A4A4;
  border-radius: 10px;
  cursor: pointer;
  margin: 0 auto;
}

#projectList .food_upload .label i {
  font-size: 22px;
  position: relative;
  top: 3px;
  line-height: 22px;
}

#projectList .food_upload .label input {
  display: none;
}

#projectList .food_upload button {
  display: block;
  height: 30px;
  width: 100px;
  margin: 0 auto;
}

/* 搜索框样式 */
#projectList .food_search {
  width: 230px;
  height: 30px;
  border: 1px solid #A4A4A4;
  border-radius: 5px;
  overflow: hidden;
  margin-right: 20px;
}

#projectList .food_search input {
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

#projectList .food_search button {
  width: 32px;
  height: 32px;
  border: none;
  border-left: 1px solid #A4A4A4;
  background: #f9f9f9;
  cursor: pointer;
}

#projectList .food_search i {
  font-size: 18px;
  font-weight: bold;
  color: #A4A4A4;
}

#projectList .food_add button:hover {
  cursor: pointer;
}

/* 展示列表 */
#projectList .food_table {
  margin: 0 20px 0 10px;
  width: calc(100% - 282px);
  border: 1px #A4A4A4 solid;
  font-size: 14px;
  border-collapse: collapse;
}

#projectList .food_table tr {
  height: 54px;
  border-bottom: 1px solid #A4A4A4;
}

#projectList .food_table tr input {
  width: 50px;
}

#projectList .food_table tr input:hover {
  cursor: pointer;
}

#projectList .food_table thead tr {
  height: 32px;
}

#projectList .food_table th {
  border-right: 1px solid #A4A4A4;
  color: #666666;
  font-weight: normal;
  text-align: left;
  text-indent: 12px;
  background: #f9f9f9;
}

#projectList .food_table button {
  height: 30px;
  width: 35px;
  border: none;
  background: white;
  cursor: pointer;
}

#projectList .food_table th:first-child,
#projectList .food_table td:first-child,
#projectList .food_table td:last-child {
  text-align: center;
  text-indent: 0;
}

#projectList .food_table td {
  text-indent: 12px;
}

#projectList .food_table img {
  width: 85px;
  height: 51px;
  margin-left: 12px;
}

</style>
