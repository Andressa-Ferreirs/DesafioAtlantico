package pageObjects;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BasePage;

public class AgendaDeContatosTest extends BasePage {

	/* Constantes */
	private String URL = "http://localhost:8080/";
	private String nome = "Andressa";
	private String telefone = "99888888";
	private String nomeMenor = "Sm";
	private String telefoneMenor = "998888";

	/* Web Elements */
	private By botaoAdicionar = By.xpath("//*[@id=\"app\"]/button");
	private By inputNome = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div[2]/input");
	private By inputTelefone = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div[3]/input");
	private By botaoAdicionarContato = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/button[1]");
	private By botaoCancelar = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/button[2]");
//	private By spanNomeJaExiste = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/span");
	private By iconeExcluir = By.xpath("//*[@id=\"app\"]/table/tbody/tr[2]/td[3]");
	private By listaContatos = By.xpath("//*[@id=\"app\"]/table/tbody/tr[2]");
	

	public void abrirPaginaDeAgenda() throws InterruptedException {
		browser.get(URL);
	}

	public void clicarEmAdicionar() {
		browser.findElement(botaoAdicionar).click();
	}

	public void preencherCampoNomeComPeloMenosTresCaracteres() throws InterruptedException {
		Thread.sleep(2000);
		browser.findElement(inputNome).click();
		browser.findElement(inputNome).sendKeys(nome);
	}

	public void preencherCampoTelefoneComPeloMenosOitoCaracteres() throws InterruptedException {
		Thread.sleep(2000);
		browser.findElement(inputTelefone).click();
		browser.findElement(inputTelefone).sendKeys(telefone);
	}

	public void clicarEmAdicionarContato() throws InterruptedException {
		Thread.sleep(2000);
		browser.findElement(botaoAdicionarContato).click();
	}

	public void verificaContatoAdicionado() throws InterruptedException {
		Thread.sleep(3000);
		String NomeDeContato = browser.findElement(By.xpath("//*[@id=\"app\"]/table/tbody/tr[2]/td[1]")).getText();
		Assert.assertEquals("Andressa", NomeDeContato);
		System.out.println("O contato foi adicionado com sucesso!");
	}

	public void tentarClicarEmAdicionarContato() throws InterruptedException {
		Thread.sleep(2000);
		browser.findElement(botaoAdicionarContato).click();
	}

	public void verificaAlerta(String mensagemEsperada) throws InterruptedException {
		switch (mensagemEsperada) {
		case "Insira um nome (min. length: 3)":
			verificarMensagemEmNome(mensagemEsperada);
			break;
		case "Insira um telefone (min. length 8)":
			verificarMensagemEmTelefone(mensagemEsperada);
			break;
		default:
			verificaMensagemDeContatoJaExistente(mensagemEsperada);
			break;	
		}
	}

	public void verificaMensagemDeContatoJaExistente(String mensagemEsperada) throws InterruptedException {
		Thread.sleep(3000);
		String spanContatoExistente = browser
				.findElement(By.cssSelector("#app > div.modal.fade.in > div > div > div.modal-body > span")).getText();
		spanContatoExistente.contains(mensagemEsperada);
		System.out.println("O nome do contato informado já exite na agenda.");

		browser.findElement(botaoCancelar).click();
		Thread.sleep(2000);
	}

	public void verificaUsuarioExistente() throws InterruptedException {
		Thread.sleep(3000);
		String NomeDeContato = browser.findElement(By.xpath("//*[@id=\"app\"]/table/tbody/tr[2]/td[1]")).getText();
		Assert.assertEquals("Andressa", NomeDeContato);
		System.out.printf("O contato existente é de: ", NomeDeContato);
	}

	public void clicarEmExcluir() {
		browser.findElement(iconeExcluir).click();
		System.out.println("Contato excluído com sucesso!");
	}

	public void verificaContatoExcluido() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> expected = browser.findElements(listaContatos);
		System.out.println(expected.size());
		assertThat(expected.size(), is(0));
	}

	public void tentarAdicionarContatoComNomeMenorQueTresCaracteres() throws InterruptedException {
		Thread.sleep(2000);
		browser.findElement(inputNome).click();
		browser.findElement(inputNome).sendKeys(nomeMenor);
	}

	public void verificarMensagemEmNome(String mensagemEsperada) throws InterruptedException {
		Thread.sleep(3000);
		String spanNome = browser.findElement(By.xpath("//*/div/div[contains(@class,'with-errors')]")).getText();
		Thread.sleep(2000);
		System.out.println(spanNome);

		Assert.assertEquals(mensagemEsperada, spanNome);

		System.out.println("O nome possui menos que a quantidade minima de caracteres.");
		browser.findElement(botaoCancelar).click();
	}

	public void preencherCampoTelefoneMenorQueAQuantidadeMinima() throws InterruptedException {
		Thread.sleep(2000);
		browser.findElement(inputTelefone).click();
		browser.findElement(inputTelefone).sendKeys(telefoneMenor);
	}

	public void verificarMensagemEmTelefone(String mensagemEsperada) throws InterruptedException {
		Thread.sleep(3000);
		String spanTelefone = browser.findElement(By.xpath("//*/div/div[contains(@class,'with-errors')]")).getText();
		Thread.sleep(2000);
		System.out.println(spanTelefone);

		Assert.assertEquals(mensagemEsperada, spanTelefone);

		System.out.println("O telefone possui menos que a quantidade minima de caracteres.");
		browser.findElement(botaoCancelar).click();
	}

}
