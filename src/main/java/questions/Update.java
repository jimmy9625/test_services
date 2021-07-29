package questions;

import models.UpdateUser;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.GenerateBodyUpdate;

public class Update implements Question<String> {


    public static Update response() {
        return new Update();
    }

    @Override
    public String answeredBy(Actor actor) {
        String name = SerenityRest.lastResponse().jsonPath().getString("name");
        String job = SerenityRest.lastResponse().jsonPath().getString("job");
        UpdateUser user = new UpdateUser(name, job);
        String responseBody = GenerateBodyUpdate.bodyResponse(user);
        return responseBody;
    }
}
