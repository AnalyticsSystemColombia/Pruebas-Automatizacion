package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PageInformationAddress;
import userinterface.PageInformationPerson;

public class InformationAnddress implements Task{

    private String strCity;
    private String strZip;
    private String strCountry;

    public InformationAnddress(String strCity,String strZip, String strCountry) {
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }
    public static InformationAnddress OnThePage(String strCity, String strZip, String strCountry) {
        return Tasks.instrumented(InformationAnddress.class, strCity, strZip, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageInformationAddress.STEP2_BUTTON),
                Enter.theValue(strCity).into(PageInformationAddress.INPUT_City),
                Enter.theValue(strZip).into(PageInformationAddress.INPUT_Zip),
                Enter.theValue(strCountry).into(PageInformationAddress.INPUT_Country),
                Click.on(PageInformationAddress.ENTER_BUTTON)
        );
    }
}
