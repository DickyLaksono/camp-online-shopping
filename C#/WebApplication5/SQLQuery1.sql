select SalaryID as salary ,case when Amount <150000 then 'A'
when Amount <300000 then 'B'
when Amount <500000 then 'C'
else 'D'
end as Rank
from Salary;


select CustomerID as CustomerID,  count(*) as Count from Sales group by CustomerID

select PrefecturalID as CustomerID,  count(*) as count
from Customers group by PrefecturalID having count(*) >= 3;

select EmployeeID as ID , count(*) as amount
from Salary group by EmployeeID having count(*) < 12;

select EmployeeID as ID , count(*) as amount
from Salary where EmployeeID >= 20 group by EmployeeID having count(*) >= 12;

select HireFiscalYear as hfy ,sum(case when BloodType = 'A' then 1 else 0 end ) as A from Employees
group by HireFiscalYear

select HireFiscalYear as hfy ,
sum(case when Height <= 160 then 1 else 0 end ) as "160以下" ,
sum(case when Height <= 170 then 1 else 0 end ) as "170以下" ,
sum(case when Height <= 180 then 1 else 0 end ) as "180以下" ,
sum(case when Height > 180 then 1 else 0 end ) as "181以上" 
from Employees
group by HireFiscalYear