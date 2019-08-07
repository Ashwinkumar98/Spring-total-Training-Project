<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<jsp:include page="/header"></jsp:include>

<div class="container p-4">
	<h3>Customer Information</h3>
	<form:form method="POST" action="/home" modelAttribute="cus">
	
	<form:hidden path="id" />
	
	<table class="table">
		<tr class="form-group">
			<td><form:label path="firstname">First Name </form:label></td>
			<td><form:input type="text" class="form-control" path="firstname"></form:input></td>
			<td><form:errors  path="firstname" class="text-danger"></form:errors></td>
		</tr>
		
		<tr class="form-group">
			<td><form:label path="lastname">Last Name </form:label></td>
			<td><form:input type="text" class="form-control" path="lastname"></form:input></td>
			<td><form:errors  path="lastname" class="text-danger"></form:errors></td>
		</tr>
		
		<tr class="form-group">
			<td><form:label path="mobileno">Mobile No</form:label></td>
			<td><form:input type="text" class="form-control" path="mobileno"></form:input></td>
			<td><form:errors  path="mobileno" class="text-danger"></form:errors></td>
		</tr>
		
		<tr class="form-group">
			<td><form:label path="emailid">Email Id </form:label></td>
			<td><form:input type="email" class="form-control" path="emailid"></form:input></td>
			<td><form:errors  path="emailid" class="text-danger"></form:errors></td>
		</tr>
		
		<tr class="form-group">
			<td><form:label path="aadharno">Aadhar No</form:label></td>
			<td><form:input type="text" class="form-control" path="aadharno"></form:input></td>
			<td><form:errors  path="aadharno" class="text-danger"></form:errors></td>
		</tr>
		
		<tr class="form-group">
			<td><form:label path="DOB">Date of Birth</form:label></td>
			<td><form:input type="date" class="form-control" path="DOB"></form:input></td>
			<td><form:errors  path="DOB" class="text-danger"></form:errors></td>
		</tr>
	</table>
	
	<form:button class="btn btn-primary btn-sm">Next</form:button>
	
	</form:form>
</div>

