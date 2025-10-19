SELECT orderNumber, status FROM orders ORDER BY FIELD(status, 'In Process', 'On Hold',
‘Cancelled', 'Resolved', 'Disputed', 'Shipped');