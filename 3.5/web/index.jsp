<%--
  Created by IntelliJ IDEA.
  User: 人道逍遥
  Date: 2023/4/20
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户综合管理软件</title>
  </head>
  <body>
  <button id="add">增加</button><br>
  <button id="delete">删除</button><br>
  <button id="update">修改</button><br>
  <button id="select">查询</button><br>


  <script>
  document.getElementById('add').addEventListener('click',function () {
    location.href="http://localhost:8080/3_5_/insert.jsp"
  })
  document.getElementById('delete').addEventListener('click',function () {
    location.href="http://localhost:8080/3_5_/dele.jsp"
  })
  document.getElementById('update').addEventListener('click',function () {
    location.href="http://localhost:8080/3_5_/update.jsp"
  })
  document.getElementById('select').addEventListener('click',function () {
    location.href="http://localhost:8080/3_5_/allShow.jsp"
  })

  </script>
  </body>
<style>
  button{
    background-color:#f66f6a;
    color:white;
    width: 40px;
    height: 25px;
    border:0;
    font-size: 16px;
    box-sizing: content-box;
    border-radius: 5px;
    margin-top: 10px;
    /*padding: 100px;*/
  }
  button:hover{
    background-color: #a54b4a;
  }

  /*#acbutton{*/
  /*  background-color:dodgerblue;*/
  /*  color:white;*/
  /*  width: 30px;*/
  /*  height: 47px;*/
  /*  border:0;*/
  /*  font-size: 16px;*/
  /*  border-radius: 30px;*/
  /*}*/

</style>
</html>
