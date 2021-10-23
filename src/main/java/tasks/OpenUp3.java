package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.Step2InformationPerson;
import userinterface.Step3InformationPerson;

public class OpenUp3 implements Task {
    private Step3InformationPerson step3InformationPerson;
    public static OpenUp3 thePage(){
        return Tasks.instrumented(OpenUp3.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(step3InformationPerson));
    }
}
