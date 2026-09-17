Aggregate Function
  
Table1: DEPARTMENTS;
-------------------------------------------------------------
+---------+-----------+
| dept_id | dept_name |
+---------+-----------+
|       1 | IT        |
|       2 | HR        |
|       3 | FINANCE   |
|       4 | MARKETING |
+---------+-----------+


Table2: EMPLOYEES;
--------------------------------
+--------+----------+--------+---------+
| emp_id | emp_name | salary | dept_id |
+--------+----------+--------+---------+
|    101 | ANU      |  45000 |       1 |
|    102 | RAVI     |  55000 |       1 |
|    103 | PRIYA    |  40000 |       2 |
|    104 | KIRAN    |  60000 |       3 |
|    105 | SNEHA    |  50000 |       3 |
|    106 | SANJAY   |  45000 |       4 |
+--------+----------+--------+---------+

----------------------------------------------------------------------------------------------------
Question 1: Write an SQL query to find the total number of employees in the EMPLOYEES table.
  select count(emp_name) from employees;
+-----------------+
| count(emp_name) |
+-----------------+
|               6 |
+-----------------+
-----------------------------------------------------------------------------
Question 2 — SUM()

Write an SQL query to find the total salary paid to all employees in the employees table.
select sum(salary) from employees;
+-------------+
| sum(salary) |
+-------------+
|      295000 |
+-------------+
------------------------------------------------------------------------------
Question 3 — AVG()

Write an SQL query to find the average salary of all employees in the employees table.
  select avg(salary) from employees;
+-------------+
| avg(salary) |
+-------------+
|  49166.6667 |
+-------------+
  ----------------------------------------------------------------------------------------
Question 4 — MIN()

Write an SQL query to find the lowest salary among all employees.
  select min(salary)from employees;
+-------------+
| min(salary) |
+-------------+
|       40000 |
+-------------+
  ---------------------------------------------------------------------------------------------
Question 5 — MAX()

Write an SQL query to find the highest salary among all employees.
   select max(salary)from employees;
+-------------+
| max(salary) |
+-------------+
|       60000 |
+-------------+
  ------------------------------------------------------------------------

Question 6 — GROUP BY + COUNT()

Write an SQL query to find the number of employees in each department.
  select dept_id,count(emp_name)
    -> from employees
    -> group by dept_id;
+---------+-----------------+
| dept_id | count(emp_name) |
+---------+-----------------+
|       1 |               2 |
|       2 |               1 |
|       3 |               2 |
|       4 |               1 |
+---------+-----------------+
--------------------------------------------------------------------------------
Question 7 — GROUP BY + SUM()

Write an SQL query to find the total salary paid in each department.
  select dept_id,sum(salary)
    -> from employees
    -> group by dept_id;
+---------+-------------+
| dept_id | sum(salary) |
+---------+-------------+
|       1 |      100000 |
|       2 |       40000 |
|       3 |      110000 |
|       4 |       45000 |
+---------+-------------+
----------------------------------------------------------
Question 8

Find the average salary of employees in each department

mysql> select dept_id,avg(salary)from employees group by dept_id;
+---------+-------------+
| dept_id | avg(salary) |
+---------+-------------+
|       1 |  50000.0000 |
|       2 |  40000.0000 |
|       3 |  55000.0000 |
|       4 |  45000.0000 |
+---------+-------------+
------------------------------------------------------------------------------------
Question 9

Find the department IDs where the total salary is greater than 50,000.
   select dept_id,sum(salary)
    -> from employees
    -> group by dept_id
    -> having sum(salary)>50000;
+---------+-------------+
| dept_id | sum(salary) |
+---------+-------------+
|       1 |      100000 |
|       3 |      110000 |
+---------+-------------+
----------------------------------------------------------------------------
Question 10

Find the second-highest salary from the employees table.
  select max(salary) from employees where salary<(select max(salary)from employees);
+-------------+
| max(salary) |
+-------------+
|       55000 |
+-------------+
-----------------------------------------------------------
Question 11

Find the department ID and employee count for departments that have more than one employee.
select dept_id ,count(emp_name)
    -> from employees
    -> group by dept_id
    -> having count(emp_name)>1;
+---------+-----------------+
| dept_id | count(emp_name) |
+---------+-----------------+
|       1 |               2 |
|       3 |               2 |
+---------+-----------------+
-------------------------------------------------------------------------------------------
Question 12

Find the employee(s) whose salary is greater than the average salary of all employees.
  select emp_name from employees where salary>(select avg(salary)from employees);
+----------+
| emp_name |
+----------+
| RAVI     |
| KIRAN    |
| SNEHA    |
--------------------------------------------------------------------------------------------------------
Question 13

Find the department ID with the highest total salary.
  SELECT dept_id, SUM(salary) AS total_salary
FROM employees
GROUP BY dept_id
ORDER BY total_salary DESC
LIMIT 1;
+---------+--------------+
| dept_id | total_salary |
+---------+--------------+
|       3 |       110000 |
+---------+--------------+
------------------------------------------------------------------------------------------------------------
Question 14

Find the employee name and salary of the employee who earns the lowest salary.
  SELECT emp_name, salary
    -> FROM employees
    -> WHERE salary = (SELECT MIN(salary) FROM employees);
+----------+--------+
| emp_name | salary |
+----------+--------+
| PRIYA    |  40000 |
+----------+--------+
