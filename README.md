# dac-jsf
Projeto para a disciplina de Desenvolvimento de Aplicações Corporativas, sendo este um parcial requisito para aprovação na mesma.

API para gestão das entidades do projeto

## Funcionalidades

### Pessoa

- Cadastrar nova pessoa: `POST /pessoas`
- Listar todas as pessoas: `GET /pessoas`
- Detalhar pessoa: `GET /pessoas/{id}`
- Buscar pessoas por cpf: `GET /pessoas/buscar?cpf={cpf}`
- Atualizar dados de uma pessoa: `PUT /pessoas/{id}`
- Deletar uma pessoa: `DELETE /pessoas/{id}`

### Dependente

- Cadastrar novo dependente: `POST /dependentes`
- Listar todos os dependentes: `GET /dependentes`
- Detalhar dependente: `GET /dependentes/{id}`
- Atualizar dados de um dependente: `PUT /dependentes/{id}`
- Converter a pessoa responsável por um dependente: `PUT /dependentes/{id}/converter`
- Deletar um dependente: `DELETE /dependentes/{id}`

## Dependências

- Java 11
- PostgreSQL 14
- Criar objetos de banco: `data/schema.sql`
- Carga inicial: `data/schema.sql`
- Arquivo do postman: `data/DAC-JSF.postman_collection.json`
