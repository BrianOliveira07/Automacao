#language:pt
#Author: brianoliveira228@hotmail.com

@regressivos @exlusao
Funcionalidade: Excluir a conta
  Eu como cliente quero ter facilidade para deletar minha conta caso não precise mais

  Fundo: Acessar o site
    Dado que eu acesse o site "https://www.advantageonlineshopping.com/#/"

  @positivo
  Cenario: Validar exclusao da conta com sucesso
    E clique no botao de acesso ao usuario
    Entao preencho os campos de login
    E valido login tirando print
    Entao clico em SIGN IN
    E depois clico no botao de acesso ao usuario
    Entao clico em My Account
    Quando carregar a pagina tiro um print
    E valido a url1
    Entao desco a pagina1
    E clico em DELETE ACCOUNT
    E valido o texto "Are sure you want to delete account?"
    E tiro um print
    Entao clico em YES
    E tiro um print da mensagem de confirmacao de exclusao
    Entao fecho o navegador
