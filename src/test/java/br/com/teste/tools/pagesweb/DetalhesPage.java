package br.com.teste.tools.pagesweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import br.com.teste.practice.utilitarios.UtilsWeb;

public class DetalhesPage extends UtilsWeb {

	@SuppressWarnings("unused")
	
	private WebDriver driverWeb;

	public DetalhesPage(WebDriver driverWeb) {
		this.driverWeb = driverWeb;
		PageFactory.initElements(driverWeb, this);
	}
	
	// Certificado Chrome: Botão Avançado
	@FindBy(xpath = "//*[@id='details-button']")
	public WebElement btnAvancadoChrome;

	// Certificado Chrome: Link Ok
	@FindBy(xpath = "//*[@id='proceed-link']")
	public WebElement linkCertificadoOkChrome;

	// Certificado IE: Link Mais Informações
	@FindBy(id = "moreInfoContainer")
	public WebElement btnMaisInformacoesIe;

	// Certificado IE: Continuar
	@FindBy(id = "overridelink")
	public WebElement btnContinuarIe;
	
	// Campo para o if so site
	@FindBy(xpath = "//input[@id='userName']")
	public WebElement txtCpf;
	
	//Imagem Site
	@FindBy (xpath = "//img[contains(@src, 'http://automationpractice.com/img/logo.jpg')]")
	public WebElement logoYourLogo;
	
	//Pagina de Autenticação
	@FindBy (xpath = "//span[contains(.,'Authentication')]")
	public WebElement lblAutenticacao;
	
	//Clicar no MEnu Entrar
	@FindBy (xpath = "//a[@class='login']")
	public WebElement clicarEntrar;
	
	// Campo Email
	@FindBy(id = "email_create")
	public WebElement txtEmail;
	
	//Colocar neste campo o e-mail de criação : ex. theauaiw@tempsky.top
	@FindBy (xpath ="//input[@id='email_create']")
	public WebElement criarEmail;
	
	//Colocar neste campo o e-mail de criação : ex. theauaiw@tempsky.top
	@FindBy (xpath ="//input[@id='email']")
	public WebElement loginEmail;
	
	// Campo senha
	@FindBy(xpath = "//input[contains(@data-validate, 'isPasswd')]")
	public WebElement loginSenha;
	
	//Clicar no Titulo Criar uma Conta
	@FindBy (xpath ="//span[contains(., 'Create an account')]")
	public WebElement botaoCriarConta;
	
	//Clicar no Titulo Criar uma Conta
	@FindBy (xpath ="//h1[contains(., 'Create an account')]")
	public WebElement titulaCriarConta;
	
	// Campo Radio Button Mr.
	@FindBy(xpath = "//div[contains(@id, 'uniform-id_gender1')]")
	public WebElement buttonGenero1;
	
	// Campo Radio Button Mrs.
	@FindBy(xpath = "//div[contains(@id, 'uniform-id_gender2')]")
	public WebElement buttonGenero2;
	
	// Campo Primeiro Nome
	@FindBy(xpath = "//input[contains(@id, 'customer_firstname')]")
	public WebElement campoPrimeiroNome;
	
	// Campo segundo Nome
	@FindBy(xpath = "//input[contains(@id, 'customer_lastname')]")
	public WebElement campoSegundoNome;
	
	// Campo Email
	@FindBy(xpath = "//input[contains(@id, 'email')]")
	public WebElement campoEmail;
	
	// Campo senha
	@FindBy(xpath = "//input[contains(@id, 'passwd')]")
	public WebElement campoSenha;
	
	// Campo dia
	@FindBy(xpath = "//select[contains(@id, 'days')]")
	public WebElement campoDia;
	
	// Escolha dia
	@FindBy(xpath = "//option[contains(@value, '7')]")
	public WebElement escolhaDia;
	
	// Campo mes
	@FindBy(xpath = "//select[contains(@id, 'months')]")
	public WebElement campoMes;
		
