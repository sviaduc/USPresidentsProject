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
			visibility: hidden;
		}
	</c:when>
	<c:otherwise>
		#nextButton{
			display: block;
		}
	</c:otherwise>
</c:choose>
<c:choose>
	<c:when test="${currentPres.termNum == 1}">
		#previousButton {
			visibility: hidden;
		}
	</c:when>
	<c:otherwise>
		#previousButton{
			display: block;
		}
	</c:otherwise>
</c:choose>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${currentPres.fName} ${currentPres.midName} ${currentPres.lName}</title>
</head>
<body>
<div id="sweetEagle">
<img src="https://i.pinimg.com/736x/34/f5/fd/34f5fd03df34a42f2edbeab5a10ed98c--flag-tattoos-american-eagle-tattoo.jpg">
</div>
<br><br><br><br><br><br>
<div class="main">
<h1>${currentPres.fName} ${currentPres.midName} ${currentPres.lName}</h1>
<img class="presImage" src="${currentPres.image }" />
<h3>${currentPres.party}</h3>
<h4> ${currentPres.startYear} -  ${currentPres.endYear}</h4>

<form action = "gotopres.do" method="POST">
	Enter President Number: <input id="number" type="number" name ="Number" min=1 max="${numPres}">
	<input type="submit" name="submit" value="Submit">
</form>
<form action="grabapres.do" method="POST">

<input id="previousButton" type="submit" name="next" value="Previous">

<input id="nextButton" type="submit" name="next" value="Next">
</form>
<hr>
<p>${currentPres.fact}</p>

</div>
		
</body>
</html>