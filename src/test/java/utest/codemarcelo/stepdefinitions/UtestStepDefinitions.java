package utest.codemarcelo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utest.codemarcelo.model.UtestInformation;
import utest.codemarcelo.questions.Answer;
import utest.codemarcelo.tasks.ClickToJoin;
import utest.codemarcelo.tasks.FillFormOfThePage;
import utest.codemarcelo.tasks.OpenUp;

import java.util.List;

public class UtestStepDefinitions    {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Marcelo Bolivar wants to register on the utest site$")
    public void marceloBolivarWantsToRegisterOnTheUtestSite() { OnStage.theActorCalled("Marcelo").wasAbleTo(OpenUp.thePage());
    }

    @When("^he clicks on the Join Today button$")
    public void heClicksOnTheJoinTodayButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickToJoin.joinToday());
    }

    @When("^he introduces his personal data$")
    public void heIntroducesHisPersonalData(List<UtestInformation> utestData)  throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(FillFormOfThePage.thePage(
                utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(),
                utestData.get(0).getStrEmailAddress(),
                utestData.get(0).getStrBirthMonth(),
                utestData.get(0).getStrBirthDay(),
                utestData.get(0).getStrBirthYear(),
                utestData.get(0).getStrUserLanguage(),
                utestData.get(0).getStrCity(),
                utestData.get(0).getStrZipPostalCode(),
                utestData.get(0).getStrCountry(),
                utestData.get(0).getStrComputerOs(),
                utestData.get(0).getStrOsVersion(),
                utestData.get(0).getStrComputerLanguage(),
                utestData.get(0).getStrMobileDevice(),
                utestData.get(0).getStrModel(),
                utestData.get(0).getStrMobileOs(),
                utestData.get(0).getStrPassword()));
    }

    @Then("^the register is complete$")
    public void theRegisterIsComplete(List<UtestInformation>uTestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrSuccessSignUpMessage())));
    }
}
