SELECT customers.customerNumber, customerName, orderNumber, status FROM customers
LEFT JOIN orders ON orders.customerNumber = customers.customerNumber;