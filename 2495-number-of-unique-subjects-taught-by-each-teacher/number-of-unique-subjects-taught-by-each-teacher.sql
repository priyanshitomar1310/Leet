# Write your MySQL query statement below
SELECT DISTINCT teacher_id ,COUNT(Distinct subject_id) as cnt
FROM Teacher
GROUP BY teacher_id;