package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.ModelUtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import  net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;

import java.util.List;


public class UtestStepRegister {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Harold automation for personal user information$")
    public void haroldAutomationForPersonalUserInformation(List<ModelUtestData> modelUtestData) throws Exception {
        OnStage.theActorCalled("Harold").wasAbleTo(OpenUp.thePage(), (InformationPerson.
            onThePage(modelUtestData.get(0).getStrFirsName(),
                    modelUtestData.get(0).getStrLastName(),
                    modelUtestData.get(0).getStrEmail(),
                    modelUtestData.get(0).getStrBirthMonth(),
                    modelUtestData.get(0).getStrBirthYear(),
                    modelUtestData.get(0).getStrBirthday(),
                    modelUtestData.get(0).getStrLengues())));

    }

    @When("^when the user completes all the fields$")
    public void whenTheUserCompletesAllTheFields(List<ModelUtestData> modelUtestData) throws Exception {
        OnStage.theActorCalled("Harold").wasAbleTo(OpenUp2.thePage(), (InformationAnddress.
                OnThePage(modelUtestData.get(0).getStrCity(),
                modelUtestData.get(0).getStrZip(),
                modelUtestData.get(0).getStrCountry())));
    }

    @Then("^proceed to the next step to continue$")
    public void proceedToTheNextStepToContinue(List<ModelUtestData> modelUtestData) {
        OnStage.theActorCalled("Harold").wasAbleTo(OpenUp3.thePage(), (InformationDevices.
                OnThePage(modelUtestData.get(0).getStrSelect1(),
                          modelUtestData.get(0).getStrSelect2(),
                          modelUtestData.get(0).getStrSelect3(),
                          modelUtestData.get(0).getStrSelect4(),
                          modelUtestData.get(0).getStrSelect5(),
                          modelUtestData.get(0).getStrSelect6())));

        OnStage.theActorCalled("Harold").wasAbleTo(OpenUp4.thePage(), (InformationStep.
                OnThePage(modelUtestData.get(0).getStrPassword(),
                        modelUtestData.get(0).getStrConfirmPassword(),
                        modelUtestData.get(0).getStrCheck1(),
                        modelUtestData.get(0).getStrCheck2(),
                        modelUtestData.get(0).getStrCheck3())));
    }


    @Given("^automation user location$")
    public void automationUserLocation() {
    }

    @Given("^operating systems validation$")
    public void operatingSystemsValidation() {
    }

    @When("^autocomplete information$")
    public void autocompleteInformation() {
    }
}
