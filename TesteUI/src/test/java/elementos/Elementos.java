package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By login = By.id("menuUserLink");
	private By criarConta = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By usernameConta = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input");
	private By email = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input");
	private By passwordConta = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input");
	private By confirmPassword = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input");
	private By firstName = By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input");
	private By lastName = By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input");
	private By phoneNumber = By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input");
	private By city = By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input");
	private By address = By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input");
	private By postalCode = By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input");
	private By checkbox1 = By.xpath("//*[@id=\"formCover\"]/div[4]/input");
	private By checkbox2 = By.xpath("//*[@id=\"formCover\"]/sec-view/div/input");
	private By register = By.id("register_btnundefined");
	private By contaDuplicada = By.xpath("//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]");
	private By descerPagina = By.xpath("//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[2]/a");
	private By usernameLogin = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input");
	private By passwordLogin = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input");
	private By enviar = By.id("sign_in_btnundefined");
	private By loginInexistente = By.id("signInResultMessage");
	private By myAccount = By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]");
	private By deleteAccount = By.xpath("//*[@id=\"myAccountContainer\"]/div[6]/button/div");
	private By validarTexto = By.xpath("//*[@id=\"deleteAccountPopup\"]/div[2]/p");
	private By confirmaExclusao = By.xpath("//*[@id=\"deleteAccountPopup\"]/div[3]/div[1]");

	public By getLogin() {
		return login;
	}

	public By getCriarConta() {
		return criarConta;
	}

	public By getUsernameConta() {
		return usernameConta;
	}

	public By getEmail() {
		return email;
	}

	public By getPasswordConta() {
		return passwordConta;
	}

	public By getConfirmPassword() {
		return confirmPassword;
	}

	public By getFirstName() {
		return firstName;
	}

	public By getLastName() {
		return lastName;
	}

	public By getPhoneNumber() {
		return phoneNumber;
	}

	public By getCity() {
		return city;
	}

	public By getAddress() {
		return address;
	}

	public By getPostalCode() {
		return postalCode;
	}

	public By getCheckbox1() {
		return checkbox1;
	}

	public By getCheckbox2() {
		return checkbox2;
	}

	public By getRegister() {
		return register;
	}

	public By getContaDuplicada() {
		return contaDuplicada;
	}

	public By getDescerPagina() {
		return descerPagina;
	}

	public By getUsernameLogin() {
		return usernameLogin;
	}

	public By getPasswordLogin() {
		return passwordLogin;
	}

	public By getEnviar() {
		return enviar;
	}

	public By getLoginInexistente() {
		return loginInexistente;
	}

	public By getMyAccount() {
		return myAccount;
	}

	public By getDeleteAccount() {
		return deleteAccount;
	}

	public By getValidarTexto() {
		return validarTexto;
	}

	public By getConfirmaExclusao() {
		return confirmaExclusao;
	}

}
