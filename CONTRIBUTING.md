# Guia de Contribuição

Caso seja necessário criar uma funcionalidade, bug ou tenha dúvidas no uso da biblioteca, siga os seguintes passos:

* Verifique se não há uma issue já aberta no projeto, acessando este [link](https://github.com/andersonmann/interview_zen/issues).
* Caso não haja, abra uma issue propondo uma mudança ou com uma dúvida. Descreva se é feature, bug ou dúvida e adicione detalhes, preferencialmente com um cenário para reprodução local.
* Se você tiver ideia de como desenvolver ou corrigir, leia a [documentação para desenvolvedores](#documentação-para-desenvolvedores) e crie um Pull Request citando a Issue.

# Documentação para desenvolvedores
Esta seção contém informações para quem deseja contribuir com o desenvolvimento do projeto.

## Tecnologias
As seguintes tecnologias são utilizadas no projeto:
* [Java 17](https://www.oracle.com/br/java/technologies/downloads/#java17) como linguagem de programação;
* [WebDriver](https://www.selenium.dev/documentation/webdriver/) - Framework de testes
* [TestNG](https://github.com/cbeust/testng) Framework de testes;
* [Maven](https://maven.apache.org/) como ferramenta de build e gerenciamento de dependências.
* [SonarLint](https://www.sonarsource.com/knowledge/languages/java/) - Linter
* [SonarQube](https://www.sonarsource.com/products/sonarqube/) - Ferramenta de DAST e SAST


## Workflow de branches
Este projeto utiliza o [GitFlow](https://www.atlassian.com/br/git/tutorials/comparing-workflows/gitflow-workflow#:~:text=O%20Gitflow%20%C3%A9%20um%20fluxo,para%20gerenciar%20ramifica%C3%A7%C3%B5es%20do%20Git.).

## Processo de Pull Request

Para integrar código na branch `master`, o seguinte processo deve ser seguido:

1. Implemente a funcionalidade, crie os testes e garanta que tudo está funcionando localmente.
2. Crie o pull request. Colocando na descrição os seguintes ítens:
    * Descrição das alterações e a motivação.
    * É recomendada a criação de uma issue para cada pull request, então, se houver uma issue, referencie ela na descrição do PR.
3. O pull request deve ser aprovado por ao menos 1 outro contribuidor do projeto.
4. O revisor apenas deve aprovar MRs que sigam as seguintes condições:
    * Se aplicável,foram criados testes unitários para os códigos alterados.
    * Se aplicável, foram criados testes de integração.
    * Não foram criados code smells, vulnerabilities ou bugs no [SonarLint].
    * O código alterado não possui duplicação.
5. Após a aprovação de ao menos 1 revisor, algum mantainer do projeto pode fazer o pull.
    
### Regras de versionamento
Este projeto utiliza [Semantic Versioning 2.0.0](https://semver.org/) para a definição do número de versão.

Para lançamento de versões pré-release, deve ser adicionada a label `.rc-[0-9]` no final da versão.

Por exemplo, a primeira pré-release da versão `1.0.0` teria o número `1.0.0.rc-1` e a segunda `1.0.0.rc-2`.

O lançamento de pré-releases é opcional.

## Publicação de uma nova versão
EM CONSTRUÇÃO

### Idioma
As seguintes regras devem ser seguidas em relação ao idioma utilizado no projeto:

* Todo o código-fonte deve ser escrito em **inglês**.
* Nome de branches podem ser em **inglês**.
* Mensagens de commits devem ser em **inglês**.
* Documentação do projeto (README, CONTRIBUTING, etc) deve ser escrita em **português**.
* Issues e toda a informação relacionada a um pull request (descrição, comentários) deve ser escrita em **inglês**.

## SonarLint
Antes de enviar o código para o repositório, deve ser realizada a verificação pelo SonarLint