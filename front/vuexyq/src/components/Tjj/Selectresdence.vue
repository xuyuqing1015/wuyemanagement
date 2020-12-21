<template>
  <div>
    <h3>我是查看住宅的页面</h3>
    <el-table :data="tableData1" border style="width: 100%">
      <el-table-column prop="trbh" label="住宅编号"></el-table-column>
      <el-table-column prop="trname" label="住宅名称"></el-table-column>
      <el-table-column prop="traddress" label="地址"></el-table-column>
      <el-table-column label="操作"></el-table-column>
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
    init() {},
  },
  created() {},
};
</script>

<style scoped>
</style>