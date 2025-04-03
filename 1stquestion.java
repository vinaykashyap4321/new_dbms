///Question 1: Create and manipulate the student table
//a) Create the student table with sno as the primary key

CREATE TABLE student (
    sno NUMBER PRIMARY KEY,
    sname VARCHAR2(50),
    class VARCHAR2(20),
    age NUMBER,
    deptid NUMBER
);

// b) Insert at least 5 values into the table
INSERT INTO student (sno, sname, class, age, deptid) VALUES (1, 'Aarav', 'CS', 20, 101);
INSERT INTO student (sno, sname, class, age, deptid) VALUES (2, 'Priya', 'IT', 19, 102);
INSERT INTO student (sno, sname, class, age, deptid) VALUES (3, 'Raj', 'ECE', 21, 103);
INSERT INTO student (sno, sname, class, age, deptid) VALUES (4, 'Sneha', 'CS', 18, 101);
INSERT INTO student (sno, sname, class, age, deptid) VALUES (5, 'Vikram', 'IT', 22, 102);

// c) Retrieve all columns from the student table
SELECT * FROM student;

// d) Select the sname of students whose age is greater than 18
SELECT sname FROM student WHERE age > 18;


// e) Count the number of students (rows) in the age column
SELECT COUNT(age) FROM student;

// f) Add a new column phone_no to the table
ALTER TABLE student ADD phone_no VARCHAR2(15);


SELECT * FROM student;

//g) Apply a UNIQUE constraint on the phone_no column

ALTER TABLE student ADD CONSTRAINT unique_phone UNIQUE (phone_no);

UPDATE student SET phone_no = '9876543210' WHERE sno = 1;

SELECT * FROM student;

DELETE FROM student WHERE sno = 3;

SELECT * FROM student;

DELETE FROM student;

SELECT * FROM student;

DROP TABLE student;

SELECT * FROM student;
