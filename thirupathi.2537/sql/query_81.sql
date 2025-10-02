SELECT orderNumber, status, SUM(quantityOrdered * priceEach) total FROM orders INNER JOIN
orderdetails USING(orderNumber ) GROUP BY orderNumber;