package com.co.rappi.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/resgister.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.rappi.stepdefinitions"
)
public class Register {
}
