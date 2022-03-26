<template>
  <div id="map" class="container-fliud">
  </div>
</template>

<script>
export default {
  name: '',
  mounted() {
    var map = new BMapGL.Map("map");          // 创建地图实例
    var point = new BMapGL.Point(115.832777, 28.724024);  // 创建点坐标
    map.centerAndZoom(point, 15);                   // 初始化地图，设置中心点坐标和地图级别

    map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放

    var scaleCtrl = new BMapGL.ScaleControl();  // 添加比例尺控件
    map.addControl(scaleCtrl);

    var marker = new BMapGL.Marker(point);  // 创建标注
    map.addOverlay(marker);              // 将标注添加到地图中
    var opts = {
      width: 200,     // 信息窗口宽度
      height: 100,     // 信息窗口高度
      title: "食客", // 信息窗口标题
    }
    var infoWindow = new BMapGL.InfoWindow("地址：江西省南昌市青山湖区广兰大道418号西区食堂一楼", opts);  // 创建信息窗口对象
    marker.addEventListener("click", function () {
      map.openInfoWindow(infoWindow, point); //开启信息窗口
    });
  }
}
</script>

<style scoped>
html {
  height: 100%
}

body {
  height: 100%;
  margin: 0px;
  padding: 0px
}

#map {
  height: 512px;
  border-top: 54px solid #D80C1C;
}
</style>
