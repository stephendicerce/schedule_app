Waffle: [![Stories in Ready](https://badge.waffle.io/stephendicerce/schedule_app.png?label=ready&title=Ready)](https://waffle.io/stephendicerce/schedule_app?utm_source=badge)
# Scheduling App
Summer busy work to create an Application/Web based program to keep track of everything life throws
at you.

## Setting up the Database

### Step 1:
Install MySQL. (If you already have MySQL installed, skip to step 2)

### Step 2:
(With MySQL running)
Run the following code in a terminal 
```
    mysql -u root -p
    CREATE DATABASE scheduleappdb; (replace scheduleappdb with whatever you would like to name your database, or leave it as it is)
    USE scheduleappdb;
    GRANT ALL ON scheduleappdb.* TO 'scheduleappdbuser' IDENTIFIED BY 'scheduleapppassword';
``` 
(Make sure to fill in your replaced name wherever you see scheduleappdb)

Congratulations your database is set up and Grails will take care of all of the hard stuff.

## Our Plan
As of right now this program is still in it's infancy, so our path is unclear as of now,
however we plan to talk about what we want to do, and how we want to go about it in the short term.

Stay tuned for more updates!
                              
