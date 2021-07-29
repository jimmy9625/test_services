package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class RequestGetUser implements Task {


    private String user;

    public RequestGetUser(String user) {
        this.user = user;
    }

    public static RequestGetUser find(String user) {
        return Tasks.instrumented(RequestGetUser.class, user);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource("users/" + user));

    }
}
