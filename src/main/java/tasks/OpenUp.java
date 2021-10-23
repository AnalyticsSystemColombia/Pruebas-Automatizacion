package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.Step1InformationPerson;

public class OpenUp implements Task {
    private Step1InformationPerson step1InformationPerson;
    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(step1InformationPerson));
    }
}
