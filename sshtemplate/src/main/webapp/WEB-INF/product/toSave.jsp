<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%><!-- 怎么好像还必须加上isELIgnored="false"时el才能正确显示 -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/reuse/path.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>function模块</title>
</head>
<body>
<h2>Hello World!</h2>
<form action="<%=path %>/lab/function!save">
	name:<input type="text" name="function.name" value="" />
	url:<input type="text" name="function.url" value="" />
	px:<input type="text" name="function.px" value="" />
	<s:token></s:token>
	<input type="submit" >
</form>
</body>
</html>