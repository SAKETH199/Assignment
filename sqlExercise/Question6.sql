SELECT count(ld.customer_number) as Count
FROM customer_master cm INNER JOIN loan_details ld
ON cm.customer_number=ld.customer_number
WHERE cm.customer_number NOT IN ( SELECT customer_number FROM account_master);