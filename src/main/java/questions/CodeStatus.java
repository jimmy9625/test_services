package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CodeStatus implements Question<Integer> {


    @Override
    public Integer answeredBy(Actor actor) {

        return SerenityRest.lastResponse().getStatusCode();
    }

    public static  CodeStatus request()
    {
        return new CodeStatus();
    }

}
