<template>
  <div id="introduction" class="container">
    <div class="area_title">
      <h2>食客简介</h2>
      <p>DINER PROFILE</p>
    </div>
    <dl>
      <dt class="l">
        <img src="./images/logo.png" alt="" width="200px" height="200px">
      </dt>
      <dd class="l">
        <ul class="introduction_list">
          <li>
            <div class="introduction_num l">
              <i>01</i>
              <span>One</span>
            </div>
            <div class="introduction_text l">
              <h3>食客使命</h3>
              <p>通过精心挑选的产品和创新的服务，为上班族
                <br>
                大众提供优质、快捷的餐饮服务。</p>
            </div>
          </li>
          <li>
            <div class="introduction_num l">
              <i>02</i>
              <span>Two</span>
            </div>
            <div class="introduction_text l">
              <h3>价值观</h3>
              <p>一个中心：双手改变命运
                <br>
                两个基本点：以顾客为中心，以“勤奋者”为本。</p>
            </div>
          </li>
          <li>
            <div class="introduction_num l">
              <i>03</i>
              <span>Three</span>
            </div>
            <div class="introduction_text l">
              <h3>内涵</h3>
              <p>学习进取，持续创新；
                与人为善，知恩图报；
                <br>
                自我批判，三思而行；
                诚实守信，敢于负责；
                <br>
              </p>
            </div>
          </li>
          <li>
            <div class="introduction_num l">
              <i>04</i>
              <span>Four</span>
            </div>
            <div class="introduction_text l">
              <h3>食客人品质</h3>
              <p>诚信、创新、谦虚、勤奋
                <br>
                激情、与人为善、责任感</p>
            </div>
          </li>
        </ul>
      </dd>
    </dl>
  </div>
</template>

<script>
export default {
  name: '',
}
</script>

<style scoped>
#introduction {
  min-height: 450px;
  overflow: hidden;
}

#introduction .area_title {
  margin-top: 65px;
}

#introduction dl {
  margin-top: 48px;
}

#introduction dt {
  width: 200px;
}

#introduction dd {
  width: 880px;
}

#introduction .introduction_list {
  width: 100%;
}

#introduction .introduction_list li {
  width: 50%;
  float: left;
  margin-bottom: 48px;
}

#introduction .introduction_num {
  width: 71px;
  height: 70px;
  border-right: 1px solid #6D6D6D;
  text-align: center;
}

#introduction .introduction_num i {
  color: #D80C1C;
  font-size: 39px;
  display: block;
  font-weight: bold;
}

#introduction .introduction_num span {
  color: #999999;
  font-size: 20px;
  line-height: 36px;
}

#introduction .introduction_text {
  width: 310px;
  margin-left: 20px;
}

#introduction .introduction_text h3 {
  font-size: 14px;
  color: #3F3F3F;
}

#introduction .introduction_text p {
  color: #A4A4A4;
  font-size: 12px;
  line-height: 21px;
  margin-top: 17px;
}
</style>
