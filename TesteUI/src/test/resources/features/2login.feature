#language:pt
#Author: brianoliveira228@hotmail.com

@regressivos @login
Funcionalidade: Realizar o login
  Eu como cliente quero ter facilidade para acessar minha conta

  Fundo: Acessar o site
    Dado que eu acesse o site "https://www.advantageonlineshopping.com/#/"

  @positivo
  Cenario: Validar login com sucesso
    E clique no botao de acesso ao usuario
    Entao preencho os campos de login
    E valido login tirando print
    Entao clico em SIGN IN
    E tiro um print da pagina com o login acessado
    Entao fecho o navegador

  @negativo @smoketeste
  Cenario: Validar o nao acesso com apenas o usuario
    E clique no botao de acesso ao usuario
    Entao preencho o usuario
    E valido tirando print do botao SING IN desativado
    Entao fecho o navegador

  @negativo @smoketeste
  Cenario: Validar o não login com conta inexistente
    E clique no botao de acesso ao usuario
    Entao preencho os campos de login inexistente
    Entao clico em SIGN IN
    Entao valido texto "Incorrect user name or password."
    E tiro print
    Entao fecho o navegador
