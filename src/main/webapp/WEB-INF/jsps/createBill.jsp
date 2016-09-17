<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.util.List,com.company.hibernate.entities.Items" %>

<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Bill</title>

<link href="resources/css/lab.css" rel="stylesheet">
<script src="resources/js/jquery-3.1.0.js"></script>
<script type="text/javascript" language="javascript" src="resources/js/datatables.min.js"></script>
<script type="text/javascript" language="javascript" src="resources/js/common.js"></script>


<%

	List<Items> items = (List<Items>)request.getAttribute("items");
	
	StringBuilder itemsOptionsHtml = new StringBuilder();
	for (Items item : items) {
		itemsOptionsHtml.append("<option value=\"");
		itemsOptionsHtml.append(item.getId());
		itemsOptionsHtml.append("\">");
		itemsOptionsHtml.append(item.getItemName());
		itemsOptionsHtml.append("</option>");
	}
	
	
%>
<script type="text/javascript">
	var itemsOptionsHtml = '<%=itemsOptionsHtml%>';
</script>
</head>
<body>
	<form>
		<div id="patientInfoHeader">
		Patient Name : <input type="text" name="companyName"></input> Patient Age : <input type="number" name="companyName"></input> Date : <input type="date" name="companyName"></input>
		</div>
		<table id="billingItemsTableId">
			<tr>
				<th>S.No.</th>
				<th>Test Name</th>
				<th>Price</th>
				<th>Qty</th>
				<th>Total</th>
				<th>Add/Remove</th>
			</tr>
			<tr id="itemsRow0">
				<td id="itemNo"></td>
				<td><s:select list="items" listValue="itemName" listKey="id" name="itemID0"/></td>
				<td><input id='itemPriceID0' type="number" name="itemPrice"></td>
				<td><input id='itemQtyID0' type="number" name="itemQty"></td>
				<td><input id='itemsTotalPriceID0' type="number" name="itemsTotalPrice"></td>
				<td id='itemsAddButtonDataId'><button id ="addNewItemButtonId0" type="button">+</button></td>

			</tr>

		</table>
	</form>
</body>
</html>
