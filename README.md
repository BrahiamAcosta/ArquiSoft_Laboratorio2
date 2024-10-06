[![CI/CD Pipeline](https://github.com/BrahiamAcosta/ArquiSoft_Laboratorio2/actions/workflows/build.yml/badge.svg)](https://github.com/BrahiamAcosta/ArquiSoft_Laboratorio2/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=BrahiamAcosta_ArquiSoft_Laboratorio2&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=BrahiamAcosta_ArquiSoft_Laboratorio2)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=BrahiamAcosta_ArquiSoft_Laboratorio2&metric=coverage)](https://sonarcloud.io/summary/new_code?id=BrahiamAcosta_ArquiSoft_Laboratorio2)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=BrahiamAcosta_ArquiSoft_Laboratorio2&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=BrahiamAcosta_ArquiSoft_Laboratorio2)[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=BrahiamAcosta_ArquiSoft_Laboratorio2&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=BrahiamAcosta_ArquiSoft_Laboratorio2)[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=BrahiamAcosta_ArquiSoft_Laboratorio2&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=BrahiamAcosta_ArquiSoft_Laboratorio2)
# Implementation of a Simple App with the next operations:
* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check
  Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and
  Snyk
### Folders Structure
In the folder `src` is located the main code of the app
In the folder `test` is located the unit tests
### How to install it
Execute:
```shell
$ mvnw spring-boot:run
```
to download the node dependencies
### How to test it
Execute:
```shell
$ mvnw clean install
```
### How to get coverage test
Execute:
```shell
$ mvnw -B package -DskipTests --file pom.xml