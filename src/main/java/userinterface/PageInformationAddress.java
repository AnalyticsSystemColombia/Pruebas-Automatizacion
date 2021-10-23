package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageInformationAddress extends PageObject {

        public static final Target STEP2_BUTTON = Target.the("button that shows us the form to step1")
                .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']//href='[/signup/personal/]','Join Today')]"));
        public static final Target INPUT_City = Target.the(  "where do we white the City")
                .located(By.id("City"));
        public static final Target INPUT_Zip = Target.the("where do we white the Zip")
                .located(By.id("Zip"));
        public static final Target INPUT_Country = Target.the("where do we white the Country")
            .located(By.id("Country"));
        public static final Target ENTER_BUTTON = Target.the("direct to the following form")
                .located(By.xpath("//button[contains(@class, 'btn btn-blue')]"));

}
