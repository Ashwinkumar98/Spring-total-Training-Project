<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<jsp:include page="/header"></jsp:include>

<div class="container p-4">
	<form method="POST" action="/getOffers">
		<table class="table table-striped">
		<tr>
			<td><h4>Select Offer Type</h4></td>
			<td>
				<select  name="offers" class="form-control" >
					<option value="">----SELECT-----</option>
					<option value="pre">Prepaid Offers</option>
					<option value="post">Postpaid Offers</option>
				</select>
			</td>
			<td>
				<button class="btn btn-success btn-sm">Find Offers</button>
			</td>
		</tr>
	</table>
	</form>
	<table class="table table-striped table-bordered">
		<c:choose>
			<c:when test="${OfferData eq null}">
				<p class="alter alert-info">Please Select the Offer Type</p>
			</c:when>
			<c:otherwise>
				<thead>
					<tr>
						<th>Offer Name</th>
						<th>Offer Price</th>
						<th>Offer Details</th>
						<th>Offer Validity</th>
						<th>Action</th>
					</tr>
				</thead>
				<c:forEach var="d" items="${OfferData}">
				<tr>
					<td>${d.offer_name}</td>
					<td>${d.price}</td>
					<td>${d.offerPackage}</td>
					<td>${d.offerdays}</td>
					<td><a href="/report?id=${d.offer_id}&type=${type}" class="btn btn-primary ">Choose</a></td>
				</tr>
				</c:forEach>
			
			</c:otherwise>
		</c:choose>

		
	</table>
</div>

<jsp:include page="/footer"></jsp:include>