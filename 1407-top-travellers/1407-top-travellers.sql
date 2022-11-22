# Write your MySQL query statement below

SELECT name, travelled_distance FROM
( SELECT Users.name AS name, 
COALESCE(SUM(Rides.distance), 0) AS travelled_distance
FROM Users LEFT JOIN Rides 
ON Users.id = Rides.user_id
GROUP BY Users.id ORDER BY Users.name) AS T
ORDER BY travelled_distance DESC;