# Default Spring Java App

## Install pipenv to get started

```bash
# Debian
apt install gradle
# ArchLinux
pacman -S gradle
# Fedora
dnf install gradle
```

## Run the Webserver

```bash
 gradle build && java -jar build/libs/gs-spring-boot-0.1.0.jar
```

This starts the webserver on localhost:8080. Go with your webbrowser on that site.

## Configure the project

[https://github.com/korfuri/django-prometheus](https://github.com/korfuri/django-prometheus) This guides you through the setup.

After setting up it should provide a `/metrics` endpoint for your application.

Now you can let it scrape from prometheus or push the metrics to a Graphite DB.
