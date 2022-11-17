# Write your MySQL query statement below
SELECT T.cls AS class FROM(SELECT class AS cls, COUNT(*) AS stu
FROM Courses Group BY class) AS T 
WHERE stu >= 5; 