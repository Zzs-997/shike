<template>
  <div class="hero">
    <div class="form-box">
      <div class="title-box">
        <div id="back"></div>
        <div class="toggle-title">食客后台登录</div>
      </div>
      <form id="login" class="input-group">
        <input type="text" class="input-field" placeholder="用户名" required>
        <input type="password" class="input-field" placeholder="密码" required>
        <input type="checkbox" class="check-box"><span>记住密码</span>
        <button type="button" class="submit-btn" @click="submit">登录</button>
      </form>
    </div>
  </div>
</template>


<script>
export default {
  name: '',
  mounted() {
    this.write();
  },
  methods: {
    write() {
      let oLogin = document.getElementById("login");
      let oInputs = oLogin.getElementsByTagName("input");
      if (this.cookie("name") && this.cookie("password")) {
        oInputs[0].value = this.cookie("name");
        oInputs[1].value = this.cookie("password");
      }
    },
    submit() {
      let oLogin = document.getElementById("login");
      let oInputs = oLogin.getElementsByTagName("input");
      let form = {
        name: oInputs[0].value,
        password: oInputs[1].value
      };
      if (!form.name) {
        alert("用户名不能为空")
        return false;
      }
      if (!form.password) {
        alert("密码不能为空")
        return false;
      }
      if (form.name == "zzs" && form.password == "123456") {
        // request.post('/login', form).then(res => {
        //   this.$router.push("/Home");
        // });
        if (oInputs[2].checked == true) {
          this.cookie("name", form.name, {
            expires: 1
          });
          this.cookie("password", form.password, {
            expires: 1
          });
        }
        this.$router.push("/Home");
<<<<<<< HEAD
<<<<<<< HEAD
      }else{
        alert("用户名或密码错误");
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
=======
>>>>>>> 5f2dcaed47705f8fc4f22c44f454323bd15b5c3f
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
  background: url(./images/background.png) top;
  background-size: cover;
  position: absolute;
}

.form-box {
  width: 380px;
  height: 480px;
  position: relative;
  margin: 6% auto;
  background: #fff;
  overflow: hidden;
}

.title-box {
  width: 320px;
  margin: 30px auto;
  position: relative;
  box-shadow: 0 0 20px 9px #ff61241f;
  border-radius: 30px;
}

.toggle-title {
  width: 100%;
  padding: 10px 0;
  background: transparent;
  border: 0;
  outline: none;
  position: relative;
  text-align: center;
}

#back {
  top: 0;
  left: 0;
  position: absolute;
  width: 100%;
  height: 100%;
  background: linear-gradient(to right, #ff105f, #ffad06);
  border-radius: 10px;
}

.input-group {
  top: 160px;
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
  margin: 30px 10px 30px 0;
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
</style>
