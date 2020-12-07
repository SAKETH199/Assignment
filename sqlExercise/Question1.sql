
SELECT account_number,am.customer_number,firstname,lastname,account_opening_date
FROM customer_master cm INNER JOIN account_master am
ON cm.customer_number=am.customer_number
ORDER BY account_number asc;