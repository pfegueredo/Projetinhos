## Desenvolvendo primeiro projeto com .NET Entity Framework



Instrutor: Anderson Clavico Moreira (XP Investimentos)

Resumo: criação de uma aplicação MVC, API com Swagger e publicação no Azure.



- Introdução teórica dos seguintes componentes:
  - Entity Framework;
  - Data Notations e alguns tipos (Required, Display, etc);
  - Migrations (atualização incremental do BD);
  - Padrão MVC;
  - Routes e Custom Routes;
  - Action Results;
  - HTTP Verbs;
  - arquivo Startup.cs e seus métodos (Configure e ConfigureServices).
  - API, Rest e RestFul
  - Swagger
-  Criação do Projeto CursoMVC
  - Instalação dos pacotes Entity Framework (EntityFrameworkCore.SqlServer e Tools);
  - Criação da classe Context;
  - Configuração do ConfigureServices do Startup.cs para usar o DbContext;
  - Criação da Model Categorias;
  - Execução do Migration do Entity Framework;
  - Criação da Controller por meio do meni Scaffolding;
  - Configuração de Data Annotations nas Models Produto e Categoria;

- Criação do Projeto CursoAPI
  - Criação de novo projeto Aplicativo Web ASP.NET Core, tipo API;
  - Instalação do pacote do Swagger;
  - Habilitar o Swagger no ConfigureServices do Startup.cs;
  - Habilitar o middleware do Swagger no Configure do Startup.cs;
  - Adicionar Referência ao projeto CursoMVC;
  - Criação da Controller CategoriasController com Scaffolding baseado na Model do MVC;
  - Adicionar o DBContext no ConfigureServices do Startup.cs;
  - Criação da  Controller ProdutosController com Scaffolding baseado na Model do MVC; 

- Criação de Projeto de Teste xUnit
  - Adicionar Referências aos dois projetos: CursoMVC e CursoAPI;
  - Vincular os pacotes do Entity Framework a este projeto, na mesma versão;
  - Instalar o pacote Moq;
  - Configurar o arquivo de Teste.