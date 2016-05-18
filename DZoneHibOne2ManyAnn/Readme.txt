
Where the tutorial is
---------------------- 
https://dzone.com/tutorials/java/hibernate/hibernate-example/hibernate-mapping-one-to-many-using-annotations-1.html

All DZone Hibernate Tutorials
-----------------------------
https://dzone.com/tutorials/java/hibernate/hibernate-example/hibernate-example.html

What it is
----------
Basic hibernate support for a single database, two tables + link table

What it does
------------
Links (joins) a row in a Student table to one or more rows in a Phone table
This is a one-way link, the Phone entries does not know with whom they are linked, nor that they are part of a group
As a result, multiple students could refer to the same phone entries arranged in different groups or in the same group

This is accomplished by using a third table, a student_phone table that links students to phone numbers
Each student has one reference to the linking table, but there can be more than one row in the linking table that
matches the student reference. The entries in the linking table then refer to one entry in the phone table.

Concepts
--------
CRUD with Hibernate, MySQL, one-to-many relationships, linking tables

