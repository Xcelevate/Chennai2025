SELECT c.customerNumber, customerName, orderNumber, status FROM customers c LEFT JOIN
orders o  using( customerNumber );