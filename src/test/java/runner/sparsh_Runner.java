package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Sparsh/contact.feature",glue="steps",tags="@tag2")//Name of my package and path of the feature file
public class sparsh_Runner {
}
