docker run --rm -d \
  -p 3307:3306 \
-v vol-sql-demo:/var/lib/mysql \
  --name mysql-tp4 \
  -env MYSQL_ROOT_PASSWORD=root \
  --network net-tp4 \
  mysql:8.0