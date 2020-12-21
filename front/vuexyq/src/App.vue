<template>
  <div id="app">
<<<<<<< HEAD
    <el-container>
      <!--头部-->
      <el-header style="background-color: #42b983;height: 40px">
        <span style="font-size: 25px;color: white;margin-left: 40px">
          物业管理系统
        </span>
        <span style="float: right;padding-top: 10px">
          当前登录用户
        </span>
      </el-header>
      <el-container>
        <el-aside style="height: 625px;width: 65px;">
          <!--导航栏-->
          <el-menu default-active="1-4-1" class="el-menu-vertical-demo" :collapse="isCollapse" style="height: 624px;text-align: center">
            <el-menu-item index="2">
              <i class="fa fa-institution"></i>
              <span slot="title">
                首页
              </span>
            </el-menu-item>
            <el-submenu index="1">
              <template slot="title">
                <i class="el-icon-office-building"></i>
                <span slot="title">楼盘管理</span>
              </template>
              <el-menu-item index="1-1">
                <router-link to="/sres" tag="span">
                  新增住宅
                </router-link>
              </el-menu-item>
              <el-menu-item index="1-2">住宅维护</el-menu-item>
              <el-menu-item index="1-3">住宅查询</el-menu-item>
            </el-submenu>
            <el-submenu index="2">
              <template slot="title">
                <i class="el-icon-user"></i>
                <span slot="title">业主管理</span>
              </template>
              <el-menu-item index="2-1"><router-link to="/owners" tag="span">业主信息</router-link></el-menu-item>
              <el-menu-item index="2-2">业主验房</el-menu-item>
              <el-menu-item index="2-3">业主入住</el-menu-item>
              <el-menu-item index="2-4">请修管理</el-menu-item>
            </el-submenu>
            <el-submenu index="3">
              <template slot="title">
                <i class="fa fa-car"></i>
                <span slot="title">车位管理</span>
              </template>
                <el-menu-item index="3-1">车位信息</el-menu-item>
            </el-submenu>
            <el-submenu index="4">
              <template slot="title">
                <i class="fa fa-shield"></i>
                <span slot="title">安保管理</span>
              </template>
              <el-menu-item index="4-1"><router-link to="/carjc" tag="span">车辆进出</router-link></el-menu-item>
              <el-menu-item index="4-2"><router-link to="/zhiqin" tag="span">执勤管理</router-link></el-menu-item>
              <el-menu-item index="4-3"><router-link to="/visit" tag="span">来访管理</router-link></el-menu-item>
            </el-submenu>
            <el-submenu index="5">
              <template slot="title">
                <i class="fa fa-free-code-camp"></i>
                <span slot="title">社区消防</span>
              </template>
              <el-menu-item index="5-1">消防设施</el-menu-item>
              <el-menu-item index="5-2">消防巡查</el-menu-item>
              <el-menu-item index="5-3">消防演练</el-menu-item>
              <el-menu-item index="5-4">消防事故</el-menu-item>
            </el-submenu>
            <el-submenu index="6">
              <template slot="title">
                <i class="el-icon-message"></i>
                <span slot="title">行政管理</span>
              </template>
              <el-menu-item index="5-1"><router-link to="/notice" tag="span">公告管理</router-link></el-menu-item>
              <el-menu-item index="5-2">规章制度</el-menu-item>
              <el-menu-item index="5-3">意见箱设置</el-menu-item>
              <el-menu-item index="5-4">员工通讯录</el-menu-item>
            </el-submenu>
          </el-menu>
        </el-aside>
        <el-main>
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
=======
    <router-view/>
>>>>>>> 4eefcc1c386ff0d27ae6424634dd95cd036b966e
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      isCollapse: true
    };
  },
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    }
  }
}
</script>

<style>

#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

  *{
    margin: 0px;
    padding: 0px;
  }
  .el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    min-height: 400px;
  }
</style>
