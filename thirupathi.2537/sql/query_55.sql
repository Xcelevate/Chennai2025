SELECT orderNumber, requiredDate, status FROM orders WHERE requireddate BETWEEN
CAST('2003 -01-01' AS DATE) AND CAST('2003 -01-31' AS DATE);