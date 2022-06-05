# JAVA-Challenges

# SQL
## Queries

**SHOW TABLES** : Para mostrar las tablas de la RDBMS

**DROP TABLE IF EXISTS _tabla_name_** : Para BORRAR la tabla de la BBDD.

**INSERT**: Allows you to create new data rows.

  - INSERT INTO tabla_name (id, app_name, app_size, price, total_ratings, genre) : Inserta campo en la tabla

  - VALUES (281656475, "PAC-MAN Premium", 100788224, 3.99, 4.5, "Games");

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

