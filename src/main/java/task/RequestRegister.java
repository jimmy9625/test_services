package task;

import models.responses.RegisterInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import utils.GenerateBodyRegister;

public class RequestRegister implements Task {

    private String password;
    private String email;

    public RequestRegister(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public static RequestRegister whit(RegisterInfo info) {
        return new RequestRegister(info.getPaswword(), info.getEmail());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String body;
        body = GenerateBodyRegister.whitData(password, email);
        actor.attemptsTo(
                Post.to("register").with(requestSpecification -> requestSpecification.
                        header("Content-Type", "application/json").
                        body(body))
        );


    }
}
