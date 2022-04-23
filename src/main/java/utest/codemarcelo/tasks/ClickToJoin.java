package utest.codemarcelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utest.codemarcelo.userinterface.UtestPage;

public class ClickToJoin implements Task {

    public static ClickToJoin joinToday(){
        return Tasks.instrumented(ClickToJoin.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPage.JOIN_TODAY_BUTTON));
    }
}