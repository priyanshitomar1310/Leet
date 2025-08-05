# Write your MySQL query statement below
select p.project_id, round(ifnull(AVG(experience_years),0),2) as average_years
from employee e right join Project p
on p.employee_id=e.employee_id
group by project_id;