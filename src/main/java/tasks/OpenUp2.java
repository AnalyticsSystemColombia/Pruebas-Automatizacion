package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.Step2InformationPerson;

public class OpenUp2 implements Task {
    private Step2InformationPerson step2InformationPerson;
    public static OpenUp2 thePage(){
        return Tasks.instrumented(OpenUp2.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(step2InformationPerson));
    }
}
