package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RegistryResponse implements Question<String> {

    public static RegistryResponse response() {
        return new RegistryResponse();
    }

    @Override
    public String answeredBy(Actor actor) {
        String responseBody = SerenityRest.lastResponse().getBody().asString();
        return responseBody;
    }
}
