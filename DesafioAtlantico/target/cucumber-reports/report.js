$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AgendaDeContatos.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Fazer altera��es em agenda de contatos",
  "description": "",
  "id": "fazer-altera��es-em-agenda-de-contatos",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 212100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Acessar o servi�o de agenda",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 5,
  "name": "que o usuario acesse o servico de agenda",
  "keyword": "Dado "
});
formatter.match({
  "location": "AgendaDeContatosStep.queOUsuarioAcesseOServicoDeAgenda()"
});
formatter.result({
  "duration": 10775016600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Adicionar novo contato",
  "description": "",
  "id": "fazer-altera��es-em-agenda-de-contatos;adicionar-novo-contato",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@AdicionarContato"
    },
    {
      "line": 7,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que o usuario clique no botao adicionar",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "adicionar novo contato",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "deve verificar que um novo contato foi adicionado na agenda",
  "keyword": "Entao "
});
formatter.match({
  "location": "AgendaDeContatosStep.queOUsuarioCliqueNoBotaoAdicionar()"
});
formatter.result({
  "duration": 308913900,
  "status": "passed"
});
formatter.match({
  "location": "AgendaDeContatosStep.adicionarNovoContato()"
});
formatter.result({
  "duration": 6596619700,
  "status": "passed"
});
formatter.match({
  "location": "AgendaDeContatosStep.deveVerificarQueUmNovoContatoFoiAdicionadoNaAgenda()"
});
formatter.result({
  "duration": 3032348900,
  "status": "passed"
});
formatter.after({
  "duration": 81800,
  "status": "passed"
});
formatter.before({
  "duration": 44100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Acessar o servi�o de agenda",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 5,
  "name": "que o usuario acesse o servico de agenda",
  "keyword": "Dado "
});
formatter.match({
  "location": "AgendaDeContatosStep.queOUsuarioAcesseOServicoDeAgenda()"
});
formatter.result({
  "duration": 519679300,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Adicionar contato existente",
  "description": "",
  "id": "fazer-altera��es-em-agenda-de-contatos;adicionar-contato-existente",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 13,
      "name": "@TentarAdicionarContatoJaExistente"
    },
    {
      "line": 13,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "que o usuario clique no botao adicionar",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "tentar inserir um contato ja existente",
  "keyword": "Quando "
});
formatter.step({
  "line": 17,
  "name": "o sistema retorna a mensagem \"Pessoa j� existe.\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "AgendaDeContatosStep.queOUsuarioCliqueNoBotaoAdicionar()"
});
formatter.result({
  "duration": 128582800,
  "status": "passed"
});
formatter.match({
  "location": "AgendaDeContatosStep.tentarInserirUmContatoJaExistente()"
});
formatter.result({
  "duration": 6704782900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pessoa j� existe.",
      "offset": 30
    }
  ],
  "location": "AgendaDeContatosStep.oSistemaRetornaAMensagem(String)"
});
formatter.result({
  "duration": 5139904900,
  "status": "passed"
});
formatter.after({
  "duration": 52200,
  "status": "passed"
});
formatter.before({
  "duration": 76700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Acessar o servi�o de agenda",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 5,
  "name": "que o usuario acesse o servico de agenda",
  "keyword": "Dado "
});
formatter.match({
  "location": "AgendaDeContatosStep.queOUsuarioAcesseOServicoDeAgenda()"
});
formatter.result({
  "duration": 588570300,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Excluir contato",
  "description": "",
  "id": "fazer-altera��es-em-agenda-de-contatos;excluir-contato",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 19,
      "name": "@ExcluirContato"
    },
    {
      "line": 19,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "que o usuario verifique que existe um contato da pagina inicial",
  "keyword": "Dado "
});
formatter.step({
  "line": 22,
  "name": "clicar no icone de excluir contato",
  "keyword": "Quando "
});
formatter.step({
  "line": 23,
  "name": "deve verificar que o contato foi excluido",
  "keyword": "Entao "
});
formatter.match({
  "location": "AgendaDeContatosStep.queOUsuarioVerifiqueQueExisteUmContatoDaPaginaInicial()"
});
formatter.result({
  "duration": 3038822100,
  "status": "passed"
});
formatter.match({
  "location": "AgendaDeContatosStep.clicarNoIconeDeExcluirContato()"
});
formatter.result({
  "duration": 181708500,
  "status": "passed"
});
formatter.match({
  "location": "AgendaDeContatosStep.deveVerificarQueOContatoFoiExcluido()"
});
formatter.result({
  "duration": 2260134600,
  "status": "passed"
});
formatter.after({
  "duration": 42000,
  "status": "passed"
});
formatter.before({
  "duration": 38000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Acessar o servi�o de agenda",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 5,
  "name": "que o usuario acesse o servico de agenda",
  "keyword": "Dado "
});
formatter.match({
  "location": "AgendaDeContatosStep.queOUsuarioAcesseOServicoDeAgenda()"
});
formatter.result({
  "duration": 448963300,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Tentar adicionar novo contato sem a quantidade minima de caracteres no nome",
  "description": "",
  "id": "fazer-altera��es-em-agenda-de-contatos;tentar-adicionar-novo-contato-sem-a-quantidade-minima-de-caracteres-no-nome",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 25,
      "name": "@TentarAdicionarContatoSemQuantidadeMinimaDeCaracteresNoNome"
    },
    {
      "line": 25,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "que o usuario clique no botao adicionar",
  "keyword": "Dado "
});
formatter.step({
  "line": 28,
  "name": "eu adicionar um nome menor que a quantindade minima permitida",
  "keyword": "Quando "
});
formatter.step({
  "line": 29,
  "name": "o sistema retorna a mensagem \"Insira um nome (min. length: 3)\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "AgendaDeContatosStep.queOUsuarioCliqueNoBotaoAdicionar()"
});
formatter.result({
  "duration": 116684400,
  "status": "passed"
});
formatter.match({
  "location": "AgendaDeContatosStep.euAdicionarUmNomeMenorQueAQuantindadeMinimaPermitida()"
});
formatter.result({
  "duration": 4416976400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Insira um nome (min. length: 3)",
      "offset": 30
    }
  ],
  "location": "AgendaDeContatosStep.oSistemaRetornaAMensagem(String)"
});
formatter.result({
  "duration": 5177492400,
  "status": "passed"
});
formatter.after({
  "duration": 31000,
  "status": "passed"
});
});