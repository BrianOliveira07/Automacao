package steps;

import java.io.IOException;
import elementos.Elementos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pages.Metodos;

public class Testes {

	Metodos metodo = new Metodos();
	Elementos codLink = new Elementos();

	@Dado("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String site) {

		metodo.abrirNavegador("Iniciando teste", site, "chrome");

	}

	@E("clique no botao de acesso ao usuario")
	public void clique_no_botao_de_acesso_ao_usuario() throws InterruptedException {

		metodo.tempo(4000);
		metodo.clicar(codLink.getLogin());

	}

	@Quando("clicar em CREATE NEW ACCOUNT")
	public void clicar_em_create_new_account() throws InterruptedException {

		metodo.tempo(2000);
		metodo.clicar(codLink.getCriarConta());

	}

	@Entao("valido a url")
	public void valido_a_url() throws InterruptedException {

		metodo.tempo(2000);
		metodo.validarUrl("https://www.advantageonlineshopping.com/#/register");

	}

	@E("a pagina de cadastro tirando print")
	public void a_pagina_de_cadastro_tirando_print() throws IOException {

		metodo.print("Criando conta");

	}

	@Entao("preencho os campos de cadastro")
	public void preencho_os_campos_de_cadastro() {

		metodo.clicar(codLink.getUsernameConta());
		metodo.escrever(codLink.getUsernameConta(), "Wolverine");
		metodo.clicar(codLink.getEmail());
		metodo.escrever(codLink.getEmail(), "logan.wolverine@live.com");
		metodo.clicar(codLink.getPasswordConta());
		metodo.escrever(codLink.getPasswordConta(), "12345678Jc");
		metodo.clicar(codLink.getConfirmPassword());
		metodo.escrever(codLink.getConfirmPassword(), "12345678Jc");
		metodo.clicar(codLink.getFirstName());
		metodo.escrever(codLink.getFirstName(), "Wolverine");
		metodo.clicar(codLink.getLastName());
		metodo.escrever(codLink.getLastName(), "Logan");
		metodo.clicar(codLink.getPhoneNumber());
		metodo.escrever(codLink.getPhoneNumber(), "11987654321");
		metodo.clicar(codLink.getCity());
		metodo.escrever(codLink.getCity(), "Brasília");
		metodo.clicar(codLink.getAddress());
		metodo.escrever(codLink.getAddress(), "Quadra Q 1 Conjunto D");
		metodo.clicar(codLink.getPostalCode());
		metodo.escrever(codLink.getPostalCode(), "72145-104");

	}

	@E("desmarco o primeiro checkbox")
	public void desmarco_o_primeiro_checkbox() {

		metodo.clicar(codLink.getCheckbox1());

	}

	@E("marco o segundo checkbox")
	public void marco_o_segundo_checkbox() {

		metodo.clicar(codLink.getCheckbox2());

	}

	@Entao("clico em REGISTER")
	public void clico_em_register() throws IOException {

		metodo.print("Finalizando conta");
		metodo.clicar(codLink.getRegister());

	}

	@E("fecho o navegador")
	public void fecho_o_navegador() {

		metodo.fecharNavegador("Finalizando Teste Com Sucesso!");

	}

	@Entao("valido o texto1 {string}")
	public void valido_o_texto1(String texto) throws InterruptedException {

		metodo.tempo(2000);
		metodo.validarTexto(texto, codLink.getContaDuplicada());

	}

	@Entao("preencho os campos nao obrigatorios de cadastro")
	public void preencho_os_campos_nao_obrigatorios_de_cadastro() {

		metodo.clicar(codLink.getFirstName());
		metodo.escrever(codLink.getFirstName(), "Wolverine");
		metodo.clicar(codLink.getLastName());
		metodo.escrever(codLink.getLastName(), "Logan");
		metodo.clicar(codLink.getPhoneNumber());
		metodo.escrever(codLink.getPhoneNumber(), "11987654321");
		metodo.clicar(codLink.getCity());
		metodo.escrever(codLink.getCity(), "Brasília");
		metodo.clicar(codLink.getAddress());
		metodo.escrever(codLink.getAddress(), "Quadra Q 1 Conjunto D");
		metodo.clicar(codLink.getPostalCode());
		metodo.escrever(codLink.getPostalCode(), "72145-104");

	}

