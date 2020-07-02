<%@ taglib uri = "http://java.sun.com/jstl/core_rt" prefix="c"%>

		<jsp:include page="/header"/>
		<section style="padding: 10px;min-height: 400px;">
		<h2 class="body-color" >${pageTitle}</h2>
		
		<h3>Developers</h3>
		<ul>
			<c:forEach var="val" items="${developers}">
			<li>${val}</li>
			</c:forEach>
		</ul>
		</section>
		
		<jsp:include page="/footer"/>
		
	
		
	