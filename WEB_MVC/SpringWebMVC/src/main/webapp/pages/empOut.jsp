<%@ taglib uri = "http://java.sun.com/jstl/core_rt" prefix="c"%>

 
 <jsp:include page="/header"/>
 
 	<section class="border">
		<h2>Employee Details</h2>
		
		<c:choose>
			<c:when test="emp.name eq null">
				<p>No Data To Display</p>
			</c:when>
			<c:otherwise>
				<table>
					<tr>
						<td><em>Employee Id</em></td>
						<td><strong>${emp.id}</strong>
					</tr>
					
					<tr>
						<td><em>Employee name</em></td>
						<td><strong>${emp.name}</strong>
					</tr>
					
					<tr>
						<td><em>Employee Designation</em></td>
						<td><strong>${emp.desig}</strong>
					</tr>
					
					<tr>
						<td><em>Employee Basic</em></td>
						<td><strong>${emp.basic}</strong>
					</tr>
					
					<tr>
						<td><em>Employee HRA</em></td>
						<td><strong>${emp.hra}</strong>
					</tr>
					
				</table>
			</c:otherwise>
		</c:choose>
		
	 	
 	</section>
 	
 <jsp:include page="/footer"/>