SELECT c.customerNumber, customerName, orderNumber, status FROM customers c LEFT JOIN
orders o ON c.customerNumber = o.customerNumber;