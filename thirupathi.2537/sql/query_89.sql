SELECT lastName, firstName, customerName, checkNumber, amount FROM employees LEFT
JOIN customers ON employeeNumber = salesRepEmployeeNumber LEFT JOIN payments ON
payments.customerNumber = customers.customerNumber ORDER BY customerName,
checkNumber;