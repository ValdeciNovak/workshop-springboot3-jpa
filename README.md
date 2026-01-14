# Course Spring

## Descrição / Sobre o projeto

Este projeto é uma aplicação desenvolvida como parte de um curso sobre Spring Boot. Ele implementa um sistema básico de gerenciamento de usuários, categorias, produtos, pedidos e pagamentos, utilizando as melhores práticas do ecossistema Spring. O objetivo é demonstrar conceitos fundamentais de desenvolvimento backend com Java, incluindo persistência de dados, APIs REST e tratamento de exceções.

O projeto resolve o problema de gerenciar entidades relacionadas em um sistema de e-commerce ou similar, permitindo operações CRUD (Create, Read, Update, Delete) para cada entidade, além de relacionamentos entre elas.

**Objetivo principal:** Aprender e aplicar conceitos de Spring Boot, JPA/Hibernate, e desenvolvimento de APIs RESTful.

## Tecnologias utilizadas

- **Linguagens:** Java 11+
- **Frameworks:** Spring Boot, Spring Data JPA, Spring Web
- **Bibliotecas:** Hibernate (para ORM), Jackson (para JSON), Validation API
- **Banco de dados:** H2 Database (para desenvolvimento e testes), configurável para outros bancos como PostgreSQL ou MySQL
- **Ferramentas de build:** Maven

## Funcionalidades

O sistema oferece as seguintes funcionalidades principais:

- **Gerenciamento de Usuários:** CRUD completo para usuários, incluindo validações.
- **Gerenciamento de Categorias:** Operações para criar, listar, atualizar e deletar categorias de produtos.
- **Gerenciamento de Produtos:** CRUD para produtos, associados a categorias.
- **Gerenciamento de Pedidos:** Criação e consulta de pedidos, incluindo itens de pedido e status.
- **Pagamentos:** Integração básica com pagamentos associados a pedidos.
- **Tratamento de Exceções:** Manipulação de erros personalizados com respostas padronizadas.
- **Testes:** Configuração para testes com banco de dados em memória.

O usuário consegue realizar operações via API REST, como listar produtos, fazer pedidos, gerenciar usuários, etc.

## Como executar o projeto

### Pré-requisitos

- Java 11 ou superior instalado
- Maven 3.6+ instalado
- (Opcional) IDE como IntelliJ IDEA ou Eclipse para desenvolvimento

### Clonando o repositório

```bash
git clone https://github.com/seu-usuario/course-spring.git
cd course-spring
```

### Instalando dependências

```bash
mvn clean install
```

### Comando para rodar

```bash
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

Para testes, execute:

```bash
mvn test
```

## Organização de pastas

O projeto segue a estrutura padrão do Spring Boot:

- `src/main/java/com/educandoweb/course/spring/`: Código fonte principal
  - `entities/`: Classes de entidade JPA (User, Category, Order, etc.)
  - `repositories/`: Interfaces de repositório para acesso a dados
  - `services/`: Lógica de negócio e serviços
  - `resources/`: Controladores REST (APIs)
  - `exceptions/`: Tratamento personalizado de exceções
- `src/main/resources/`: Arquivos de configuração (application.properties, etc.)
- `src/test/`: Testes unitários e de integração
- `target/`: Arquivos compilados e build

**Separação front/back:** Este é um projeto backend puro. Não há frontend integrado; as APIs podem ser consumidas por qualquer cliente (web, mobile, etc.).

**Padrões utilizados:** 
- Arquitetura em camadas (Controller -> Service -> Repository)
- Padrão DTO (Data Transfer Object) para APIs
- Tratamento de exceções centralizado
- Validações com Bean Validation

## Aprendizados

Durante o desenvolvimento deste projeto, aprendi:

- **Conceitos aplicados:** Injeção de dependência, ORM com JPA/Hibernate, desenvolvimento de APIs REST, mapeamento objeto-relacional, tratamento de exceções em aplicações web.
- **Desafios enfrentados:** Configuração correta de relacionamentos JPA (One-to-Many, Many-to-One), implementação de chaves compostas (OrderItemPK), e integração de testes com banco em memória.
- **Habilidades adquiridas:** Proficiência em Spring Boot, uso de Maven para gerenciamento de dependências, e boas práticas de desenvolvimento Java.

## Próximos passos / Melhorias

- **Features futuras:** Implementar autenticação e autorização (Spring Security), adicionar paginação e filtros avançados nas APIs, integrar com um frontend React ou Angular.
- **Refatorações planejadas:** Melhorar a validação de entrada, adicionar logs estruturados, e otimizar consultas JPA com JPQL personalizado.
- **Outras melhorias:** Migrar para um banco de dados relacional em produção, adicionar testes de integração mais abrangentes, e implementar cache com Redis.

## Autor

**Valde**  
[GitHub](https://github.com/valde) | [LinkedIn](https://linkedin.com/in/valde)