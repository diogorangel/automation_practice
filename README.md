# Portal_PJ_Automacao
Projeto de Automa��o Portal_PJ_Automacao.

Objetivo:
	
	Automatizar testes UI (User Interface) utilizando ferramentas como: Cucumber, jUnit, Appium, Selenium Webdriver, Java, Mobile Center, 
	Maven, Redis, Mainframe e ALM, afim de verificar, validar e documentar a execu��o dos cen�rios de testes das funcionalidades da aplica��o.

Pr�-requisitos de instala��o:

	1. Java JDK 11 LTS - esta � a vers�o que utilizamos atualmente, mas creio que qualquer sub-vers�o da 11 n�o teremos problemas.
	Instalar, preferencialmente, na pasta do usu�rio local para ter acesso a edi��o da mesma, caso precise instalar certificados.
	
	2. Eclipse Java EE - qualquer vers�o, fica a crit�rio do analista de automa��o de testes.
	
	3. Maven - baixar e descompactar no C raiz.
	
	4. Plug-in do Maven no Eclipse - baixar e instalar pelo Eclipse Marketplace (sair da rede do banco).
	
	5. Plug-in do Cucumber no Eclipse - baixar e instalar pelo Eclipse Marketplace (sair da rede do banco).
	
	6. Appium - utilizamos para inspe��o de elementos nativos. Verificar a vers�o de acordo com a vers�o do Appium do Mobile Center.
	
	7. Google Chrome - Principal plataforma de teste web e no mobile utilizamos para inspe��o de elementos webviews de aplicativos h�bridos.
	
	8. Mozilla Firefox - Utilizados para testes MultiBrowser.
	
	9. Edge - Utilizados para testes MultiBrowser.

	10. Internet Explore - Utilizados para testes MultiBrowser e rodar os testes no ALM.

	Opcionais:
		
		1. UFT com plug-in do LeanFT 15.02 - uma boa op��o para inspe��o de elementos.
		
		2. Node.js - caso for baixar o c�digo da aplica��o na m�quina, necess�rio para configurar o Ripple ou utilizar o LeanFT.
				
		3. PW3270 - Utilizamos o terminal mainframe e para rodar scripts de captura sms token.
		
		4. IBM PCOMM - Utilizamos o terminal mainframe e para rodar scripts de captura sms token.

Pr�-requisitos de configura��o:

	1. Criar vari�vel de ambiente JAVA_HOME.

	2. Criar vari�vel de ambiente MAVEN_HOME.

	3. Adicionar %JAVA_HOME%\bin na vari�vel de ambiente PATH.

	4. Adicionar %MAVEN_HOME%\bin na vari�vel de ambiente PATH.

	Nexus:
	- Reposit�rio Maven do banco.
	
		1. Ter acesso ao Nexus > Reposit�rio: devsecops-maven-central.

		2. Ter o arquivo de settings.xml para conex�o com o Nexus.

		3. Ter o projeto baixado (.git).
		
	Alternativa Nexus:
	- Utilizar o pr�prio Maven para controle das depend�ncias.
		
		1. Desconectar da rede do banco e no Eclipse, ALT + F5 na raiz do projeto para baixar e configurar as depend�ncias do projeto.


Configurar o projeto seguindo o passo-a-passo abaixo:

	1. Criar o caminho de pastas: C:\Projetos\Bradesco\Portal_PJ_Automacao.
	
	2. Clonar o projeto do GitLab.
	
	3. Criar uma workspace vazia no Eclipse Java EE.
	
	4. Eclipse > Window > Preferences > Java > Installed JREs > Manter apenas o JDK 11 LTS.
	
	5. Se for utilizar o Nexus, Eclipse > Window > Preferences > Maven > User Settings > User Settings > Apontar para o settings.xml
	para conex�o com o Maven.
	
	6. Eclipse > File > Import > Maven > Existing Maven Project > Apontar para o projeto e finalizar.	
		
	7. Alt + F5 no projeto.
	
	PRONTO! Projeto configurado!
	
	
