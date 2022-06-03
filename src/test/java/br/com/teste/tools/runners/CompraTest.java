package br.com.teste.tools.runners;

import org.junit.runner.RunWith;

import br.com.bradesco.automacaocartoes.core.ExtendedCucumberRunner;
import br.com.teste.practice.utilitarios.SetUpTearDown;
import io.cucumber.junit.CucumberOptions;

@RunWith(ExtendedCucumberRunner.class)
@CucumberOptions(

		plugin = { "pretty", 
				"html:target/cucumber-report", 
				"junit:target/cucumber-report/junitResult.xml",
				"json:target/cucumber-report/jsonResult.json" },
				stepNotifications = true, 
				
				useFileNameCompatibleName = true, 
				
				strict = true, 
				
		features = {"src/test/resources/features/LoginCompra.feature"},
		
		glue = {"br.com.teste.tools.steps", "br.com.teste.practice.utilitarios" }, 
		
		//tags = {"@Login_ComprarTresProdutosNovoUsuario"}
		tags = {"@Login_ComprarTresProdutosClienteNovo"}
		
)

public class CompraTest extends SetUpTearDown {

}