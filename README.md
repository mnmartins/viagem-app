# viagem-app

# Executando a aplicação agencia-app (dev mode)

Na pasta do projeto executar o seguinte comando:
```shell script
./mvnw quarkus:dev
```
ou
```shell script
./mvnw compile quarkus:dev
```

> **_Obs:_**  Necessário possuir a variável de ambiente **JAVA_HOME** configurada com a JDK 17. 

É possível verificar se o projeto subiu corretamente executando o comando:
```shell script
curl http://localhost:8080/hello
```
> **_Nota:_**  Uma Dev UI também ficará disponível em http://localhost:8080/q/dev/.


Outras infos em /agencia-app/README.md

