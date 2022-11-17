# Write your MySQL query statement below
SELECT nme AS Customers FROM
(SELECT Customers.id AS idc, Customers.name AS nme, Orders.id AS ido FROM Customers LEFT JOIN Orders ON 
Customers.id = Orders.customerId) AS T 
WHERE ido IS NULL;