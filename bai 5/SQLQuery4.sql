Select SalesOrderID, CustomerID, SalesPersonID, TerritoryID, YEAR(OrderDate)
As CurrentYear, YEAR(OrderDate)+ 1ASNextYear
From Sales.SalesOrderHeader