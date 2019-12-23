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

[https://docs.spring.io/spring-metrics/docs/current/public/prometheus](https://docs.spring.io/spring-metrics/docs/current/public/prometheus) This guides you through the setup.

You need to replace

```gradle
// this only works with spring boot 1.5
    compile 'io.prometheus:simpleclient_common:latest.release'
// with
// this works with all gradle versions.
    compile('io.micrometer:micrometer-registry-prometheus:latest.release')
```

After setting up it should provide a `/prometheus` endpoint for your application.

Now you can let it scrape from prometheus or push the metrics to a Graphite DB.

