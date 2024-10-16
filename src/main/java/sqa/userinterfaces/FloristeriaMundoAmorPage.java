package sqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FloristeriaMundoAmorPage {

    public static final Target BTN_INICIO = Target.the("link").located(By.xpath("//*[@id=\"primary-menu\"]/li[1]/a"));

    public static final Target BTN_CATEGORY = Target.the("txt")
            .located(By.xpath("//*[@id=\"primary-menu\"]/li[3]/a"));

    public static final Target LINK_PRODUCT1= Target.the("txt")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div/div[2]/div/div/h3/a"));

    public static final Target BTN_ADDCAR = Target.the("txt")
            .located(By.xpath("//*[@id=\"product-4100\"]/div/div[2]/div/form/button"));

    public static final Target BTN_ADDCAR2 = Target.the("txt")
            .located(By.xpath("//*[@id=\"product-4084\"]/div/div[2]/div/form/button"));


    public static final Target LINK_PRODUCT2= Target.the("txt")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div/h3/a"));


    public static final Target TXT_VALIDATION = Target.the("txt")
            .located(By.xpath("//*[@id=\"main\"]/header/h1"));

}
