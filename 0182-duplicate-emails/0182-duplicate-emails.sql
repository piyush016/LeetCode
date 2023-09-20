# Write your MySQL query statement below
SELECT DISTINCT p1.email Email
FROM Person p1 INNER JOIN Person p2 
ON p1.id <> p2.id 
WHERE p1.email = p2.email;