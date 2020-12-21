<template>
  <div>
    <h3>我是查看住宅的页面</h3>

    <el-table
      size="mini"
      :data="tableData1"
      border
      style="width: 100%;margin-top:20px"
      @cell-dblclick="selecttfloor"
    >
      <el-table-column prop="trbh" label="住宅编号" align="center"></el-table-column>
      <el-table-column prop="trname" label="住宅名称" align="center"></el-table-column>
      <el-table-column prop="traddress" label="地址" align="center"></el-table-column>
      <el-table-column label="住宅状态" align="center">
        <template slot-scope="s">
          <span v-if="s.row.trstate == 1">
            <el-tag type="success">可用</el-tag>
          </span>
          <span v-if="s.row.trstate == -1">
            <el-tag type="danger">已停用</el-tag>
          </span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center">
        <el-button type="text">停用</el-button>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      tableData1: [],
    };
  },
  methods: {
    init() {
      this.$axios.get("http://localhost:8888/re/reall").then((res) => {
        console.log(res);
        this.tableData1 = res.data.list;
      });
    },
    selecttfloor() {
      alert("您双击了表格");
    },
  },
  created() {
    this.init();
  },
};
</script>

<style scoped>
</style>