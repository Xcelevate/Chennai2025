SELECT orderNumber, SUM(quantityOrdered * priceEach) AS total FROM orderdetails GROUP BY
orderNumber;