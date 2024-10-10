<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 10. 10.
  Time: 오후 4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ex5</title>
  <%-- SampleController.java에서 ex4와 ex5에서 비교 --%>
<%-- http://localhost:8080/ex4?name=aaaa 여기로 접속해서 --%>
<%-- F5를 누르면 http://localhost:8080/ex5?name=aaaa 로 이동하면서 --%>
<%-- .addAttribute 는 첫 웹페이지 화면에서 데이터가 있고, F5를 누른 화면에서도 데이터가 있다. --%>
<%-- .addFlashAttribute 는 첫 웹페이지 화면에서는 데이터가 있지만, F5를 누른 화면에서는 데이터가 없다. --%>

</head>
<body>
add redirect flash attribute result : ${result} <br/>
<%--.addFlashAttribute--%>
add redirect attribute name : ${name} <br/>
<%--.addAttribute--%>
</body>
</html>
