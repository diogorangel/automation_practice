package br.com.teste.tools.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import br.com.bradesco.automacaocartoes.core.DriverFactory;
import br.com.teste.practice.utilitarios.UtilsWeb;
import br.com.teste.tools.pagesweb.DetalhesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

@SuppressWarnings({ "unused" })
public class CompraSteps extends UtilsWeb {

	public static WebDriver driverWeb = DriverFactory.getDriverWeb();

	DetalhesPage Page= new DetalhesPage(driverWeb);
	
	@Given("Como um cliente novo no automation practice {string} {string} {string}")
	public void cliente_practice(String site, String rede, String emailNovo) throws InterruptedException {

		if (rede.toLowerCase().equals("redeautomation")) {
			switch (site) {
			case "Site":
				abrirUrl("http://automationpractice.com/index.php");
				System.out.println("Site Informado");
				break;
			}
		} else {
			switch (site) {
			case "Site":
				abrirUrl("http://automationpractice.com/index.php");
				System.out.println("Site Informado");
				break;
			}
		}
		maximizarPaginaWeb();
		espera(4);
		Assert.assertTrue(elementoExiste(Page.logoYourLogo));
		esperaElemento(Page.clicarEntrar, 60);
		Page.clicarEntrarSite();
		esperaElemento(Page.criarEmail, 60);
		esperaElemento(Page.lblAutenticacao, 60);
	}
	
	@Given("Como um cliente novo no automationpractice {string} {string} {string} {string}")
	public void cliente_novo_practice(String site, String rede, String emailLogin,String loginSenha ) throws InterruptedException {

		if (rede.toLowerCase().equals("redeautomation")) {
			switch (site) {
			case "Site":
				abrirUrl("http://automationpractice.com/index.php");
				System.out.println("Site Informado");
				break;
			}
		} else {
			switch (site) {
			case "Site":
				abrirUrl("http://automationpractice.com/index.php");
				System.out.println("Site Informado");
				break;
			}
		}
		maximizarPaginaWeb();
		espera(4);
		Assert.assertTrue(elementoExiste(Page.logoYourLogo));
		esperaElemento(Page.clicarEntrar, 60);
		Page.clicarEntrarSite();
		esperaElemento(Page.loginEmail, 60);
		esperaElemento(Page.loginSenha, 60);
		esperaElemento(Page.lblAutenticacao, 60);
		scrollAteOElemento(Page.lblAutenticacao);
		Page.digitarLoginEmail(emailLogin);
		espera(2);
		Page.digitarSenhaLogin(loginSenha);
		espera(2);
		Page.botaoConfirmarLogin();
		esperaElemento(Page.minhaContaTela, 60);
		Assert.assertTrue(elementoExiste(Page.logoYourLogo));
	}

	@Then("Eu quero fazer a compra de ao menos três produtos {string}")
	public void fazer_compra(String quantidade) throws InterruptedException {
		esperaElemento(Page.minhaContaTela, 60);
		Assert.assertTrue(elementoExiste(Page.logoYourLogo));
		espera(3);
		//Page.clicarTelaCompras();
		abrirUrl("http://automationpractice.com/index.php?id_category=8&controller=category");
		espera(5);
		Page.escolherTamanhoM();
		esperaElemento(Page.escolherChiffon, 60);
		espera(2);
		esperaElemento(Page.escolherChiffon, 60);
		Page.clicarChiffon();
		espera(7);
		abrirUrl("http://automationpractice.com/index.php?id_product=7&controller=product");
		esperaElemento(Page.botaoAdicionarCarrinho, 60);
		espera(7);
		Page.campoEscolherTamanho();
		espera(2);
		Page.escolherTamanhoMDress();
		esperaElemento(Page.escolherVerde, 60);
		Page.escolhercorVerde();
		esperaElemento(Page.botaoAdicionarCarrinho,60);
		Page.adicionarCarrinho();
		esperaElemento(Page.botaoContinuarCompra,60);
		Page.continuarCompra();
		//Page.clicarTelaCompras();
		//esperaElemento(Page.escolherTshirt,60);
		//Page.escolhershirt();
		abrirUrl("http://automationpractice.com/index.php?id_category=5&controller=category");
		espera(2);
		esperaElemento(Page.escolherFadedShort,60);
		scrollAteOElemento(Page.escolherFadedShort);
		Page.escolherFaded();
		abrirUrl("http://automationpractice.com/index.php?id_product=1&controller=product");
		espera(7);
		esperaElemento(Page.botaoAdicionarCarrinho,60);
		Page.adicionarCarrinho();
		esperaElemento(Page.botaoContinuarCompra,60);
		Page.continuarCompra();
		esperaElemento(Page.escolherMenuWomen,60);
		Page.clicarMenuWomen();
		espera(10);
		//esperaElemento(Page.escolherTop,60);
		//Page.escolherBlusaTop();
		//esperaElemento(Page.escolherBlusa,60);
		scrollAteOElemento(Page.escolherBlusa);
		//Page.escolherBlouse();
		abrirUrl("http://automationpractice.com/index.php?id_product=2&controller=product");
		espera(2);
		esperaElemento(Page.mudarQuantidade,60);
		Page.mudarQuantidadeBlusa();
		Page.aumentarQuantidadeBlusa();
		esperaElemento(Page.botaoAdicionarCarrinho,60);
		Page.adicionarCarrinho();
		esperaElemento(Page.botaoContinuarCompra,60);
		Page.continuarCompra();
		esperaElemento(Page.botaoTerminar,60);
		Page.terminarCompra();	
	}
	
