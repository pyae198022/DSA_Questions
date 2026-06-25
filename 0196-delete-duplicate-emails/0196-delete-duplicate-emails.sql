# Write your MySQL query statement below
Delete from Person where Id not in (
    select min_id from (
        select MIN(id) as min_id from Person group by email
    ) as temp
)