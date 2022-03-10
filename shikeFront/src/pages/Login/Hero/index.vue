<template>
  <div class="hero">
    <div class="form-box">
      <div class="button-box">
        <div id="btn"></div>
        <button type="button" class="toggle-btn" v-on:click="login()">登录</button>
        <button type="button" class="toggle-btn" v-on:click="register()">注册</button>
      </div>
      <div id="login" class="input-group">
        <input type="text" class="input-field" name="phone" placeholder="手机号/邮箱">
        <input type="text" class="input-field" name="password" placeholder="密码">
        <input type="checkbox" class="check-box"><span>记住密码</span>
        <button id="login_btn" class="submit-btn">登录</button>
      </div>
      <div id="register" class="input-group">
        <input type="text" class="input-field" name="name" placeholder="用户名">
        <input id="phone" type="text" class="input-field" name="phone" placeholder="手机号">
        <div id="phone_text">请输入正确的手机号！</div>
        <input id="email" type="text" class="input-field" name="email" placeholder="邮箱">
        <div id="email_text">请输入正确的邮箱！</div>
        <input type="password" class="input-field" name="password" placeholder="密码">
        <input type="checkbox" class="check-box"><span>同意食客《用户协议》和《隐私协议》</span>
        <button id="register_btn" class="submit-btn">注册</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: '',
  mounted() {
    this.test();
  },
  methods: {
    login() {
      var x = document.getElementById("login");
      var y = document.getElementById("register");
      var z = document.getElementById("btn");
      x.style.left = "50px";
      y.style.left = "450px";
      z.style.left = "0px";
    },
    register() {
      var x = document.getElementById("login");
      var y = document.getElementById("register");
      var z = document.getElementById("btn");
      x.style.left = "-400px";
      y.style.left = "50px";
      z.style.left = "110px";
    },
    //验证
    test() {
      var oPhone = document.getElementById("phone");
      var oEmail = document.getElementById("email");
      var oText1 = document.getElementById("phone_text");
      var oText2 = document.getElementById("email_text");

      // 添加失去焦点事件
      // 手机号验证
      var oPhone = document.getElementById("phone");
      var oEmail = document.getElementById("email");
      var oText1 = document.getElementById("phone_text");
      var oText2 = document.getElementById("email_text");

      // 添加失去焦点事件
      // 手机号验证
      oPhone.onblur = function () {
        var oValue1 = oPhone.value;

        if (!/^1\d{10}$/.test(oValue1)) {
          oText1.innerHTML = "手机号有误！";
          oText1.style.color = "red";
        } else {
          oText1.innerHTML = "该手机号可注册√";
          oText1.style.color = "green";
        }
      }
      // 邮箱验证
      oEmail.onblur = function () {
        var oValue2 = oEmail.value;

        if (oValue2.length < 5) {
          oText2.innerHTML = "邮箱地址有误！";
          oText2.style.color = "red";
          // 判断首字符是否是字母
        } else {
          oText2.innerHTML = "该邮箱可注册√";
          oText2.style.color = "green";
        }
      }
    }
  }
}

</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
}

.hero {
  height: 100%;
  width: 100%;
  background: url(./images/background.png);
  background-position: top;
  background-size: cover;
  position: absolute;
}

.form-box {
  width: 380px;
  height: 480px;
  position: relative;
  margin: 6% auto;
  background: #fff;
  padding: 5px;
  overflow: hidden;
}

.button-box {
  width: 220px;
  margin: 35px auto;
  position: relative;
  box-shadow: 0 0 20px 9px #ff61241f;
  border-radius: 30px;
}

.toggle-btn {
  width: 48%;
  padding: 10px 30px;
  cursor: pointer;
  background: transparent;
  border: 0;
  outline: none;
  position: relative;

}

#btn {
  top: 0;
  left: 0;
  position: absolute;
  width: 110px;
  height: 100%;
  background: linear-gradient(to right, #ff105f, #ffad06);
  border-radius: 30px;
}

.input-group {
  position: absolute;
  width: 280px;
  transition: .5s;
}

.input-field {
  width: 100%;
  padding: 10px 0;
  margin: 5px 0;
  border-left: 0;
  border-top: 0;
  border-right: 0;
  border-bottom: 1px solid #999;
  background: transparent;
}

.submit-btn {
  width: 85%;
  padding: 10px 30px;
  cursor: pointer;
  display: block;
  margin: auto;
  background: linear-gradient(to right, #ff105f, #ffad06);
  border: 0;
  outline: none;
  border-radius: 30px;
}

.check-box {
  margin: 20px 10px 30px 0;
}

span {
  color: #777;
  font-size: 12px;
  bottom: 68px;
  position: absolute;
}

#login {
  left: 50px;
}

#register {
  left: 450px
}

#register div {
  color: #777;
  font-size: 12px;
}
</style>
