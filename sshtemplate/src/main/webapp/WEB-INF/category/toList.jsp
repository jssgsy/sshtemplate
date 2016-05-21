<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/reuse/path.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
<a href="<%=path%>/demo/category!toSave">新增类别</a>
	<table border="1px solid" cellspacing="0">
		<thead>
			<tr>
				<td></td>
				<td>name</td>
				<td>url</td>
				<td>px</td>
				<td>父类别</td>
				<td>操作</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="category" items="${categoryList }" varStatus="line">
				<tr>
					<td>${line. count}</td>
					<td>${category.name}</td>
					<td>${category.description}</td>
					<td>${category.px}</td>
					<td>${category.parent.name}</td>
					<td>
						<a href="<%=path %>/demo/category!toUpdate?category.id=${category.id}">修改|</a>
						<a href="<%=path %>/demo/category!delete?category.id=${category.id}">删除</a>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

</body>
</html>