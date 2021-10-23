package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.Step4InformationPerson;

public class OpenUp4 implements Task {
    private Step4InformationPerson step4InformationPerson;
    public static OpenUp4 thePage(){
        return Tasks.instrumented(OpenUp4.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(step4InformationPerson));
    }
}
