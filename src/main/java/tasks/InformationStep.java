package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PageInformationStep;


public class InformationStep implements Task{

    private String strPassword;
    private String strConfirmPassword;
    private String strCheck1;
    private String strCheck2;
    private String strCheck3;

    public InformationStep(String strPassword,
                           String strConfirmPassword,
                           String strCheck1,
                           String strCheck2,
                           String strCheck3) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
        this.strCheck1 = strCheck1;
        this.strCheck2 = strCheck2;
        this.strCheck3 = strCheck3;
    }
    public static InformationStep OnThePage(String strPassword,
                                            String strConfirmPassword,
                                            String strCheck1,
                                            String strCheck2,
                                            String strCheck3)
    {
        return Tasks.instrumented(InformationStep.class,
                strPassword,
                strConfirmPassword,
                strCheck1,
                strCheck2,
                strCheck3);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageInformationStep.STEP4_BUTTON),
                Enter.theValue(strPassword).into(PageInformationStep.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(PageInformationStep.INPUT_CONFIRMAR),
                Enter.theValue(strCheck1).into(PageInformationStep.CHECK1_INPUT),
                Enter.theValue(strCheck2).into(PageInformationStep.CHECK2_INPUT),
                Enter.theValue(strCheck3).into(PageInformationStep.CHECK3_INPUT),
                Click.on(PageInformationStep.ENTER_BUTTON)
        );
    }
}
