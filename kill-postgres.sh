name=postgres-playground

docker stop $name
docker rm $name
docker images -a | grep "$name" | awk '{print $3}' | xargs docker rmi