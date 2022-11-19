# Write your MySQL query statement below

SELECT T.name AS NAME, T.balance AS BALANCE FROM 
(
    SELECT Users.name, SUM(Transactions.amount) AS Balance 
    FROM Users JOIN Transactions 
    ON Users.account = Transactions.account
    GROUP BY Users.account
) AS T
WHERE T.Balance > 10000;
