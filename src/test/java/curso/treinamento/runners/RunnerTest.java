
package curso.treinamento.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features"},
		glue = {"curso.treinamento.steps"},
		snippets = Sni SnippetType.CAMELCASE,
		tags = {})

public class RunnerTest {}



