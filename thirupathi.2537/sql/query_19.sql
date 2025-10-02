SELECT orderNumber, orderlinenumber, quantityOrdered * priceEach FROM
orderdetails  ORDER BY quantityOrdered * priceEach DESC;