	@Then("Para que eu possa estar bem vestida")
	public void bem_vestida() throws InterruptedException {
		Assert.assertTrue(elementoExiste(Page.logoYourLogo));
		espera(2);
		scrollAteOElemento(Page.botaoTerminarFinalizar);
		Page.clicarTerminarFinalizar();
		Assert.assertTrue(elementoExiste(Page.logoYourLogo));
		esperaElemento(Page.botaoFinalizarEndereco,60);
		scrollAteOElemento(Page.botaoFinalizarEndereco);
		Page.clicarFinalizarEndereco();
		//espera(3);
		//esperaElemento(Page.assinalarTermsService, 60);
		//esperaElemento(Page.botaoFinalizarEntrega, 60);
		scrollAteOElemento(Page.assinalarTermsService);
		Page.clicarTemsService();
		espera(2);
		Page.clicarFinalizarEntrega();
		esperaElemento(Page.logoYourLogo,60);
		esperaElemento(Page.tipoPagamentoBanco,60);
		Assert.assertTrue(elementoExiste(Page.logoYourLogo));
		Assert.assertTrue(elementoExiste(Page.tipoPagamentoBanco));
		Page.escolherTipoPagamento();
		esperaElemento(Page.logoYourLogo,60);
		esperaElemento(Page.botaoFinalizarOrdemCompra,60);
		Assert.assertTrue(elementoExiste(Page.logoYourLogo));
		Assert.assertTrue(elementoExiste(Page.botaoFinalizarOrdemCompra));
		Page.clicarFinalizarCompra();
		espera(2);
		esperaElemento(Page.logoYourLogo,60);
		esperaElemento(Page.telaFinalCompra,60);
		Assert.assertTrue(elementoExiste(Page.logoYourLogo));
		Assert.assertTrue(elementoExiste(Page.telaFinalCompra));
		scrollAteOElemento(Page.telaFinalCompra);
		Assert.assertTrue(elementoExiste(Page.telaFinalCompra));
		espera(2);
	}
	
	@Then("Eu sou um novo usuario {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void novo_usuario (String emailNovo, String primeiroNome, String segundoNome, String emailcadastro, String senhaCadastro, String nomeEmpresa, String Endereco, String Cidade, String CEP, String Celular, String endereco) throws InterruptedException {
		Page.clicarCampoCriarEmail();
		//digitarLetra(Page.txtEmail,emailNovo.toString());
		Page.digitarEmailNovo(emailNovo);
		esperaElemento(Page.botaoCriarConta, 60);
		Page.clicarCriarConta();
		esperaElemento(Page.titulaCriarConta, 60);
		esperaElemento(Page.buttonGenero2, 60);
		Page.sexoFeminino();
		Page.primeiroNome(primeiroNome);
		Page.segundoNome(segundoNome);
		//Page.campoEmailColocar(emailcadastro);
		Page.campoSenhaCadastro(senhaCadastro);
		Page.nomeEmpresaPreencher(nomeEmpresa);
		Page.nomeEndereco(Endereco);
		Page.nomeCidade(Cidade);
		Page.colocarCep(CEP);
		Page.campoCelularPreencher(Celular);
		Page.clicarCidade();
		Page.nomeEstado();
		Page.escolhaEstado();
		Page.clicarCampoDia();
		Page.escolherDia();
		Page.clicarCampoMes();
		Page.escolherMes();
		Page.clicarCampoAno();
		Page.escolherAno();
		Page.escolherNewslatter();
		Page.colocarPais();
		Page.escolherPais();
		Page.escolhaEstado();
		espera(3);
		Page.confirmarContaNova();
		espera(2);
		esperaElemento(Page.minhaContaTela, 60);
	}

}