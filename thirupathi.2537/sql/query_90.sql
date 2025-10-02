SELECT o.orderNumber, customerNumber, productCode FROM orders o LEFT JOIN orderdetails
USING(orderNumber) WHERE orderNumber = 10123;