	@Entao("desco a pagina")
	public void desco_a_pagina() {

		metodo.descerPagina(codLink.getDescerPagina());

	}

	@Entao("valido tirando print do botao REGISTER desativado")
	public void valido_tirando_print_do_botao_register_desativado() throws IOException {

		metodo.print("Botão REGISTER desativado");

	}

	@Entao("preencho os campos de login")
	public void preencho_os_campos_de_login() throws InterruptedException {

		metodo.tempo(2000);
		metodo.clicar(codLink.getUsernameLogin());
		metodo.escrever(codLink.getUsernameLogin(), "Wolverine");
		metodo.clicar(codLink.getPasswordLogin());
		metodo.escrever(codLink.getPasswordLogin(), "12345678Jc");

	}

	@Entao("valido login tirando print")
	public void valido_login_tirando_print() throws IOException {

		metodo.print("Realizando login");

	}

	@Entao("clico em SIGN IN")
	public void clico_em_sign_in() {

		metodo.clicar(codLink.getEnviar());

	}

	@Entao("tiro um print da pagina com o login acessado")
	public void tiro_um_print_da_pagina_com_o_login_acessado() throws InterruptedException, IOException {

		metodo.tempo(3000);
		metodo.print("Login");

	}

	@Entao("preencho os campos de login inexistente")
	public void preencho_os_campos_de_login_inexistente() throws InterruptedException {

		metodo.tempo(2000);
		metodo.clicar(codLink.getUsernameLogin());
		metodo.escrever(codLink.getUsernameLogin(), "Batman");
		metodo.clicar(codLink.getPasswordLogin());
		metodo.escrever(codLink.getPasswordLogin(), "12345678Jc");

	}

	@Entao("valido texto {string}")
	public void valido_texto(String texto) throws InterruptedException {

		metodo.tempo(2000);
		metodo.validarTexto(texto, codLink.getLoginInexistente());

	}

	@Entao("tiro print")
	public void tiro_print() throws IOException {

		metodo.print("Login invalido");

	}

	@Entao("preencho o usuario")
	public void preencho_o_usuario() throws InterruptedException {

		metodo.tempo(2000);
		metodo.clicar(codLink.getUsernameLogin());
		metodo.escrever(codLink.getUsernameLogin(), "Wolverine");

	}

	@Entao("valido tirando print do botao SING IN desativado")
	public void valido_tirando_print_do_botao_sing_in_desativado() throws IOException {

		metodo.print("Botão SIGN IN desativado");

	}

	@Entao("depois clico no botao de acesso ao usuario")
	public void depois_clico_no_botao_de_acesso_ao_usuario() throws InterruptedException {

		metodo.tempo(3000);
		metodo.clicar(codLink.getLogin());

	}

	@Entao("clico em My Account")
	public void clico_em_my_account() {

		metodo.clicar(codLink.getMyAccount());

	}

	@Quando("carregar a pagina tiro um print")
	public void carregar_a_pagina_tiro_um_print() throws InterruptedException, IOException {

		metodo.tempo(4000);
		metodo.print("Deletando conta");

	}

	@Quando("valido a url1")
	public void valido_a_url1() throws InterruptedException {

		metodo.tempo(1000);
		metodo.validarUrl("https://www.advantageonlineshopping.com/#/myAccount");

	}

	@Entao("desco a pagina1")
	public void desco_a_pagina1() {

		metodo.descerPagina(codLink.getDeleteAccount());

	}

	@Entao("clico em DELETE ACCOUNT")
	public void clico_em_delete_account() {

		metodo.clicar(codLink.getDeleteAccount());

	}

	@Entao("valido o texto {string}")
	public void valido_o_texto(String texto) {

		metodo.validarTexto(texto, codLink.getValidarTexto());

	}

	@Entao("tiro um print")
	public void tiro_um_print() throws IOException, InterruptedException {

		metodo.tempo(2000);
		metodo.print("Finalizando exclusão");

	}

	@Entao("clico em YES")
	public void clico_em_yes() {

		metodo.clicar(codLink.getConfirmaExclusao());

	}

	@Entao("tiro um print da mensagem de confirmacao de exclusao")
	public void tiro_um_print_da_mensagem_de_confirmacao_de_exclusao() throws InterruptedException, IOException {

		metodo.tempo(4000);
		metodo.print("Mensagem de confirmação");

	}

}
