SELECT orderNumber, orderLineNumber, quantityOrdered * priceEach AS subtotal FROM
orderdetails ORDER BY subtotal DESC;