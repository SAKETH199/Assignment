SELECT count(customer_number) as Count_Customer
FROM customer_master
WHERE customer_number NOT IN (SELECT customer_number FROM account_master);