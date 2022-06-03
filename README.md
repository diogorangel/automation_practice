# Portal_PJ_Automacao
Projeto de Automação Portal_PJ_Automacao.

Objetivo:
	
	Automatizar testes UI (User Interface) utilizando ferramentas como: Cucumber, jUnit, Appium, Selenium Webdriver, Java, Mobile Center, 
	Maven, Redis, Mainframe e ALM, afim de verificar, validar e documentar a execução dos cenários de testes das funcionalidades da aplicação.

Pré-requisitos de instalação:

	1. Java JDK 11 LTS - esta é a versão que utilizamos atualmente, mas creio que qualquer sub-versão da 11 não teremos problemas.
	Instalar, preferencialmente, na pasta do usuário local para ter acesso a edição da mesma, caso precise instalar certificados.
	
	2. Eclipse Java EE - qualquer versão, fica a critério do analista de automação de testes.
	
	3. Maven - baixar e descompactar no C raiz.
	
	4. Plug-in do Maven no Eclipse - baixar e instalar pelo Eclipse Marketplace (sair da rede do banco).
	
	5. Plug-in do Cucumber no Eclipse - baixar e instalar pelo Eclipse Marketplace (sair da rede do banco).
	
	6. Appium - utilizamos para inspeção de elementos nativos. Verificar a versão de acordo com a versão do Appium do Mobile Center.
	
	7. Google Chrome - Principal plataforma de teste web e no mobile utilizamos para inspeção de elementos webviews de aplicativos híbridos.
	
	8. Mozilla Firefox - Utilizados para testes MultiBrowser.
	
	9. Edge - Utilizados para testes MultiBrowser.

	10. Internet Explore - Utilizados para testes MultiBrowser e rodar os testes no ALM.

	Opcionais:
		
		1. UFT com plug-in do LeanFT 15.02 - uma boa opção para inspeção de elementos.
		
		2. Node.js - caso for baixar o código da aplicação na máquina, necessário para configurar o Ripple ou utilizar o LeanFT.
				
		3. PW3270 - Utilizamos o terminal mainframe e para rodar scripts de captura sms token.
		
		4. IBM PCOMM - Utilizamos o terminal mainframe e para rodar scripts de captura sms token.

Pré-requisitos de configuração:

	1. Criar variável de ambiente JAVA_HOME.

	2. Criar variável de ambiente MAVEN_HOME.

	3. Adicionar %JAVA_HOME%\bin na variável de ambiente PATH.

	4. Adicionar %MAVEN_HOME%\bin na variável de ambiente PATH.

	Nexus:
	- Repositório Maven do banco.
	
		1. Ter acesso ao Nexus > Repositório: devsecops-maven-central.

		2. Ter o arquivo de settings.xml para conexão com o Nexus.

		3. Ter o projeto baixado (.git).
		
	Alternativa Nexus:
	- Utilizar o próprio Maven para controle das dependências.
		
		1. Desconectar da rede do banco e no Eclipse, ALT + F5 na raiz do projeto para baixar e configurar as dependências do projeto.


Configurar o projeto seguindo o passo-a-passo abaixo:

	1. Criar o caminho de pastas: C:\Projetos\Bradesco\Portal_PJ_Automacao.
	
	2. Clonar o projeto do GitLab.
	
	3. Criar uma workspace vazia no Eclipse Java EE.
	
	4. Eclipse > Window > Preferences > Java > Installed JREs > Manter apenas o JDK 11 LTS.
	
	5. Se for utilizar o Nexus, Eclipse > Window > Preferences > Maven > User Settings > User Settings > Apontar para o settings.xml
	para conexão com o Maven.
	
	6. Eclipse > File > Import > Maven > Existing Maven Project > Apontar para o projeto e finalizar.	
		
	7. Alt + F5 no projeto.
	
	PRONTO! Projeto configurado!
	
	
Estrutura do projeto:

	1. src/main/java > package utilitarios
		Onde ficam as classes do core do framework, qualquer alteração aqui pode quebrar a estrutura. Porém, aqui é onde ficam os métodos
		comuns para o desenvolvimento do cenário de teste, por exemplo, uma chamada de um script mainframe é feita no MainframeCore e a leitura do
		properties gerado utilizamos a UtilsGeral. E assim por diante, ApiCore chamar métodos comuns de API, UtilsMobile chamar métodos comuns
		mobile, UtilsWeb chamar métodos comuns web.
		Importante: nosso core já tem a implementação de grande parte dos métodos comuns para automação UI, eles já estão sido estendidos pelos 
		UtilsMobile, UtilsGeral e UtilsWeb. Verificar a documentação dos métodos do core antes de qualquer implementação nessas classes. 
		
	2. src/main/resources
		Onde ficam todos os recursos necessários para darem suporte ao core do framework, qualquer alteração aqui pode quebrar a estrutura.
		Importante: o config.properties que configura toda a execução, define: qual aparelho, qual usuário do Mobile Center, qual navegador,
		etc. Para testes mobile gerar o token de acesso no Mobile Center e alterar nos respectivos campos do config.properties.
		
	3. src/test/java e src/test/resources
		Nestas pastas o analista de automação irá atuar.
		
	4. src/test/java > package pagesmobile
		Aqui onde se cria todas as pages mobile do projeto, cada tela da aplicação corresponde a uma classe page.
		
	5. src/test/java > package pagesweb
		Aqui onde se cria todas as pages web do projeto, cada tela da aplicação corresponde a uma classe page.
		
	6. src/test/java > package runners
		Onde ficam as classes para execuções dos testes locais em Cucumber, cada funcionalidade da aplicação terá uma classe runner.
		
	7. src/test/java > package steps
		Onde ficam os passos dos cenários, aqui é onde se implementa a lógica do passo. Cada funcionalidade da aplicação terá uma classe step,
		respeitando sempre a plataforma.
		
	8. src/test/resources > pasta features
		Onde ficam os cenários escritos em Gherkin. 



Configurando o ALM para documentação da execução dos cenários:

	Pré-condições:
	
		1. Ter acesso ao ALM e a um projeto.
		
		2. Ter o projeto de automação baixado e configurado na máquina, conforme instruções acima.
		
	Passo-a-passo:
	
		1. Alterar no arquivo src/main/resources/conexaoALM/Portal_PJ_AutomacaoExecution.vbs onde tiver a referência Portal_PJ_Automacao para a pasta do
		projeto criado.
		
		2. Estar logado no projeto no ALM e adicionar em Testes > Recursos de testes um novo item Function Library. Após isso, fazer o upload do
		arquivo do projeto src/main/resources/conexaoALM/Portal_PJ_AutomacaoExecution.vbs através da aba Visualizador de Recursos no ALM.
		
		3. Em Testes > Plano de Testes, o item de execução do script é o VAPI-XP-TEST. Crie os testes com este tipo. Neste item, adicione o 
		código do arquivo src/main/resources/conexaoALM/VAPI-XP-TEST - Script de Teste.txt. Ainda neste item, na aba Parâmetros, crie um novo
		parâmetro chamado TAG_NAME e com o valor da tag do Cucumber relacionado a este cenário. Em Dados, realizar a cópia do valor padrão para
		valor real. Observação: deve ser 1 para 1, ou seja, a tag informada no ALM deve ser única no projeto..
		
		4. Em Testes > Laboratório de Testes > Adicionar o cenário em uma suíte de testes.
		
		5. Para execução, utilize o botão Executar Conjunto de Testes, a partir dai selecionando um ou mais testes para serem executados.
