package SeleniumJunit.OrangeHRM;

import SeleniumJunit.Config.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseSeleniumPage {

    //1й спосіб -  записувати елементи а потім звертатись до них для пошуку
    // пошук елемента відбуватиметься кожен запуск теста, навіть якщо така перевірка не запланована

    private final By dashboardMenuItemm =By.xpath("//span[text()='Dashboard']");
    private final By justExample = By.linkText("Dashboard");

    private WebElement dashboardMenuItemElement = driver.findElement(dashboardMenuItemm);


    //2 спосіб - більш зручний. через анотацію файнд бай, пошук елемента відбувається тільки тоді коли йде звернення до елемента

    @FindBy(xpath = "//span[text()='Dashboard']")
    private WebElement dashboardMenuItem;



}
