package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PageInformationPerson;


public class InformationPerson implements Task {
    private String strFirsName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthday;
    private String strBirthYear;
    private String strLengues;
    public InformationPerson(String strFirsName,
                             String strLastName,
                             String strEmail,
                             String strBirthMonth,
                             String strBirthday,
                             String strBirthYear,
                             String strLengues){
        this.strFirsName = strFirsName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthday = strBirthday;
        this.strBirthYear = strBirthYear;
        this.strLengues = strLengues;
    }
    public static InformationPerson onThePage(String strFirsName,
                                              String strLastName,
                                              String strEmail,
                                              String strBirthMonth,
                                              String strBirthday,
                                              String strBirthYear,
                                              String strLengues) {
        return Tasks.instrumented(InformationPerson.class,
                     strFirsName,
                     strLastName,
                     strEmail,
                     strBirthMonth,
                     strBirthday,
                     strBirthYear,
                     strLengues);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageInformationPerson.STEP1_BUTTON),
                Enter.theValue(strFirsName).into(PageInformationPerson.INPUT_FIRSNAME),
                Enter.theValue(strLastName).into(PageInformationPerson.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(PageInformationPerson.INPUT_EMAIL),
                Enter.theValue(strBirthMonth).into(PageInformationPerson.SELECT_MONTH),
                Enter.theValue(strBirthday).into(PageInformationPerson.SELECT_DAY),
                Enter.theValue(strBirthYear).into(PageInformationPerson.SELECT_YEAR),
                Enter.theValue(strLengues).into(PageInformationPerson.INPUT_LEANGUES),
                Click.on(PageInformationPerson.ENTER_BUTTON)
        );
    }

}

