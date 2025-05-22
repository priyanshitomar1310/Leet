# Write your MySQL query statement below
SELECT d.name AS Department,e.name AS Employee,  e.Salary
FROM Employee e
JOIN Department d ON e.departmentId = d.id
WHERE e.salary = (
    SELECT MAX(e2.Salary)
    FROM Employee e2
    WHERE e2.departmentId = e.departmentId
);

