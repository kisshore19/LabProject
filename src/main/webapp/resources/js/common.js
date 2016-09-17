var billingItemsCount = 1;
$(document).on(
		'click',
		function(e) {
			e.preventDefault();
			// console.log("Options html : " + itemsOptionsHtml);
			// console.log(e);
			if (typeof (e.target.id) !== "undefined" && e.target.id != null) {

				if (e.target.id.includes("addNewItemButtonId")) {
					var clickedEventId = "#" + e.target.id;// $([
					// 'id^=addNewItemButtonId'
					// ]);
					//console.log("clickedEventId : " + clickedEventId);
					var tableRowNumber = $(clickedEventId).closest("tr").index();
					//console.log("Finding row number : " + tableRowNumber);
					var currentaddNewItemButtonValue = $(clickedEventId).html();
					if (currentaddNewItemButtonValue == '+') {
						var addNewItemButtonId = "addNewItemButtonId" + (tableRowNumber + 1);

						var additionalRow = "<tr id=itemsRow" + (tableRowNumber) + ">" + "<td></td>" + "<td><select name=\"itemID1\" id=\"itemID1\">"
								+ itemsOptionsHtml + "</td>" + "<td><input id='itemQtyID' type='number' name='itemQty'>" + "</td>"
								+ "<td><input id='itemPriceID' type='number' name='itemPrice'>" + "</td>"
								+ "<td><input id='itemsTotalPriceID' type='number' name='itemsTotalPrice'>" + "</td>"
								+ "<td id='itemsAddButtonDataId'><button id =" + addNewItemButtonId + " type='button'>+</button></td>" + "</tr>";
						// console.log("Additional row : " + additionalRow );
						$(clickedEventId).text('-');
						$('#billingItemsTableId tr:last').after(additionalRow);

					} else if (currentaddNewItemButtonValue == '-') {
						$(clickedEventId).closest('tr').remove();
						sortTableIds("#billingItemsTableId", "itemsRow", "addNewItemButtonId");
						//console.log("trying to remove the row : " + clickedEventId + " : " + currentaddNewItemButtonValue);

					}

				}

			}

		});

function sortTableIds(tableId, itemsRowId, itemButtonId) {
	$(tableId + ' tr').each(function(index) {
		var trID = $(this).attr('id');
		if (trID !== "undefined" && trID != null) {
			var itemsTmp = itemsRowId + index;
			var buttonTmp = itemButtonId + index;
			$(this).attr("id", itemsTmp);
			var buttonID = $(this).find(":button");
			$(buttonID).attr("id", buttonTmp);
		}
	})
}