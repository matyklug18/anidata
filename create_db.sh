#!/bin/sh
doas docker stop anidata
doas docker rm anidata
doas docker run -p 3306:3306 \
  --name anidata \
  -e MYSQL_ROOT_PASSWORD=pass \
  -e MYSQL_DATABASE=main \
  mysql:latest
