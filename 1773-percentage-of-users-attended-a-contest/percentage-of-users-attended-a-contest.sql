# Write your MySQL query statement below
select r.contest_id , ROUND(COUNT(DISTINCT r.user_id) / (SELECT COUNT(*) FROM Users) * 100, 2) AS percentage
from  Register r
group by r.contest_id
order by percentage desc, r.contest_id ASC;