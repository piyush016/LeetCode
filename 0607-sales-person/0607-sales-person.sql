# Write your MySQL query statement below
SELECT sales.name name
FROM SalesPerson sales
WHERE sales.sales_id NOT IN(
  #Getting all the salesperson whose order is related to Red
  SELECT ord.sales_id 
  FROM Orders ord JOIN Company comp 
  ON ord.com_id = comp.com_id
  WHERE comp.name = "Red"
)