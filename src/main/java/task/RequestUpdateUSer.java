package task;

import models.UpdateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;
import utils.GenerateBodyUpdate;

public class RequestUpdateUSer implements Task {

    private UpdateUser info;
    private  String id;

    public RequestUpdateUSer(String id ,UpdateUser info ) {
        this.info = info;
        this.id=id;
    }

    public static RequestUpdateUSer whit(String id ,UpdateUser info) {
        return new RequestUpdateUSer(id, info);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String body;
        body = GenerateBodyUpdate.bodyRequest(info);
        actor.attemptsTo(
                Put.to("users/" + info).with(requestSpecification -> requestSpecification.
                        header("Content-Type", "application/json").
                        body(body))
        );
    }
}
