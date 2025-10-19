-- Find the customers who have not placed any orders :
SELECT customerName FROM customers WHERE customerNumber NOT IN(SELECT DISTINCT
customerNumber FROM orders);