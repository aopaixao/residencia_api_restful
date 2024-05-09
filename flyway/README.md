# Utilizando o Flyway para versionamento do Banco de Dados

## Inclusão da dependência no pom.xml

```bash
<dependency>
  <groupId>org.flywaydb</groupId>
  <artifactId>flyway-core</artifactId>
</dependency>
```

## Inclusão das propriedades de configuração no application.properties

```bash
spring.flyway.enabled=true
spring.flyway.baseline-on-migrate=true
```

## Criação da pasta para hospedagem das "migrations"

```bash
src/main/resources/db/migration/
```

## Inclusão do(s) script(s) de migration (na pasta acima)

```bash
V1_0__create_tables.sql
```

### OBS: a cada alteração necessária no banco de dados, um novo script SQL, seguindo o padrão <Prefix><Version>__<Description>.sql

# Sobre

- Author - [Alexandre Paixão]

# Licença

GNU GPL

