# Write your MySQL query statement below
SELECT T.email FROM( SELECT email, COUNT(*) AS cnt FROM Person 
GROUP BY email ) AS T WHERE cnt > 1;