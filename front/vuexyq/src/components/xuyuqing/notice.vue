<template>
	<div>
		<el-row style="text-align:left;">
			<el-button><i class="fa fa-plus" style="margin-right:5px"></i>新增</el-button>
			<el-button><i class="fa fa-cloud-upload" style="margin-right:5px"></i>发布</el-button>
			<el-button><i class="fa fa-stop-circle" style="margin-right:5px"></i>暂停</el-button>
		</el-row>
		              
		<el-table
		    ref="multipleTable"
		    :data="tableData"
		    tooltip-effect="dark"
		    style="width: 100%;margin-top:20px"
		    @selection-change="handleSelectionChange">
		    <el-table-column
		      type="selection"
		      width="55">
		    </el-table-column>
		    <el-table-column lable="ID" ></el-table-column>
		  </el-table>
		  
		  <!-- 分页-->
		   <el-pagination
		        @size-change="handleSizeChange"
		        @current-change="handleCurrentChange"
		        :current-page="current"
		        :page-sizes="[4, 5, 6, 7]"
		        :page-size="pageSize"
		        layout="total, sizes, prev, pager, next, jumper"
		        :total="total">
		      </el-pagination>
	</div>
</template>

<script>
	export default {
	      data() {
	        return {
				current:4,
				pageSize:1,
				total:0,
	             tableData: [],
				multipleSelection: []
	        }
	      },
		  methods: {
		       handleSelectionChange(val) {
		         this.multipleSelection = val;
		       },
			    handleSizeChange(val) {
				   console.log(`每页 ${val} 条`);
				 },
				 handleCurrentChange(val) {
				   console.log(`当前页: ${val}`);
				 },
				 getlist(){
					 let param = {
						 current:this.current,
						 pageSize:this.pageSize
					 };
					 this.$axios.post('notice1221/selectall',this.$qs.stringify(param))
					 .then(r=>{
						 this.tableData=r.data.vo.list;
						 this.total = r.data.vo.total;
						 console.log("list",r);
					 })
				 }
		     },created(){
				 this.getlist();
			 }
			 
	    }
</script>

<style>
</style>
