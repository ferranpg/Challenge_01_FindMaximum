# JAVA-Challenges

# SQL

![image](https://user-images.githubusercontent.com/3032309/172044354-2c032215-e781-43f3-b11a-79979d1b7417.png)

## Queries

**SHOW TABLES** : Para mostrar las tablas de la RDBMS

**DROP TABLE IF EXISTS _tabla_name_** : Para BORRAR la tabla de la BBDD.

**INSERT**: Allows you to create new data rows.

  - INSERT INTO tabla_name (id, app_name, app_size, price, total_ratings, genre) VALUES (281656475, "PAC-MAN Premium", 100788224, 3.99, 4.5, "Games");

**UPDATE**: Allows you to update an existing data row.

  - UPDATE rating SET price = 0 WHERE id = 281656475;

**DELETE**: Allows you to remove an existing data row.

  - DELETE FROM rating WHERE id=281656475;


### Querying Data

**SELECT**: Allows you to query data from a table

  - SELECT * FROM rating; //we want all of the data in our table
  - SELECT app_name, total_ratings, genre FROM rating;
  - SELECT app_name, total_ratings, genre FROM rating WHERE genre = "Games";
  - SELECT app_name, total_ratings, genre FROM rating WHERE genre = "Games" AND total_ratings > 4;


### Aggregation Functions
Aggregate functions allow you to turn multiple rows into a single value using some sort of calculation.

**COUNT**: counts rows in a specified table or view.

  - SELECT genre, COUNT(*) FROM rating;

**AVERAGE**: calculates the average of a set of values.

  - SELECT genre, AVG(price), AVG(total_ratings) FROM rating;

[SQL Aggregate Functions](https://www.zentut.com/sql-tutorial/sql-aggregate-functions/)


### Grouping

**GROUP BY**: Allows you to group rows where values of a column are the same.

  - SELECT genre, COUNT(*) FROM rating GROUP BY genre;
  - SELECT genre, AVG(price), AVG(total_ratings) FROM rating GROUP BY genre;

[SQL GROUP BY](https://mode.com/sql-tutorial/sql-group-by/)