	// Escolha mes
	@FindBy(xpath = "//option[contains(., 'July')]")
	public WebElement escolhaMes;
	
	// Campo ano
	@FindBy(xpath = "//select[contains(@id, 'years')]")
	public WebElement campoAno;
		
	// Escolha ano
	@FindBy(xpath = "//option[contains(@value, '1995')]")
	public WebElement escolhaAno;
	
	// Escolhar Newslatter
	@FindBy(xpath = "//input[@id= 'newsletter']")
	public WebElement escolhaNewslatter;
	
	// Campo Primeiro Nome Empresa
	@FindBy(xpath = "//input[contains(@id, 'firstname')]")
	public WebElement campoPrimeiroNomeEmpresa;
		
	// Campo segundo Nome Empresa
	@FindBy(xpath = "//input[contains(@id, 'lastname')]")
	public WebElement campoSegundoNomeEmpresa;
	
	// Campo Empresa
	@FindBy(xpath = "//input[contains(@id, 'company')]")
	public WebElement campoCompany;
	
	// Campo Endereço
	@FindBy(xpath = "//input[contains(@id, 'address1')]")
	public WebElement campoEndereco;
	
	// Campo Cidade
	@FindBy(xpath = "//input[contains(@id, 'city')]")
	public WebElement campoCidade;
	
	// Campo Estado
	@FindBy(xpath = "//select[contains(@id, 'id_state')]")
	public WebElement campoEstado;
	
	// Escolha ano
	@FindBy(xpath = "//option[contains(.,'New York')]")
	public WebElement escolhaEstado;
	
	// Campo CEP
	@FindBy(xpath = "//input[contains(@id, 'postcode')]")
	public WebElement campoCEP;
	
	// Campo Pais
	@FindBy(xpath = "//select[contains(@id, 'id_country')]")
	public WebElement campoPais;
	
	// Campo Pais
	@FindBy(xpath = "//option[contains(., 'United States')]")
	public WebElement escolhaPais;
	
	// Campo Pais
	@FindBy(xpath = "//input[contains(@id, 'phone_mobile')]")
	public WebElement campoCelular;
	
	// Campo Meu Endereço
	@FindBy(xpath = "//input[contacins(@id, 'alias')]")
	public WebElement myAndress;
	
	// Botão Confirmar Registro
	@FindBy(xpath = "//button[@id= 'submitAccount']")
	public WebElement confirmarRegistro;
	
	// Botão Confirmar Registro
	@FindBy(xpath = "//span[contains(.,'Sign in')]")
	public WebElement botaoLogin;
	
	// Tela Minha Conta
	@FindBy(xpath = "//span[contains(., 'My account')]")
	public WebElement minhaContaTela;
	
	// Tela Minha Conta
	@FindBy(xpath = "//a[contains(@href, 'http://automationpractice.com/index.php?id_category=8&controller=category')]")
	public WebElement telaCompras;
	
	// Escolher Printed Chiffon Dress na cor verde e tamanho "M"
	@FindBy(xpath = "//a[contains(@href, 'http://automationpractice.com/index.php?id_product=7&controller=product')]")
	public WebElement escolherChiffon;
	
	// Escolher Cor Verdade
	@FindBy(xpath = "//a[contains(@title, 'Green')]")
	public WebElement escolherVerde;
	
	// Botao Adicionar Carrinho
	@FindBy(xpath = "//button[contains(@class, 'exclusive')]")
	public WebElement botaoAdicionarCarrinho;
	
	// Botao Continue shoppinh
	@FindBy(xpath = "//span[contains(., 'Continue shopping')]")
	public WebElement botaoContinuarCompra;
	
	// Botao Terminar
	@FindBy(xpath = "//span[contains(., 'Proceed to checkout')]")
	public WebElement botaoTerminar;
	
	// Botao Finalizar Compra
	@FindBy(xpath = "//a[contains(@class, 'button btn btn-default standard-checkout button-medium')]")
	public WebElement botaoTerminarFinalizar;
	
