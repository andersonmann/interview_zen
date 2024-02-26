# web-automation-onprimese-and-cloud

## Descrição
Este código foi desenvolvido para o desafio técnico da empresa [AGI](https://blogdoagi.com.br/).
Estas instruções fornecerão uma cópia do projeto para execução e alteração em sua máquina local para fins de desenvolvimento e testes. 
Consulte as instruções abaixo para saber como baixar e executar o projeto.

---


---

## Configuração do repositório

- Certifique-se de ter as seguintes dependências instaladas e configuradas na máquina
  - Java >= 17
  - Maven >= 3.1+
  - Variáveis de ambiente JAVA E MAVEN (PS: caso não possua, os testes deverão ser executados via IDE)
  
- Clone o repositório
- Navegue até a raiz do diretório  do projeto

  Execute o seguinte comando para instalar as dependências necessárias:
    ```sh
     mvn install -DskipTests
    ```
---

## Sobre os testes implementados neste repositório

Este repositório contém os seguintes testes:

| Classe                | Nome do teste                   | Descrição                                                                    |
|-----------------------|---------------------------------|------------------------------------------------------------------------------|
| SearchTest            | isEnableSearch                  | Checks that search icon is enable.                                           |
| SearchTest            | searchAndVerifyTheResult        | Search for a term and validate the result.                                   |
| SearchTest            | searchWithoutResults            | Perform a no results search.                                                 |
| SearchTest            | verifyTitlePage                 | Validates the page title.                                                    |


| BACKLOG    |  
|------------|
| Teste de pesquisa com diferentes tipos de entrada (textos longos, caracteres especiais, números, etc.).|
| Teste de pesquisa com termos populares e termos incomuns para verificar a relevância dos resultados.| 
| Teste de desempenho para garantir que a pesquisa seja rápida e eficiente, mesmo com grandes conjuntos de dados.| 
| Verificação da capacidade de pesquisa para lidar com erros de digitação e fornecer sugestões corretas.| 

---

## Executando os testes

- Para executar um cenário de teste específico, use o seguinte comando com o adicional 'test' argument:

Maven:
  ```sh
  mvn clean test -Dtest=SearchTest#searchWithoutResults
  ```

 Onde, o argumento `test` ou pode ser qualquer teste implementado neste repositório.

- Para executar uma classe específica, use o seguinte comando:

Maven:
  ```sh
  mvn clean test -Dtest=SearchTest
  ```
Onde, o argumento `test` pode ser qualquer classe de teste implementada neste repositório.

- Execute todo o conjunto de testes

  Para isso, use o seguinte comando:

  Maven:
  ```sh
  mvn clean test
  ```


---

## Gerar relatórios

- Após a execução dos testes, gere o relatório usando o seguinte comando:


  ```sh
  mvn allure:report
  ```

- Inciar o servidor e visualizar o relatório:


  ```sh
  mvn allure:serve
  ```
---

## Logs

Os logs gerados durante a execuçãp dos testes são armazenadps na pasta ```logs ```

## Screenshots
O diretório com as capturas de tela dos cenários de erros, está no seguinte caminho ```target/screenshots/```

---

## Estrutura do projeto

```
.
└── logs
    └── .gitkeep
└── src
   └── main
       └── java
           ├── core
                 └── BasePage.java
                 └── BaseTest.java
           ├── page
                 └── HomePage.java
                 └── SearchPage.java
           │── utils
                 └── AllureListener.java
                 └── CsvUtil.java
                 └── MessageAndLogs.java
                 └── ScreenshotUtils.java
   └── test
       └── java
           ├── test
                 └── SearchTest.java
       └── resources
           ├── data
                 └── search.csv
           ├── suite
                 └── search.xml.csv
           ├──  allure.properties
           ├──  logging.properties
└── .gitignore
└── docker-compose.yml
└── flowchart.svg
└── pom.xml
└── README.md
└── tools chain CI/CD.svg

```
---

## Tarefas realizadas
Foi utilizado para fins de controle de atividades a funcionalidade *Issues* que o GitLab fornece.
Acessando a seção [issues](https://github.com/andersonmann/interview_zen/issues) podem ser
encontradas todas as atividades criadas durante o desenvolvimento desse projeto.

---

## Pull Requests

Para fins de compreensão das práticas de desenvolvimento utilizadas, pode ser verificado a seção [Merge requests](https://github.com/andersonmann/interview_zen/pulls)
do projeto.

---

## Stack 

* [WebDriver](https://www.selenium.dev/documentation/webdriver/) - Framework de testes 
* [TestNG](https://testng.org/doc/documentation-main.html/) - Framework de testes
* [MAVEN](https://maven.apache.org/) - Gerenciador de dependências e build
* [JAVA](https://www.oracle.com/br/java/technologies/downloads/#java17) - Linguagem de programação
* [SonarLint](https://www.sonarsource.com/knowledge/languages/java/) - Linter
* [SonarQube](https://www.sonarsource.com/products/sonarqube/) - Ferramenta de DAST e SAST

---

## Versionamento
* [Semantic Versioning 2.0.0](https://semver.org/)

---

## Autor

**Anderson Mann** - *Software Engineer in Test | Staff QA Engineer* 
- [GitHub](https://github.com/andersonmann)
- [Linkedin](https://www.linkedin.com/in/andersonmann/)

---

## Licença

This project is licensed under the GNU License.

---

## Roadmap

- seleção dinâmica de ambientes
- imagem Docker do Java e Maven
- integrar com CI/CD