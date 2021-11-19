package stepsDefinitions;

import baseClass.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.AgendaDeContatosTest;

public class AgendaDeContatosStep extends BaseSteps {

	AgendaDeContatosTest agenda = new AgendaDeContatosTest();

	// Contexto
	@Dado("^que o usuario acesse o servico de agenda$")
	public void queOUsuarioAcesseOServicoDeAgenda() throws Throwable {
		agenda.abrirPaginaDeAgenda();
	}

	// Cenario 1
	@Dado("^que o usuario clique no botao adicionar$")
	public void queOUsuarioCliqueNoBotaoAdicionar() throws Throwable {
		agenda.clicarEmAdicionar();
	}

	@Quando("^adicionar novo contato$")
	public void adicionarNovoContato() throws Throwable {
		agenda.preencherCampoNomeComPeloMenosTresCaracteres();
		agenda.preencherCampoTelefoneComPeloMenosOitoCaracteres();
		agenda.clicarEmAdicionarContato();
	}

	@Entao("^deve verificar que um novo contato foi adicionado na agenda$")
	public void deveVerificarQueUmNovoContatoFoiAdicionadoNaAgenda() throws Throwable {
		agenda.verificaContatoAdicionado();
	}

	// Cenario 2

	@Quando("^tentar inserir um contato ja existente$")
	public void tentarInserirUmContatoJaExistente() throws Throwable {
		agenda.preencherCampoNomeComPeloMenosTresCaracteres();
		agenda.preencherCampoTelefoneComPeloMenosOitoCaracteres();
		agenda.clicarEmAdicionarContato();
	}

	@Entao("^o sistema retorna a mensagem \"([^\"]*)\"$")
	public void oSistemaRetornaAMensagem(String mensagemEsperada) throws Throwable {
		agenda.verificaAlerta(mensagemEsperada);
	}

	// Cenario 3
	@Dado("^que o usuario verifique que existe um contato da pagina inicial$")
	public void queOUsuarioVerifiqueQueExisteUmContatoDaPaginaInicial() throws Throwable {
		agenda.verificaUsuarioExistente();
	}

	@Quando("^clicar no icone de excluir contato$")
	public void clicarNoIconeDeExcluirContato() throws Throwable {
		agenda.clicarEmExcluir();
	}

	@Entao("^deve verificar que o contato foi excluido$")
	public void deveVerificarQueOContatoFoiExcluido() throws Throwable {
		agenda.verificaContatoExcluido();
	}

	// Cenario 4
	@Quando("^eu adicionar um nome menor que a quantindade minima permitida$")
	public void euAdicionarUmNomeMenorQueAQuantindadeMinimaPermitida() throws Throwable {
		agenda.tentarAdicionarContatoComNomeMenorQueTresCaracteres();
		agenda.preencherCampoTelefoneComPeloMenosOitoCaracteres();
	}

	// Cenario 5
	@Quando("^eu adicionar um telefone menor que a quantindade minima permitida$")
	public void euAdicionarUmTelefoneMenorQueAQuantindadeMinimaPermitida() throws Throwable {
		agenda.preencherCampoNomeComPeloMenosTresCaracteres();
		agenda.preencherCampoTelefoneMenorQueAQuantidadeMinima();
	}

}
