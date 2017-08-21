<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>增加</h2>
	<form action="../AddLeagueServlet" method = "post">
		年份<input type = "text" name = "year" value ="2010"><br/><br/>
		季节<select name = "season">
			<option value = "--season--">--season--</option>
			<option value = "spring">spring</option>
			<option value = "summer">summer</option>
			<option value = "fall">fall</option>
			<option value = "winter">winter</option>
		</select><br/><br/>
		标题<input type = "text" name = "title"><br/>
		<input type = "submit" value = "增加"/>
	</form>
</body>
</html>