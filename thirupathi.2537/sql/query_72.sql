SELECT YEAR(orderDate) AS year  COUNT(orderNumber)  FROM orders  GROUP BY
YEAR(orderDate);