# Write your MySQL query statement below
select  max(case
when rnk = 2 then salary
else null
end) as SecondHighestSalary
from(
    select salary,dense_rank() over(order by salary desc) as rnk from employee
) t;