	// Botao Finalizar Compra Endereço
	@FindBy(xpath = "//button[contains(@class, 'button btn btn-default button-medium')]")
	public WebElement botaoFinalizarEndereco;
	
	// Botao Finalizar Compra Entrega
	@FindBy(xpath = "//button[contains(@class, 'button btn btn-default standard-checkout button-medium')]")
	public WebElement botaoFinalizarEntrega;
	
	// Escolher M
	@FindBy(xpath = "//input[@id='layered_id_attribute_group_2']")
	public WebElement escolherM;
	
	// Campo Escolher M
	@FindBy(xpath = "//select[@id='group_1']")
	public WebElement campoMDress;
	
	// Escolher M
	@FindBy(xpath = "//option[@title='M']")
	public WebElement escolherMDress;
	
	
	// Selecionar T-shirts
	@FindBy(xpath = "//a[@title='T-shirts']")
	public WebElement escolherTshirt;
	
	// Escolher Faded Short Sleeve T-shirts na cor azul
	@FindBy(xpath = "//a[contains(., 'Faded Short Sleeve T-shirts')]")
	public WebElement escolherFadedShort;
	
	// Escolher Women
	@FindBy(xpath = "//a[contains(@title, 'Women')]")
	public WebElement escolherMenuWomen;
	
	// Escolher Tops
	@FindBy(xpath = "//a[@title='Tops']")
	public WebElement escolherTop;
	
	// Escolher Blusa
	@FindBy(xpath = "//img[contains(@src, 'http://automationpractice.com/img/p/7/7-home_default.jpg')]")
	public WebElement escolherBlusa;
	
	// Escolher Blusa
	@FindBy(xpath = "//input[contains(@id, 'quantity_wanted')]")
	public WebElement mudarQuantidade;
	
	// Aumentar numero da blusa
	@FindBy(xpath = "//i[contains(@class, 'icon-plus')]")
	public WebElement aumentarQuantidade;
	
	// Selecionar Terms of service
	@FindBy(xpath = "//input[@id='cgv']")
	public WebElement assinalarTermsService;
	
	// Selecionar Forma de Pagamento Bank
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	public WebElement tipoPagamentoBanco;
	
	// Botao Finalizar Ordem de COmpra
	@FindBy(xpath = "//span[contains(., 'I confirm my order')]")
	public WebElement botaoFinalizarOrdemCompra;
	
	// Tela Final da Compra
	@FindBy(xpath = "//strong[contains(., 'Your order on My Store is complete.')]")
	public WebElement telaFinalCompra;
	
	public void clicarFinalizarEntrega() {
		botaoFinalizarEntrega.click();
	}	
	
	public void clicarFinalizarEndereco() {
		botaoFinalizarEndereco.click();
	}	
	
	public void clicarFinalizarCompra() {
		botaoFinalizarOrdemCompra.click();
	}	
	
	public void escolherTipoPagamento() {
		tipoPagamentoBanco.click();
	}	
	
	public void clicarTemsService() {
		assinalarTermsService.click();
	}	
		
	public void clicarTerminarFinalizar() {
		botaoTerminarFinalizar.click();
	}
	
	public void aumentarQuantidadeBlusa() {
		aumentarQuantidade.click();
	}
	
	public void mudarQuantidadeBlusa() {
		mudarQuantidade.click();
	}

	public void escolherBlouse() {
		escolherBlusa.click();
	}
	
	public void escolherBlusaTop() {
		escolherTop.click();
	}
	
	public void clicarMenuWomen() {
		escolherMenuWomen.click();
	}
		
	public void escolherFaded() {
		escolherFadedShort.click();
	}
	
	public void escolhershirt() {
		escolherTshirt.click();
	}
	
	public void escolherTamanhoM() {
		escolherM.click();
	}
	
	public void campoEscolherTamanho() {
		campoMDress.click();
	}
	
	public void escolherTamanhoMDress() {
		escolherMDress.click();
	}
	
	public void continuarCompra() {
		botaoContinuarCompra.click();
	}
	
