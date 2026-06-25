# Write your MySQL query statement below
select name from SalesPerson  where sales_id Not in (
    select o.sales_id from Orders o Join company a on a.com_id = o.com_id where a.name = 'RED'
)