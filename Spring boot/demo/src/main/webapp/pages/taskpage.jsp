<%@ taglib uri = "http://java.sun.com/jstl/core_rt" prefix="c"%>

	<jsp:include page="/header"/>
		<section style="padding: 10px;min-height: 400px;">
		<h2 class="body-color" >${pageTitle}</h2>
		
		<form>
			<label>Task Name : <input type="text" name="task" required/></label>
			<button formaction="addtasks">Add</button>
			<button formaction="deltasks">Delete</button>
			<button formaction="tasks" formnovalidate>Refresh</button>
		</form>
		
		<h4>Tasks</h4>
		<ol style="padding : 10px">
			<c:forEach items="${task}" var="value" >
				<li>${value}</li>
			</c:forEach>
		</ol>
		</section>
		
	<jsp:include page="/footer"/>