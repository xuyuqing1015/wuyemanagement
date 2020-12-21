<template>
  <div>
    <div></div>
    <div>
      <el-table
        :data="tableData"
        size="mini"
        height="250"
        border
        style="width: 100%">
        <el-table-column
          prop="date"
          width="60px">
        </el-table-column>
        <el-table-column
          prop="date"
          label="所属楼盘"
          width="120px">
        </el-table-column>
        <el-table-column
          prop="owname"
          label="姓名"
          width="100px">
        </el-table-column>
        <el-table-column
          prop="owsex"
          label="性别"
          width="100px">
        </el-table-column>
        <el-table-column
          prop="date"
          label="出生日期">
        </el-table-column>
        <el-table-column
          prop="date"
          label="证件号码">
        </el-table-column>
        <el-table-column
          prop="date"
          label="手机号码">
        </el-table-column>
        <el-table-column
          prop="date"
          label="状态">
        </el-table-column>
        <el-table-column
          prop="date"
          label="操作">
        </el-table-column>
      </el-table>
    </div>
  </div>
</template>

<script>
    export default {
        name: "Owners",
      data() {
        return {
          tableData:[],//数据显示
        }
      }
    }
</script>

<style scoped>

</style>
