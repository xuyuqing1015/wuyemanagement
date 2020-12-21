<template>
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
          prop="jccarno"
          label="车牌号"
          width="100px">
        </el-table-column>
        <el-table-column
          prop="owsex"
          label="车主姓名"
          width="100px">
        </el-table-column>
        <el-table-column
          prop="date"
          label="车位">
        </el-table-column>
        <el-table-column
          prop="date"
          label="入场时间">
        </el-table-column>
        <el-table-column
          prop="date"
          label="出场时间">
        </el-table-column>
        <el-table-column
          prop="date"
          label="值班人">
        </el-table-column>
        <el-table-column
          prop="date"
          label="操作">
        </el-table-column>
      </el-table>
  </div>
</template>

<script>
export default {
    data(){
        return{
            tableData:[],
        }
    },
    methods:{

    },
    created(){
        
    }

}
</script>

<style>

</style>