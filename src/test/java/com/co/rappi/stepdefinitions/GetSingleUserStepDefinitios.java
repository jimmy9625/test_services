package com.co.rappi.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.SingleUser;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import org.hamcrest.Matchers;
import questions.CodeStatus;
import questions.UserInfo;
import task.RequestGetUser;
import utils.GenerateDataResponse;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GetSingleUserStepDefinitios {

    @Before
    public void init() {
        setTheStage(new OnlineCast());
        theActorCalled("user").
                whoCan(CallAnApi.
                        at("https://reqres.in/api/"));

    }

    @When("^user search user (.*)$")
    public void userFindUser(String user) {
        theActorInTheSpotlight().attemptsTo(
                RequestGetUser.find(user)
        );


    }

    @Then("^check the response code (.*)$")
    public void responseMesaggeAndFirstnameJanet(int code) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CodeStatus.request(),
                Matchers.equalTo(code)));
    }

    @Then("^verify user information$")
    public void verifyInfoUser(List<SingleUser> user) {
         String responseExpect = GenerateDataResponse.body(user.get(0));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(UserInfo.obtains(),
                Matchers.equalTo(responseExpect)));
    }
}