Estrutura do projeto:

	1. src/main/java > package utilitarios
		Onde ficam as classes do core do framework, qualquer altera��o aqui pode quebrar a estrutura. Por�m, aqui � onde ficam os m�todos
		comuns para o desenvolvimento do cen�rio de teste, por exemplo, uma chamada de um script mainframe � feita no MainframeCore e a leitura do
		properties gerado utilizamos a UtilsGeral. E assim por diante, ApiCore chamar m�todos comuns de API, UtilsMobile chamar m�todos comuns
		mobile, UtilsWeb chamar m�todos comuns web.
		Importante: nosso core j� tem a implementa��o de grande parte dos m�todos comuns para automa��o UI, eles j� est�o sido estendidos pelos 
		UtilsMobile, UtilsGeral e UtilsWeb. Verificar a documenta��o dos m�todos do core antes de qualquer implementa��o nessas classes. 
		
	2. src/main/resources
		Onde ficam todos os recursos necess�rios para darem suporte ao core do framework, qualquer altera��o aqui pode quebrar a estrutura.
		Importante: o config.properties que configura toda a execu��o, define: qual aparelho, qual usu�rio do Mobile Center, qual navegador,
		etc. Para testes mobile gerar o token de acesso no Mobile Center e alterar nos respectivos campos do config.properties.
		
	3. src/test/java e src/test/resources
		Nestas pastas o analista de automa��o ir� atuar.
		
	4. src/test/java > package pagesmobile
		Aqui onde se cria todas as pages mobile do projeto, cada tela da aplica��o corresponde a uma classe page.
		
	5. src/test/java > package pagesweb
		Aqui onde se cria todas as pages web do projeto, cada tela da aplica��o corresponde a uma classe page.
		
	6. src/test/java > package runners
		Onde ficam as classes para execu��es dos testes locais em Cucumber, cada funcionalidade da aplica��o ter� uma classe runner.
		
	7. src/test/java > package steps
		Onde ficam os passos dos cen�rios, aqui � onde se implementa a l�gica do passo. Cada funcionalidade da aplica��o ter� uma classe step,
		respeitando sempre a plataforma.
		
	8. src/test/resources > pasta features
		Onde ficam os cen�rios escritos em Gherkin. 



Configurando o ALM para documenta��o da execu��o dos cen�rios:

	Pr�-condi��es:
	
		1. Ter acesso ao ALM e a um projeto.
		
		2. Ter o projeto de automa��o baixado e configurado na m�quina, conforme instru��es acima.
		
	Passo-a-passo:
	
		1. Alterar no arquivo src/main/resources/conexaoALM/Portal_PJ_AutomacaoExecution.vbs onde tiver a refer�ncia Portal_PJ_Automacao para a pasta do
		projeto criado.
		
		2. Estar logado no projeto no ALM e adicionar em Testes > Recursos de testes um novo item Function Library. Ap�s isso, fazer o upload do
		arquivo do projeto src/main/resources/conexaoALM/Portal_PJ_AutomacaoExecution.vbs atrav�s da aba Visualizador de Recursos no ALM.
		
		3. Em Testes > Plano de Testes, o item de execu��o do script � o VAPI-XP-TEST. Crie os testes com este tipo. Neste item, adicione o 
		c�digo do arquivo src/main/resources/conexaoALM/VAPI-XP-TEST - Script de Teste.txt. Ainda neste item, na aba Par�metros, crie um novo
		par�metro chamado TAG_NAME e com o valor da tag do Cucumber relacionado a este cen�rio. Em Dados, realizar a c�pia do valor padr�o para
		valor real. Observa��o: deve ser 1 para 1, ou seja, a tag informada no ALM deve ser �nica no projeto..
		
		4. Em Testes > Laborat�rio de Testes > Adicionar o cen�rio em uma su�te de testes.
		
		5. Para execu��o, utilize o bot�o Executar Conjunto de Testes, a partir dai selecionando um ou mais testes para serem executados.
