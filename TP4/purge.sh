docker rm $(docker ps -a -q)
docker stop $(docker ps -a -q)
docker system prune -af
docker volume prune -f
