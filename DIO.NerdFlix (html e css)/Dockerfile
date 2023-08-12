FROM httpd as builder
WORKDIR /usr/local/apache2/htdocs/

COPY . .

FROM scratch
WORKDIR /usr/local/apache2/htdocs/
COPY --from=builder  /usr/local/apache2/htdocs/ .
