<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script type="text/javascript">
	alert("아이디는 '${requestScope.searchId}' 입니다.");
	if("${requestScope.info}"=="customer") location.href = "${pageContext.request.contextPath}/html/namdo-market/page-login-customer.jsp";
	else location.href = "${pageContext.request.contextPath}/html/namdo-market/page-login-seller.jsp"
</script>
</head>
<body>
 
</body>
</html>