# Default Django Python App

## Install pipenv to get started

```bash
# Debian
apt install pipenv
# ArchLinux
pacman -S python-pipenv
# Fedora
dnf install pipenv
```

## Install the project

```bash
pipenv install
```

## Run the Webserver

```bash
pipenv run server
```

This starts the webserver on localhost:8000. Go with your webbrowser on that site.

## Configure the project

[https://github.com/korfuri/django-prometheus](https://github.com/korfuri/django-prometheus) This guides you through the setup.

After setting up it should provide a `/metrics` endpoint for your application.

Now you can let it scrape from prometheus or push the metrics to a Graphite DB.
