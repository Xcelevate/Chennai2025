SELECT ordernumber, SUM(quantityOrdered) AS itemsCount, SUM(quantityOrdered*priceeach)
AS total FROM orderdetails GROUP BY ordernumber HAVING total < 10000 ;