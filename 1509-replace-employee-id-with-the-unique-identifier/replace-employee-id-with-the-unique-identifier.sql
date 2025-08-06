# Write your MySQL query statement below
select e.unique_id, p.name
from Employees p left join
EmployeeUNI e on e.id=p.id;