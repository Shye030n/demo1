<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 10. 10.
  Time: 오후 3:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%-- 이게 파라미터를 보내는 과정 --%>
<%-- SampleController.java와 연결되는 부분   --%>
<%-- 이 페이지를 작성함으로써 http://localhost:8080/ex1?name=aaaa&age=10&gender=m 이걸 입력했을 때 페이지가 에러나지 않고 페이지 이동이 가능.  --%>
</head>
<body>
name : ${name}<br/>
age : ${age}<br/>
gender : ${gender}<br/>
</body>
</html>
