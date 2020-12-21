<template>
  <div>
    <div style="height: 50px;">
      <el-select v-model="loupan" filterable placeholder="请选择楼盘">
<!--        <el-option-->
<!--          v-for="item in options"-->
<!--          :key="item.value"-->
<!--          :label="item.label"-->
<!--          :value="item.value">-->
<!--        </el-option>-->
      </el-select>
      <el-button type="success" plain icon="el-icon-search"></el-button>
      <el-button type="success" plain icon="el-icon-plus">录入业主信息</el-button>
      <el-button type="success" plain>高级搜索</el-button>
    </div>
    <div>
      <el-table
        :data="tableData"
        size="mini"
        height="250"
        border
        style="width: 100%">
        <el-table-column
          prop="owid"
          width="60px">
        </el-table-column>
<!--        <el-table-column-->
<!--          prop="date"-->
<!--          label="所属楼盘"-->
<!--          width="200px">-->
<!--          <template slot-scope="x">-->
<!--            <span v-if="x.row.houses.length!=0">-->
<!--              {{x.row.houses[0].troom.tunit.tfloor.tresidence}}-->
<!--            </span>-->
<!--          </template>-->
<!--        </el-table-column>-->
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
          prop="owbirthday"
          label="出生日期"
          width="120px">
        </el-table-column>
        <el-table-column
          prop="owcenumber"
          label="证件号码">
        </el-table-column>
        <el-table-column
          prop="owphone"
          label="手机号码"
          width="140px">
        </el-table-column>
        <el-table-column
          prop="owstate"
          label="状态"
          width="70px">
          <template slot-scope="x">
            <el-tag  type="success" v-if="x.row.owstate==1">正常</el-tag>
            <el-tag type="danger" v-else>停用</el-tag>
          </template>
        </el-table-column>
        <el-table-column
          prop="date"
          label="操作">
          <template slot-scope="x">
            <span>房产信息<a style="margin-left: 10px;">({{x.row.houses.length}})</a></span>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="current"
        :page-sizes="[1, 2, 3, 4 ,5]"
        :page-size="pageSize"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total"
        background>
      </el-pagination>
    </div>
    <el-dialog title="录入业主信息" :visible.sync="lryzxx">
      <el-form :model="form">
        <el-form-item label="活动名称" :label-width="formLabelWidth">
          <el-input v-model="form.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="活动区域" :label-width="formLabelWidth">
          <el-select v-model="form.region" placeholder="请选择活动区域">
            <el-option label="区域一" value="shanghai"></el-option>
            <el-option label="区域二" value="beijing"></el-option>
          </el-select>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
    export default {
        name: "Owners",
      data() {
        return {
          // 录入业主信息弹窗状态
          lryzxx:false,
          // 根据楼盘搜索业主
          loupan:'',
          //分页
          total:0,
          current:1,
          pageSize:5,
          tableData:[],//数据显示
        }
      },methods:{
          // 切换页面
        handleCurrentChange(pagerindex){
          this.current = pagerindex;
          this.loadData()
        },
        handleSizeChange(pagesize){
          this.pageSize=pagesize;
          this.loadData()
        },
        //数据显示
        loadData(){
          //向后台请求数据
          let param = {
            no:this.current,
            size:this.pageSize
          }
          this.$axios.post("owners/pager",param)
            .then((r)=>{
              if(r.status == 200){
                console.log(r.data.list)
                this.tableData = r.data.list;
                this.total = r.data.total;
              }
            })
        },
      },created() {
          this.loadData();
      }
    }
</script>

<style scoped>

</style>
