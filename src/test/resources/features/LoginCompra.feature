#encoding: iso-8859-1
################################################
########## scenarios Teste renner ################
################################################
@Login_TodosCenários
Feature: automationpractice

  @Login_ComprarTresProdutosNovoUsuario
  Scenario Outline: Eu quero fazer a compra de ao menos três produtos
    Given Como um cliente novo no automation practice <site> <rede> <emailNovo>
    When Eu sou um novo usuario <emailNovo> <primeiroNome> <segundoNome> <emailcadastro> <senhaCadastro> <nomeEmpresa> <Endereco> <Cidade> <CEP> <Celular> <enderecoConfirma>
    Then Eu quero fazer a compra de ao menos três produtos <quantidade>
    And Para que eu possa estar bem vestida

    Examples: 
      |emailNovo|primeiroNome|segundoNome|emailcadastro|senhaCadastro|nomeEmpresa|Endereco|Cidade|CEP|Celular|enderecoConfirma|site |rede|quantidade|
    	|"demanaus@tempsky.com"|"QA Pleno"|"Zona Norte"|"jouchudo@tempsky.com"|"12345"|"A Maquina dos QAs"|"Street Journal"|"Sao Paulo"|"41343"|"+1201-857-7757"|"Street Journal"|"Site"|"redeautomation"|"2"|
    	
 @Login_ComprarTresProdutosClienteNovo
  Scenario Outline: Eu quero fazer a compra de ao menos três produtos
    Given Como um cliente novo no automationpractice <site> <rede> <emailLogin> <senhaLogin>
    Then Eu quero fazer a compra de ao menos três produtos <quantidade>
    And Para que eu possa estar bem vestida

    Examples: 
      |emailLogin|senhaLogin|site |rede|quantidade|
    	|"deboas@tempsky.com"|"12345"|"Site"|"redeautomation"|"2"|   	 
