docker stop nginx-lb nginx1 nginx2 2>/dev/null || true
docker rm   nginx-lb nginx1 nginx2 2>/dev/null || true
docker network rm tplb 2>/dev/null || true
