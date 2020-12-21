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
          prop="owname"
          label="执勤日期"
          width="100px">
        </el-table-column>
        <el-table-column
          prop="owsex"
          label="执勤类型"
          width="100px">
        </el-table-column>
        <el-table-column
          prop="date"
          label="执勤地点">
        </el-table-column>
        <el-table-column
          prop="date"
          label="执勤人员">
        </el-table-column>
        <el-table-column
          prop="date"
          label="执勤记录">
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