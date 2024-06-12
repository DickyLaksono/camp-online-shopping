begin tran;
insert into Employees(EmployeeID, EmployeeName, Height, Weight, EMail, HireFiscalYear, Birthday, BloodType)
		values( 31, N'もくもく', 170, 60, 'moku@nekoyasudo', 2007, '1989-08-08', 'AB' );

insert into BelongTo(BelongID, StartDate, DepartmentID, EmployeeID) 
		values (35, '2007- 09-01', 1, 31) ;

		select * from Employees order by EmployeeID desc;
		select * from BelongTo order by BelongID desc;
rollback;


begin tran
insert into Salary(SalaryID, EmployeeID, PayDate, Amount)
select 
	EmployeeID + 2000,
	EmployeeID,
	'2007-10-01',
	2000
from Employees 
where HireFiscalYear <= 1993 ;
select * from Salary s join Employees e on s.EmployeeID = e.EmployeeID order by s.EmployeeID
rollback;


begin tran
insert into Customers(
					 CustomerCode,
					 CustomerID,
					 Address,
					 PrefecturalID,
					 CustomerClassID,
					 CustomerName)
select 
	EmployeeID +1000,
	EmployeeID +1000,
	'江戸川区西小岩',
	13,
	2,
	EmployeeName
from Employees
where HireFiscalYear <= 1988 
select * from Customers c join Employees e on c.CustomerID = e.EmployeeID order by e.EmployeeID
rollback;