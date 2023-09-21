# Write your MySQL query statement below
SELECT customer_number #Selects customer number to be displayed
FROM Orders #Table to apply filters
GROUP BY customer_number #Group by customer number
ORDER BY count(customer_number) desc limit 1; #Count the total and take the top