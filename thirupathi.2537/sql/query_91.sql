SELECT o.orderNumber, customerNumber, productCode FROM orders o LEFT JOIN orderdetails d
ON o.orderNumber = d.orderNumber AND o.orderNumber = 10123;