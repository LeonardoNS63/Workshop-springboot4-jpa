# 🍃 Workshop Spring Boot 4 + JPA

Projeto desenvolvido para fins de estudo e prática dos conceitos fundamentais de **Spring Boot** e **JPA (Java Persistence API)**, incluindo criação de APIs REST, mapeamento de entidades, relacionamentos e acesso a banco de dados.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Versão |
|---|---|
| Java | 21 |
| Spring Boot | 4.0.6 |
| Spring Data JPA | — |
| Spring Web MVC | — |
| H2 Database | (runtime) |
| PostgreSQL | (runtime) |
| Maven | — |

---

## 📋 Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:

- [Java 21+](https://www.oracle.com/java/technologies/downloads/)
- [Maven 3.8+](https://maven.apache.org/download.cgi) *(ou use o Maven Wrapper incluído no projeto)*
- [Git](https://git-scm.com/)
- *(Opcional)* [PostgreSQL](https://www.postgresql.org/) para ambiente de produção

---

## ⚙️ Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/LeonardoNS63/Workshop-springboot4-jpa.git
cd Workshop-springboot4-jpa
```

### 2. Execute a aplicação

Com Maven Wrapper (recomendado):

```bash
# Linux / macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

Ou com Maven instalado:

```bash
mvn spring-boot:run
```

### 3. Acesse a aplicação

A aplicação estará disponível em:

```
http://localhost:8080
```

---

## 🗄️ Banco de Dados

### H2 (ambiente de desenvolvimento)

O projeto usa o banco de dados em memória **H2** por padrão. Para acessar o console:

```
http://localhost:8080/h2-console
```

| Campo | Valor |
|---|---|
| JDBC URL | `jdbc:h2:mem:testdb` |
| Username | `sa` |
| Password | *(vazio)* |

### PostgreSQL (ambiente de produção)

Configure as variáveis no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    ├── java/
    │   └── com/personal/aula/Spring/
    │       ├── config/         # Configurações da aplicação
    │       ├── entities/       # Entidades JPA (modelos)
    │       ├── repositories/   # Repositórios Spring Data JPA
    │       ├── resources/      # Controllers REST
    │       └── services/       # Regras de negócio
    └── resources/
        └── application.properties
```

---

## 📚 Conceitos Abordados

- Criação de API REST com Spring Web MVC
- Mapeamento de entidades com JPA / Hibernate
- Relacionamentos entre entidades (`@OneToMany`, `@ManyToOne`, `@ManyToMany`)
- Camadas de arquitetura: Resource → Service → Repository
- Banco de dados em memória (H2) para testes e desenvolvimento
- Integração com PostgreSQL para produção
- Tratamento de exceções e respostas HTTP

---

## 📄 Licença

Este projeto está sob fins educacionais e não possui licença definida.

---

<p align="center">Feito com ☕ e Spring Boot por <a href="https://github.com/LeonardoNS63">LeonardoNS63</a></p>
