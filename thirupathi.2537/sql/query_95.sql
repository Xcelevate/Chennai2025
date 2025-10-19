SELECT IFNULL(CONCAT(m.lastname, ', ', m.firstname), 'Top Manager') AS 'Manager',
CONCAT(e.lastname, ', ', e.firstname) AS 'Direct report' FROM employees e LEFT JOIN employees
m ON m.employeeNumber = e.reportsto ORDER BY manager DESC;