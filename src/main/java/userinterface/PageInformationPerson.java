package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageInformationPerson  extends PageObject {

        public static final Target STEP1_BUTTON = Target.the("button that shows us the form to step1")
                .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']//href='[/signup/personal/]','Join Today')]"));
        public static final Target INPUT_FIRSNAME = Target.the(  "where do we white the firsname")
                .located(By.id("firsname"));
        public static final Target INPUT_LASTNAME = Target.the("where do we white the lastname")
                .located(By.id("lastname"));
        public static final Target INPUT_EMAIL = Target.the("where do we white the email")
            .located(By.id("email"));
        public static final Target SELECT_MONTH = Target.the("select month")
            .located(By.xpath("div['birthDate']//select[id='birthMonth', 'Month')]"));
        public static final Target SELECT_DAY = Target.the("select day")
            .located(By.id("//div['birthDate']//select[id='birthDay', 'Day')]"));
        public static final Target SELECT_YEAR = Target.the("select year")
            .located(By.id("//div['birthDate']//select[id='birthYear', 'Year')]"));
         public static final Target INPUT_LEANGUES = Target.the("where do we white the user")
            .located(By.id("//div[@class='ui-select-match']//input[@class='ui-select-search']"));
        public static final Target ENTER_BUTTON = Target.the("direct to the following form")
                .located(By.xpath("//button[contains(@class, 'btn btn-blue')]"));

}
