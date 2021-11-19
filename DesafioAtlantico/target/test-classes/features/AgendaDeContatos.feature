#language: pt
Funcionalidade: Fazer altera��es em agenda de contatos

	Contexto: Acessar o servi�o de agenda
		Dado que o usuario acesse o servico de agenda
		
	@AdicionarContato @smoke
	Cenario: Adicionar novo contato
		Dado que o usuario clique no botao adicionar
		Quando adicionar novo contato
		Entao deve verificar que um novo contato foi adicionado na agenda
		
	@TentarAdicionarContatoJaExistente	@smoke
	Cenario: Adicionar contato existente
		Dado que o usuario clique no botao adicionar
		Quando tentar inserir um contato ja existente
		Entao o sistema retorna a mensagem "Pessoa j� existe."
		
	@ExcluirContato	 @smoke
	Cenario: Excluir contato
		Dado que o usuario verifique que existe um contato da pagina inicial
		Quando clicar no icone de excluir contato
		Entao deve verificar que o contato foi excluido
		
	@TentarAdicionarContatoSemQuantidadeMinimaDeCaracteresNoNome	@smoke
	Cenario: Tentar adicionar novo contato sem a quantidade minima de caracteres no nome
		Dado que o usuario clique no botao adicionar
		Quando eu adicionar um nome menor que a quantindade minima permitida
		Entao o sistema retorna a mensagem "Insira um nome (min. length: 3)"
		
	@TentarAdicionarContatoSemQuantidadeMinimaDeCaracteresNoTelefone	@smoke
	Cenario: Tentar adicionar novo contato sem a quantidade minima de caracteres no telefone
		Dado que o usuario clique no botao adicionar
		Quando eu adicionar um telefone menor que a quantindade minima permitida
		Entao o sistema retorna a mensagem "Insira o telefone (min. length: 8)"
	
		