SELECT orderNumber, orderlinenumber, quantityOrdered * priceEach   FROM
orderdetails order by quantityOrdered + priceEach;