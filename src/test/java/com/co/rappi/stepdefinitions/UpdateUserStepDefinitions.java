package com.co.rappi.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.UpdateUser;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.Update;
import task.RequestUpdateUSer;
import utils.GenerateBodyUpdate;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UpdateUserStepDefinitions {
    @When("^User send Request  for update info user (.*)$")
    public void userSendRequestForUpdateInfoUser(String id, List<UpdateUser> user) {
        theActorInTheSpotlight().attemptsTo(RequestUpdateUSer.whit(id, user.get(0)));

    }

    @Then("^verify response body$")
    public void verifyResponseBody(List<UpdateUser> user) {
        String resposeExpect = GenerateBodyUpdate.bodyResponse(user.get(0));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Update.response(),
                Matchers.equalTo(resposeExpect)));

    }


}
