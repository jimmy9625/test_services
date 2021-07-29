package questions;

import models.SingleUser;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.GenerateDataResponse;

public class UserInfo implements Question<String> {
    public static UserInfo obtains() {


        return new UserInfo();
    }

    @Override
    public String answeredBy(Actor actor) {
        SingleUser user = SerenityRest.lastResponse().jsonPath().getObject("data", SingleUser.class);
        String response = GenerateDataResponse.body(user);

        return response;
    }
}
