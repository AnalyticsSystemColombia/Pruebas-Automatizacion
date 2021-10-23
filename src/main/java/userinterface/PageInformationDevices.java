package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageInformationDevices extends PageObject {

        public static final Target STEP3_BUTTON = Target.the("button that shows us the form to step3")
                .located(By.xpath("//button[contains(@class, 'btn btn-blue')]"));
        public static final Target SELECT_SELECT1 = Target.the(  "Autodetected")
                .located(By.id("//span[@class='btn btn-default']//name='osId','Your Computer:'"));
        public static final Target SELECT_SELECT2 = Target.the("Autodetected")
                .located(By.id("//span[@class='btn btn-default']//name='osVersionId','Version:'"));
        public static final Target SELECT_SELECT3 = Target.the("Autodetected")
            .located(By.id("//span[@class='btn btn-default']//name='osLanguageId','Language::'"));
        public static final Target SELECT_SELECT4 = Target.the("Autodetected")
            .located(By.xpath("//span[@class='btn btn-default']//name='handsetMakerId','Your Mobile Device:'"));
        public static final Target SELECT_SELECT5 = Target.the("Autodetected")
            .located(By.id("//span[@class='btn btn-default']//name='handsetModelId','Model:'"));
        public static final Target SELECT_SELECT6 = Target.the("Autodetected")
            .located(By.id("//span[@class='btn btn-default']//name='handsetOSId','Operating System:'"));
        public static final Target ENTER_BUTTON = Target.the("direct to the following form")
                .located(By.xpath("//button[contains(@class, 'btn btn-blue')]"));

}
