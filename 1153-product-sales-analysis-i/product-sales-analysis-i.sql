# Write your MySQL query statement below
SELECT p.product_name,s.year,s.price
FROM Sales s
left join Product p on s.product_id=p.product_id;