select department,employee,salary from(
    select d.name as department,e.name as employee,
    e.salary,Dense_rank() over(partition by d.name order by salary desc) as rnk
    from employee e join department d on e.departmentid = d.id
) t where rnk <= 3;