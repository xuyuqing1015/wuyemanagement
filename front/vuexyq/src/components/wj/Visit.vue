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
          label="来访人"
          width="100px">
        </el-table-column>
        <el-table-column
          prop="owsex"
          label="来访时间"
          width="100px">
        </el-table-column>
        <el-table-column
          prop="date"
          label="离开时间">
        </el-table-column>
        <el-table-column
          prop="date"
          label="被访人">
        </el-table-column>
        <el-table-column
          prop="date"
          label="所住单元">
        </el-table-column>
        <el-table-column
          prop="date"
          label="来访事由">
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