<html>
<head>
    <title>测试页面</title>

</head>
<body>
<#list userList as user>
用户名：${user.username} <br>
性  别：${user.sex}<br>
年  龄: ${user.age}<br>
===================<br>
</#list>
</body>
</html>