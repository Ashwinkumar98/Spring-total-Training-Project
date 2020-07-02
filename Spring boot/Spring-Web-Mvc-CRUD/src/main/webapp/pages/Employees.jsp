<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<jsp:include page="/header"/>

<div class="container-fluid p-4">
	<h3>Employee List</h3>
	
	<c:choose>
		<c:when test="emplist eq null">
		<p class="alert alert-warning">
			Sorry ! Data cannot be fetched ! or No record found
		</p>
		</c:when>
		<c:when test="${emplist.size()==0}">
			<p class="alert alert-info">
			 No record found
		</p>
		</c:when>
		<c:otherwise>
			<table class="table table-bordered table-striped table-hovered">
				<thead>
					<tr>
						<th>Employee Id</th>
						<th>Full Name</th>
						<th>Mobile No</th>
						<th>Mail ID</th>
						<th>Action</th>
					</tr>
				</thead>
				
				<tbody>
				<c:forEach var="val" items="${emplist}">
					<tr class="text-right">
						<td>${val.empId}</td>
						<td>${val.firstname} ${val.lastname}</td>
						<td>${val.mobileno}</td>
						<td>${val.emailid}</td>
						<td>
							<a href="/${val.empId}" class="btn btn-sm btn-info">View Details</a>
						</td>
						
					</tr>
				</c:forEach>
				</tbody>
				
			</table>
		</c:otherwise>
	</c:choose>
</div>

<jsp:include page="/footer"/>