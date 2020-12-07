
select firstname
FROM customer_master cm INNER JOIN account_master am ON cm.customer_number=am.customer_number group by firstname having count(account_number)>1 order by firstname asc;