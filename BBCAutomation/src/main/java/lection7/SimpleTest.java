package lection7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Carlito on 14.12.2015.
 */
public class SimpleTest {

    public static void main(String[] args) {

        //Запускаем браузер фаерфокс
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://www.bbc.com/"); //переход по УРЛУ

        WebElement sportLink = driver.findElement(By.xpath(".//*[@id='orb-nav-links']//a[text()='Sport']")); //

        //спользуем элемент
        sportLink.click();

        //Пишем ожидаемый и фактический результат
        String expectedURL = "http://www.bbc.com/sport/0/";
        String actualURL = driver.getCurrentUrl();


        //Условие проверки
        if (expectedURL.equals(actualURL)) {
            System.out.println("Pass");
        }else
        {
            System.out.println("Fail");
        }

        driver.quit(); // закрыть браузер


        }


    }


