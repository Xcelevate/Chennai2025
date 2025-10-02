SELECT customerNumber, checkNumber, amount FROM payments WHERE amount =(SELECT
MAX(amount) FROM payments);