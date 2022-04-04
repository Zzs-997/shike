<template>
  <div id="table" class="container-fluid">
    <div id="wechat_pay">
      <img src="./images/微信支付码.jpg">
      <p>您是<span id="pay_rank"></span>级会员，可享受<span id="pay_discount"></span>折优惠<br>请支付<span id="pay_num">0</span>元</p>
      <button id="pay_true" @click="pay_true">支付完成</button>
      <button id="pay_false" @click="pay_false">取消支付</button>
    </div>
    <table class="food_table">
      <thead>
      <tr>
        <th width="200">菜品名称
        </th>
        <th width="250">菜品图片
        </th>
        <th width="100">菜品价格
        </th>
        <th>菜品描述
        </th>
        <th width="200">数量
        </th>
        <th width="150">小计
        </th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td>麻婆豆腐</td>
        <td>
          <img src="./images/麻婆豆腐.jpg" alt="">
        </td>
        <td class="oneprice">6.88</td>
        <td>豆腐；麻辣</td>
        <td class="number">
          <span class="down">-</span>
          <span class="num">0</span>
          <span class="add">+</span>
        </td>
        <td class="price">0</td>
      </tr>
      <tr>
        <td>手撕包菜</td>
        <td>
          <img src="./images/手撕包菜.jpeg" alt="">
        </td>
        <td class="oneprice">12</td>
        <td>包菜；素；热；酸辣</td>
        <td class="number">
          <span class="down">-</span>
          <span class="num">0</span>
          <span class="add">+</span>
        </td>
        <td class="price">0</td>
      </tr>
      <tr>
        <td>茄子炒肉</td>
        <td>
          <img src="./images/茄子炒肉.jpg" alt="">
        </td>
        <td class="oneprice">15</td>
        <td>茄子、猪肉；香味</td>
        <td class="number">
          <span class="down">-</span>
          <span class="num">0</span>
          <span class="add">+</span>
        </td>
        <td class="price">0</td>
      </tr>
      <tr>
        <td>西红柿炒蛋</td>
        <td>
          <img src="./images/西红柿炒蛋.jpeg" alt="">
        </td>
        <td class="oneprice">10</td>
        <td>鸡蛋、西红柿；荤；热；不辣</td>
        <td class="number">
          <span class="down">-</span>
          <span class="num">0</span>
          <span class="add">+</span>
        </td>
        <td class="price">0</td>
      </tr>
      <tr>
        <td>小炒牛肉</td>
        <td>
          <img src="./images/小炒牛肉.jpeg" alt="">
        </td>
        <td class="oneprice">19.6</td>
        <td>牛肉、辣椒；荤；热；辣</td>
        <td class="number">
          <span class="down">-</span>
          <span class="num">0</span>
          <span class="add">+</span>
        </td>
        <td class="price">0</td>
      </tr>
      </tbody>
    </table>
    <div class="allprice">
      <button @click="pay">结账</button>
      <p>合计<span class="total_price">0</span>元</p>
      <p>已选中菜品<span class="total_num">0</span>种</p>
    </div>
  </div>
</template>

<script>
import request from "../../../../utils/request";

export default {
  name: 'Table',
  mounted() {
    this.Shop()
  },
  methods: {
    //支付成功
    pay_true() {
      alert("祝你用餐愉快");
      this.$router.go(0);
    },
    //取消支付
    pay_false() {
      let oWecharPay = document.getElementById("wechat_pay");
      oWecharPay.style.display = "none";
    },
    pay() {
      //折扣
      let discount = {
        5: 9.8,
        4: 9.5,
        3: 9,
        2: 8.5,
        1: 8
      }
      if (this.cookie("phone")) {
        let oWecharPay = document.getElementById("wechat_pay");
        let oPay_rank = document.getElementById("pay_rank");
        let oPay_discount = document.getElementById("pay_discount");
        let oPay_num = document.getElementById("pay_num");
        let oTotalPrice = document.querySelector(".total_price");
        oWecharPay.style.display = "block";
        //  获得会员等级并更新支付页面
        if (this.cookie("phone")) {
          request.get('/member/selectMemberBymemberPhone/' + this.cookie("phone")).then(function (result) {
            let arr = result.data;
            oPay_rank.innerHTML = arr.rank;
            oPay_discount.innerHTML = discount[arr.rank];
            oPay_num.innerHTML = (parseInt(oTotalPrice.innerHTML)*discount[arr.rank]*0.1).toFixed(2);
          });
        }
      } else {
        alert("请先登录");
        this.$router.push("/Login");
      }
    },
    Shop() {
      // 获取全部元素数组
      let aAdd = document.querySelectorAll(".add");
      let aDown = document.querySelectorAll(".down");
      let aNum = document.querySelectorAll(".num");
      let aPrice = document.querySelectorAll(".price");
      // 获取单个元素
      let oTotalNum = document.querySelector(".total_num");
      let oTotalPrice = document.querySelector(".total_price");

      let len = aNum.length; //4
      /*
          在开发过程中 数据来源于后台数据库
          前端只是先获取了后台给我们的数据之后，对应渲染HTML页面
       */
      /*
         假装我们获取了后台的数据
       */
      //菜品单价和数量
      let data = [
        {dj: 6.88, number: 0},
        {dj: 12, number: 0},
        {dj: 15, number: 0},
        {dj: 10, number: 0},
        {dj: 19.6, number: 0},
      ];
      for (let i = 0; i < len; i++) {
        aAdd[i].onclick = function () {
          //操作数据
          data[i].number++;
          //渲染页面
          updateView(i);
        };
        aDown[i].onclick = function () {
          //操作数据
          if (data[i].number > 0) {
            data[i].number--;
            //渲染页面
            updateView(i);
          }
        };
      }
      //获取总数和总价的函数
      function getTotal() {
        // 总数
        let n = 0;
        // 总价
        let p = 0;
        for (let i = 0; i < len; i++) {
          n += data[i].number;
          p += data[i].number * data[i].dj;
        }
        return {
          totalNum: n,
          totalPrice: p
        }
      }
      // 更新页面数据
      function updateView(i) {
        aNum[i].innerHTML = data[i].number;
        aPrice[i].innerHTML = (data[i].number * data[i].dj).toFixed(2); // 保留两位小数
        oTotalNum.innerHTML = getTotal().totalNum;
        oTotalPrice.innerHTML = (getTotal().totalPrice).toFixed(2);
      }
    }
  }
}
</script>

