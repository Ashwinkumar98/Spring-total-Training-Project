
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript">

$("#btnExport").live("click", function () {
    var divContents = $("#dvContainer").html();
    var printWindow=window.open('', '', 'height=400,width=800');
    printWindow.document.write('<html><head><title>Report</title>');
    printWindow.document.write('</head><body >');
    printWindow.document.write(divContents);
    printWindow.document.write('</body></html>'); 
     printWindow.document.close();
     printWindow.print();
});
</script>

<jsp:include page="/header"></jsp:include>
	<div  id="dvContainer" class="container p-4">
	
	<h3>Customer Details</h3>
		<table class="table">
			<tr>
				<td><strong>First Name</strong></td>
				<td>${data.firstname}</td>
			</tr>
				<td><strong>Last Name</strong></td>
				<td>${data.lastname}</td>
			<tr>
				<td><strong>Email Id</strong></td>
				<td>${data.emailid}</td>
			</tr>
			<tr>
				<td><strong>Mobile No</strong></td>
				<td>${data.mobileno}</td>
			</tr>
			<tr>
				<td><strong>Date of Birth</strong></td>
				<td>${data.DOB}</td>
			</tr>
			<tr>
				<td><strong>Aadhar no</strong></td>
				<td>${data.aadharno}</td>
			</tr>
		</table>
		<h3>Package Details</h3>
		<table class="table">
			<tr>
				<td><strong>Offer Name</strong></td>
				<td>${data.offerdetails.offer_name}</td>
			</tr>
			
			<tr>
				<td> <strong>Price</strong></td>
				<td> ${data.offerdetails.price}</td>
			</tr>
			
			<tr>
				<td><strong>Offer Package</strong></td>
				<td>${data.offerdetails.offerPackage}</td>
			</tr>
			
			<tr>
				<td><strong>validation Period</strong></td>
				<td>${data.offerdetails.offerdays}</td>
			</tr>
		</table>
		<button  id="btnExport" onclick="fnExcelReport()" class="btn btn-primary btn-sm">Export</button>
	</div>
<jsp:include page="/footer"></jsp:include>