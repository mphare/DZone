
Where the tutorial is
---------------------- 
https://dzone.com/tutorials/java/hibernate/hibernate-example/hibernate-mapping-one-to-one-using-annotations-1.html

All DZone Hibernate Tutorials
-----------------------------
https://dzone.com/tutorials/java/hibernate/hibernate-example/hibernate-example.html

What it is
----------
Basic hibernate support for a single database, two tables

What it does
------------
Links (joins) a row in a Student table to a row in an Address table
This is a one-way link, the Address entry does not know with whom it is linked
As a result, multiple students could refer to the same address

The link is accomplished by having a column in the Student table hold an ID from the Address table
Concepts
--------
CRUD with Hibernate, MySQL, one-to-one relationships