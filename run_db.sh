#!/bin/sh
doas docker run -p 3306:3306 \
  --name anidata \
  -e MYSQL_ROOT_PASSWORD=pass \
  -e MYSQL_DATABASE=jdbc_authentication \
  mysql:latest
