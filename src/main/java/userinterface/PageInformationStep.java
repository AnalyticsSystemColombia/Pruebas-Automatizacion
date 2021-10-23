package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageInformationStep extends PageObject {

        public static final Target STEP4_BUTTON = Target.the("button that shows us the form to step3")
                .located(By.xpath("//button[contains(@class, 'btn btn-blue')]"));
        public static final Target INPUT_PASSWORD = Target.the(  "where do we white the password")
                .located(By.id("//span[@class='btn btn-default']//name='osId','Your Computer:'"));
        public static final Target INPUT_CONFIRMAR = Target.the("where do we white the confirm password")
                .located(By.id("//div[@id='confirmPassword']//name='confirmPassword','Confirm password:'"));
        public static final Target CHECK1_INPUT = Target.the("option one")
            .located(By.id("//div[input='']//name='newsletterOptIn'"));
        public static final Target CHECK2_INPUT  = Target.the("option two")
            .located(By.xpath("//div[input='']//name='termOfUse'"));
        public static final Target CHECK3_INPUT  = Target.the("option three")
            .located(By.id("//div[input='']//name='privacySetting'"));
        public static final Target ENTER_BUTTON = Target.the("registration process completion")
                .located(By.xpath("//id='laddaBtn(@class,'//button[contains(@class,'Operating System:'' 'btn btn-blue')]"));

}
