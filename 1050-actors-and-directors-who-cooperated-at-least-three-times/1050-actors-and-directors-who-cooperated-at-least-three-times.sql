# Write your MySQL query statement below
SELECT T.actor_id, T.director_id FROM
( 
    SELECT actor_id, director_id, COUNT(*) AS CNT
    FROM ActorDirector
    GROUP BY actor_id, director_id
) AS T 
WHERE T.CNT >= 3;

