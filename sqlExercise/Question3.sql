SELECT am.customer_number, firstname, account_number
FROM customer_master cm INNER JOIN account_master am
ON cm.customer_number=am.customer_number
WHERE extract(day from account_opening_date)>15
ORDER BY am.customer_number asc, account_number asc;