# chaka

Question 1.
You can find the answer or method for question 1 in the main class which is com.test.chaka 
With method name “getNoOfTimes” it accepts the integer parameter x, which is the value to be reduced to 0.

First I had to cover the arrays to ArrayList, then put my program in a while loop. If two conditions are met it’ll break out of the loop. This conditions are;
  - If x has been reduced to 0.
  - if it’s not possible to reduce x to 0;

Also Instatiated the proposed return value, so while x ie being reduced add 1 to the instantiated value. But if it’s not possible to reduce x to 0 return -1.
 



Question 3.
Tables name stock

mysql> describe stock;
+-------------+--------------+------+-----+-------------------+-------------------+
| Field       | Type         | Null | Key | Default           | Extra             |
+-------------+--------------+------+-----+-------------------+-------------------+
| id          | bigint       | NO   | PRI | NULL              | auto_increment    |
| date        | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| merchant_id | varchar(50)  | YES  |     | NULL              |                   |
| user_Id     | varchar(100) | YES  |     | NULL              |                   |
| name        | varchar(100) | YES  |     | NULL              |                   |
+-------------+--------------+------+-----+------------------
— I used a mysql database for the operation. Created an Entity Class named “Stock”
Under the com.test.chaka.model package.

- Under the com.test.chaka.repo package you’ll find where I implemented the JPQL statement for performing the task of filtering data with two parameters passed which are “merchantId” and “userId” order by date.

- I made a controller for calling this methods. Under the com.test.chaka.controller.

- Then you can test the actions locally using the specified path
 a. Save data — http://localhost:5002/stock/save
  b.  Filter by date — http://localhost:5002/stock/get-by/merchantId/userId


