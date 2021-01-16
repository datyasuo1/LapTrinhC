  
SELECT SalesoderID, CustomerID, SalesPersonID, TerritoryID, YEAR(OrdeDate)
ASCurrentYear, Year(OrderDate ) + 1 AsNextYear
FROM Sale.SaleOrderHeader