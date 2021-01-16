select SalesPersonID, YEAR(OrderDate) AS OrderYear
From Sales.SalestOrderHeader
Where CustomerID=30084
Group BY SalesPersonID, Year(OrderDate)
HAVING COUNT(*) >1
Order BY SalesPersonID, OrderYear;