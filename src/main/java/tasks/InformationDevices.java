package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PageInformationDevices;


public class InformationDevices implements Task{

    private String strSelect1;
    private String strSelect2;
    private String strSelect3;
    private String strSelect4;
    private String strSelect5;
    private String strSelect6;

    public InformationDevices(String strSelect1,
                              String strSelect2,
                              String strSelect3,
                              String strSelect4,
                              String strSelect5,
                              String strSelect6) {
        this.strSelect1 = strSelect1;
        this.strSelect2 = strSelect2;
        this.strSelect3 = strSelect3;
        this.strSelect4 = strSelect4;
        this.strSelect5 = strSelect5;
        this.strSelect6 = strSelect6;
    }
    public static InformationDevices OnThePage(String strSelect1,
                                               String strSelect2,
                                               String strSelect3,
                                               String strSelect4,
                                               String strSelect5,
                                               String strSelect6)
    {
        return Tasks.instrumented(InformationDevices.class,
                strSelect1,
                strSelect2,
                strSelect3,
                strSelect4,
                strSelect5,
                strSelect6);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageInformationDevices.STEP3_BUTTON),
                Enter.theValue(strSelect1).into(PageInformationDevices.SELECT_SELECT1),
                Enter.theValue(strSelect2).into(PageInformationDevices.SELECT_SELECT2),
                Enter.theValue(strSelect3).into(PageInformationDevices.SELECT_SELECT3),
                Enter.theValue(strSelect4).into(PageInformationDevices.SELECT_SELECT4),
                Enter.theValue(strSelect5).into(PageInformationDevices.SELECT_SELECT5),
                Enter.theValue(strSelect6).into(PageInformationDevices.SELECT_SELECT6),
                Click.on(PageInformationDevices.ENTER_BUTTON)
        );
    }
}
