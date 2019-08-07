 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
 
 <jsp:include page="/header"/>

	<c:if test="${msg ne null}">
	<p class="alert alert-info p-2"><strong>${msg }</strong></p>
	</c:if>
	
	<div class="row">
		<div class="col-sm-12 ">
			<h2 class="jumbotron center-block">Employee Management System: Why and How to Start Using One</h2>
		</div>
		<div class="col-sm-12 p-4" id="section1" class="container-fluid bg-success" style="padding-top:70px;padding-bottom:70px">
		  <h1>What is an employee management system?</h1>
			<p>An employee management system is a useful tool for business owners, HR professionals, and managers alike because it organizes and streamlines team management.These systems can range from onboarding and payroll to performance and time off tracking, but should have the essential HR features covered.The key is to find a system that not only works well for your team, but one that also saves you time, headaches, and money.
One of the most common ways of managing teams, especially remote workers, is regular reporting via email. However, this method is cumbersome and messy.
The key to optimizing your team's performance is taking the time-consuming admin tasks out of the picture, so you can all focus on accomplishing more
This article will outline the benefits of management systems, and the best apps and tools you can use to improve your team's efficiency.</p>
		</div>
	</div>
 
 <jsp:include page="/footer"/>