<style scoped>
/*微信支付弹窗*/
#wechat_pay {
  position: absolute;
  left: 440px;
  margin-top: 54px;
  width: 650px;
  height: 512px;
  background: #23AC3A;
  display: none;
}

#wechat_pay img {
  position: absolute;
  left: 25px;
  top: 50px;
  width: 300px;
  height: 400px;
}

#wechat_pay p {
  position: absolute;
  left: 350px;
  top: 200px;
  color: white;
  text-align: center;
  line-height: 50px;
  font-size: 20px;
  font-weight: bold;
}

#wechat_pay span {
  color: #D80C1C;
  font-size: 22px;
}

#wechat_pay #pay_true {
  position: absolute;
  left: 350px;
  top: 375px;
  width: 100px;
  height: 50px;
  background: white;
  border: 1px solid #A4A4A4;
  border-radius: 10px;
  color: black;
  text-align: center;
  line-height: 50px;
  font-size: 20px;
  cursor: pointer;
}

#wechat_pay #pay_false {
  position: absolute;
  right: 25px;
  top: 375px;
  width: 100px;
  height: 50px;
  background: white;
  border: 1px solid #A4A4A4;
  border-radius: 10px;
  color: black;
  text-align: center;
  line-height: 50px;
  font-size: 20px;
  cursor: pointer;
}

/*购物车表*/
#table {
  background: #f8f8f8;
  min-height: 566px;
}

table {
  border-collapse: collapse;
  width: 100%;
  margin: 0 auto 0;
}

table td {
  border-bottom: 1px solid #3F3F3F;
}

table tr td {
  height: 80px;
  text-align: center;
}

table tr th {
  height: 54px;
  background-color: #D80C1C;
  color: #fff;
  font-weight: normal;
  font-size: 16px;
}

table tr td img {
  width: 120px;
  height: 72px;
  margin-left: 65px;
}

table tr td.number span {
  display: inline-block;
  font-size: 14px;
  text-align: center;
}

table tr td.number span.down, table tr td.number span.add {
  width: 30px;
  height: 30px;
  background-color: #ddd;
  font-weight: bold;
  font-size: 14px;
  line-height: 30px;
  cursor: pointer;
}

table tr td.number span.num {
  width: 50px;
  height: 30px;
  line-height: 30px;
  border-top: 1px solid #ddd;
  border-bottom: 1px solid #ddd;
  color: #D80C1C;
}


/* 总价 */
.allprice {
  width: 100%;
  height: 50px;
  margin: 20px auto;
}

.allprice p {
  float: right;
  width: 250px;
  height: 50px;
  line-height: 50px;
  color: #3F3F3F;
  font-weight: bold;
  font-size: 18px;
}

.allprice p span {
  margin: 0 5px;
  color: #D80C1C;
  font-size: 20px;
  font-weight: bold;
}

/* 结账 */
.allprice button {
  float: right;
  width: 100px;
  height: 50px;
  background: #D80C1C;
  border: 1px solid #A4A4A4;
  margin-right: 100px;
  margin-top: 5px;
  border-radius: 10px;
  color: white;
  text-align: center;
  line-height: 50px;
  font-size: 20px;
  cursor: pointer;
}
</style>
