# Write your MySQL query statement below
SELECT p.firstName ,p.lastName,e.city,e.state
from Person p
LEFT JOIN Address e
ON p.personId=e.personId;