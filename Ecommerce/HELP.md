## Ecommerce

This project is just a learning project and nothing to show. In this i learnt all the basics to Spring boot.
There are only four routes in this app and four mapping only.
<br>
First is route to get all the listings. 
    GetRoute - api/public/categories
<br>
Second is the post mapping route
    PostRoute - api/public/categories

<br>
Third is the delete route
DeleteRoute - api/admin/categories/{id}

This route Takes a number in the path which is the id to be deleted

<br>
Fourth is the put route
    PutRoute - api/public/categories/{categoryId}

This route also takes a number which is the id of the category to be updated.
We put the data of the category inside the body that needs to be saved now.

We are using a in memory database that is h2 database. This is the database i used to store the data on temporary purpose for this app.

Currently this database is not saving data anywhere because i have made it so that whenever the connection is closed the database drops all its table and during runtime it creates new table everytime. 
So this is for testing only. I can change it everytime i want. 