	public void terminarCompra() {
		botaoTerminar.click();
	}
	
	public void adicionarCarrinho() {
		botaoAdicionarCarrinho.click();
	}
	
	public void escolhercorVerde() {
		escolherVerde.click();
	}
	
	public void clicarChiffon() {
		escolherChiffon.click();
	}
	
	public void clicarTelaCompras() {
		telaCompras.click();
	}

	public void clicarLogo() {
		logoYourLogo.click();
	}
	
	public void clicarEntrarSite() {
		clicarEntrar.click();
	}
	
	public void clicarCampoCriarEmail() {
		criarEmail.click();
	}
	
	public void clicarCriarConta() {
		botaoCriarConta.click();
	}
	
	public void digitarEmailNovo(String emailNovo) {
		txtEmail.sendKeys(emailNovo);
	}
	
	public void digitarLoginEmail(String emailLogin) {
		loginEmail.sendKeys(emailLogin);
	}
	
	public void digitarSenhaLogin (String senhaLogin) {
		loginSenha.sendKeys(senhaLogin);
	}
	
	public void sexoFeminino() {
		buttonGenero2.click();
	}
	
	public void escolheNewslatter() {
		escolhaNewslatter.click();
	}
	
	public void primeiroNome (String primeiroNome) {
		campoPrimeiroNome.sendKeys(primeiroNome);
	}
	
	public void segundoNome (String segundoNome) {
		campoSegundoNome.sendKeys(segundoNome);
	}
	
	public void campoEmailColocar (String emailcadastro) {
		campoEmail.sendKeys(emailcadastro);
	}
	
	public void campoSenhaCadastro (String senhaCadastro) {
		campoSenha.sendKeys(senhaCadastro);
	}
	
	public void nomeEmpresaPreencher (String nomeEmpresa) {
		campoCompany.sendKeys(nomeEmpresa);
	}
	
	public void nomeEndereco (String Endereco) {
		campoEndereco.sendKeys(Endereco);
	}
	
	public void clicarCidade() {
		campoCidade.click();
	}
	
	public void nomeEstado() {
		campoEstado.click();
	}
	
	public void escolhaEstado() {
		escolhaEstado.click();
	}
	
	public void nomeCidade (String Cidade) {
		campoCidade.sendKeys(Cidade);
	}
	
	public void clicarCampoDia() {
		campoDia.click();
	}
	
	public void escolherDia() {
		escolhaDia.click();
	}
	
	public void clicarCampoMes() {
		campoMes.click();
	}
	
	public void escolherMes() {
		escolhaMes.click();
	}
	
	public void clicarCampoAno() {
		campoAno.click();
	}
	
	public void escolherAno() {
		escolhaAno.click();
	}
	
	public void escolherNewslatter() {
		escolhaNewslatter.click();
	}
	
	public void colocarCep (String CEP) {
		campoCEP.sendKeys(CEP);
	}
	
	public void colocarPais () {
		campoPais.click();
	}
	
	public void escolherPais () {
		escolhaPais.click();
	}
	
	public void campoCelularPreencher(String Celular) {
		campoCelular.sendKeys(Celular);
	}
	
	public void campoEnderecoPreencher(String enderecoConfirma) {
		myAndress.sendKeys(enderecoConfirma);
	}
	
	public void confirmarContaNova () {
		confirmarRegistro.click();
	}
	
	public void botaoConfirmarLogin () {
		botaoLogin.click();
	}
	
	public void mudarQuantidadeBlouse(String quantidade) {
		mudarQuantidade.sendKeys(quantidade);
	}
	
	public void clicarAvancadoChrome() {
		btnAvancadoChrome.click();
	}

	public void clicarLinkCertificadoOkChrome() {
		linkCertificadoOkChrome.click();
	}

	public void clicarMaisInformacoesIe() {
		btnMaisInformacoesIe.click();
	}

	public void clicarContinuarIe() {
		btnContinuarIe.click();
	}
	
}