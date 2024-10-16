package sqa.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import sqa.models.UserLoombokData;
import sqa.questions.ValidateText;
import sqa.tasks.AddProducts;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static sqa.userinterfaces.FloristeriaMundoAmorPage.TXT_VALIDATION;
import static sqa.utils.GlobalData.ACTOR;
import static sqa.utils.GlobalData.URL;


public class FloristeriaMundoAmorStepDefinitions {


    @Given("Since the user enters the Mundo Flor flower shop page")
    public void sinceTheUserEntersTheMundoFlorFlowerShopPage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }


    @When("he selects category and product one and two")
    public void heSelectsCategoryAndProductOneAndTwo(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProducts.onTheSite(UserLoombokData.setData(dataTable).get(0))
        );
    }
    @Then("he adds the products to the cart Carrito (.*)$")
    public void heAddsTheProductsToTheCartCarrito(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateText.of(TXT_VALIDATION), containsString(text)));

    }



}






