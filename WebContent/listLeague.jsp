<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.dn.league.dao.*" %>
<%@ page import="com.dn.league.leaguebean.*" %>
<%@ page import="com.dn.league.servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	
		LeagueBean lBean = new LeagueBean();
		SqlBean sBean = new SqlBean();
		
		
		String sql = "select * from league";
		List<LeagueBean> list = sBean.query(sql);
	%>	
		<%
		for(LeagueBean league : list){
			
		%>
		<h2><%=league.toString() %></h2>
		<%
		}
		%>
	<a href="admin/update.jsp">修改</a>
	
	
	
</body>
</html>