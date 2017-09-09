<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "css/styles.css" />
<style>
<c:choose>
	<c:when test="${currentPres.termNum == numPres}">
		#nextButton {
			display: none;
		}
	</c:when>
	<c:otherwise>
		#nextButton{
			display: block;
		}
	</c:otherwise>
</c:choose>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${currentPres.fName} ${currentPres.lName}</title>
</head>
<body>
<h1>${currentPres.fName} ${currentPres.lName}</h1>
<h3>${currentPres.party}</h3>
<h4> ${currentPres.startYear} -  ${currentPres.endYear}</h4>


<form action="grabapres.do" method="POST">

<input id="nextButton" type="submit" name="next" value="Next">
</form>


	<%-- <form action="pres.do" method="GET">
	
		<c:forEach var="presidents" items="${presidents}">
			       ${presidents.termNum}: ${presidents.fName} ${presidents.midName} ${presidents.lName} ${presidents.startYear} ${presidents.endYear} ${presidents.party}<br/>
		</c:forEach>
		</form> --%>
		
</body>
</html>