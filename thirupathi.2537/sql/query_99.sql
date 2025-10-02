SELECT customerNumber, checkNumber, amount FROM payments WHERE amount >(SELECT
AVG(amount) FROM payments);