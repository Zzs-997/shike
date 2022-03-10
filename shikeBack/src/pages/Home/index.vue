<template>
  <main id="main">
    <section class="main_container">
      <section id="projectTitle" class="clear">
        <div class="projectTitle_text l">
          <h2>欢迎来到食客后台管理系统</h2>
          <p>
            (1)会员的增删改功能：店员可以对会员信息进行增删改操作。<br>
            (2)会员折扣的管理、消费的查询等：店员可以调整不同级别会员的折扣力度，并且可以查询会员的消费记录。<br>
            (3)更换今日菜品：店员根据今日上架的菜品，调整菜品信息。<br>
            (4)添加菜品选项：店员添加新上新的菜品选项。<br>
            (5)删除菜品选项：店员删除不再需要的菜品选项。<br>
            (6)设置菜品价格：店员重新设置菜品价格。
          </p>
        </div>
        <div class="projectTitle_img r">
          <img src="./images/logo.png" alt="">
        </div>
      </section>
    </section>
  </main>
</template>

<script>
export default {
  name: '',
}
</script>

<style scoped>
/* 简述 */
#projectTitle .projectTitle_text {
  margin: 20px 0 0 20px;
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
</style>
