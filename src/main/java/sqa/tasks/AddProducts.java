package sqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sqa.models.UserLoombokData;
import sqa.userinterfaces.FloristeriaMundoAmorPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static sqa.userinterfaces.FloristeriaMundoAmorPage.*;

public class AddProducts implements Task {

    UserLoombokData userLoombokData;

    public AddProducts(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_INICIO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CATEGORY),
                Click.on(LINK_PRODUCT1),
                Click.on(BTN_ADDCAR),
                Click.on(BTN_INICIO),
                Click.on(BTN_CATEGORY),
                Click.on(BTN_CATEGORY),
                Click.on(LINK_PRODUCT2),
                Click.on(BTN_ADDCAR2),
                WaitUntil.the(TXT_VALIDATION, isVisible()).forNoMoreThan(10).seconds()
        );
    }
    public static AddProducts onTheSite(UserLoombokData userLoombokData){
        return Instrumented.instanceOf(AddProducts.class).withProperties(userLoombokData);
}
}