Check out our issues on our Waffle: [![Stories in Ready](https://badge.waffle.io/stephendicerce/schedule_app.png?label=ready&title=Ready)](https://waffle.io/stephendicerce/schedule_app?utm_source=badge)
# Scheduling App
Summer busy work to create a mobile Application/Web based program to keep track of everything life throws
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
We plan to build a Grails-app for the web based portion of the application. Most of our coding will therefore be done in Java and Groovy. Our first step will be to design the engine for the application. This will ensure that our backend will be relatively bug free before the application even sees the light of day.
Our plan for the engine will be to design a restful api which will communicate between the databse and the user as needed.



Stay tuned for more updates!
                              
