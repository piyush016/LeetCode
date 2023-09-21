# Write your MySQL query statement below
SELECt name, bonus
FROM Employee LEFT JOIN Bonus on Employee.empId = Bonus.empId
WHERE bonus < 1000 OR BONUS IS NULL ;