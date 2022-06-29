#language:pt
#Author: brianoliveira228@hotmail.com

@regressivos @criarconta
Funcionalidade: Criar uma conta
  Eu como cliente quero ter facilidade para criar minha conta

  Fundo: Acessar o site
    Dado que eu acesse o site "https://www.advantageonlineshopping.com/#/"

  @positivo @smoketeste
  Cenario: Validar cadastro da conta com sucesso
    E clique no botao de acesso ao usuario
    Quando clicar em CREATE NEW ACCOUNT
    Entao valido a url
    E a pagina de cadastro tirando print
    E preencho os campos de cadastro
    E desmarco o primeiro checkbox
    E marco o segundo checkbox
    Entao clico em REGISTER
    E fecho o navegador

  @negativo @smoketeste
  Cenario: Validar o nao cadastro sem os campos obrigatorios
    E clique no botao de acesso ao usuario
    Quando clicar em CREATE NEW ACCOUNT
    Entao valido a url
    E a pagina de cadastro tirando print
    E preencho os campos nao obrigatorios de cadastro
    E desmarco o primeiro checkbox
    E marco o segundo checkbox
    Entao desco a pagina
    E valido tirando print do botao REGISTER desativado
    E fecho o navegador

  @negativo @smoketeste
  Cenario: Validar o nao cadastro de uma conta ja cadastrada
    E clique no botao de acesso ao usuario
    Quando clicar em CREATE NEW ACCOUNT
    Entao valido a url
    E a pagina de cadastro tirando print
    E preencho os campos de cadastro
    E desmarco o primeiro checkbox
    E marco o segundo checkbox
    Entao clico em REGISTER
    E valido o texto1 "User name already exists"
    E fecho o navegador
