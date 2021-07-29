package com.co.rappi.stepdefinitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.responses.RegisterInfo;
import models.responses.ResponseRegistry;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.RegistryResponse;
import task.RequestRegister;
import utils.GenerateResposeBodyRegister;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinitions {


    @When("^user registers a new user$")
    public void userRegistred(List<RegisterInfo> info) {
        theActorInTheSpotlight().attemptsTo(
                RequestRegister.whit(info.get(0))
        );


    }

    @Then("^verify response request register$")
    public void verifyResponseRequestRegister(List<ResponseRegistry> info) throws Exception {
        String resposeExpect = GenerateResposeBodyRegister.body(info.get(0));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegistryResponse.response(),
                Matchers.equalTo(resposeExpect)));

    }
}
