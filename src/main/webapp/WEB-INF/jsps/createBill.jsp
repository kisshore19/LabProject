<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Bill</title>

<link href="resources/css/lab.css" rel="stylesheet">
<script src="resources/js/jquery-3.1.0.js"></script>

<script>

$(document).ready(function(){
	$('#addNewItemButtonId').click(function(e) {
		e.preventDefault();
		//alert("hi");
		var additionalRow = "<tr>" +
						"<td>" +
							"<label id='itemNo'>1</label>" +
						"</td>" +
						"<td>dummy data</td>" +
						"<td>" +
							"<input type='number' name='itemQty'>" +
						"</td>" +
						"<td>" +
							"<input type='number' name='itemPrice'>" +
						"</td>" +
						"<td>" +
							"<input type='number' name='itemsTotalPrice'>" +
						"</td>" +
						"<td>" +
							"<button onclick='addNewBillingItem(billingItemsTableId);'>+</button>" +
						"</td>" +
						"</tr>";
		//console.log("Add button is called : " + tableId.id);
		$("#billingItemsTableId").find('tr:last').after(additionalRow);

		/* $("#billingItemsTableId").find('tr:last')
			.append($('<tr>'))
				.append($('<td>'))
			; */
	});

});



</script>

</head>
<body>
	<form>
		Patient Name : <input type="text" name="companyName"></input> Patient Age : <input type="number" name="companyName"></input> Date : <input type="date" name="companyName"></input>

		<table id="billingItemsTableId">
			<tr>
				<th>S.No.</th>
				<th>Test Name</th>
				<th>Qty</th>
				<th>Price</th>
				<th>Total</th>
				<th>Add/Remove</th>
			</tr>
			<tr>
				<!-- <td><label  name="itemNo" value="1" ></label> </td> -->
				<td ><label id="itemNo">1</label></td>
				<td><s:select list="items" listValue="itemName" listKey="id" name="itemID" /></td>
				<td><input type="number" name="itemQty"></td>
				<td><input type="number" name="itemPrice"></td>
				<td><input type="number" name="itemsTotalPrice"></td>
				<td><button id ="addNewItemButtonId">+</button></td>

			</tr>

		</table>
	</form>
</body>
</html>