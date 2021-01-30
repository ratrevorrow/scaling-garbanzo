# docker-compose stop backend frontend
# docker-compose exec backend python manage.py makemigrations 
# docker-compose exec backend python manage.py migrate
# export DOCKER_BUILDKIT=1
docker-compose --env-file ./.env up --build postgres # frontend backend