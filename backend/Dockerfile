FROM python:3

ENV PYTHONDONTWRITEBYTECODE 1
ENV PYTHONUNBUFFERED 1
ENV DOCKER_BUILDKIT 1

RUN mkdir /code
RUN pip install --upgrade pip

WORKDIR /code

COPY . /code/

EXPOSE 8000

RUN --mount=type=cache,target=/root/.cache pip install -r requirements.txt

COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh