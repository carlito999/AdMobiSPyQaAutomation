package AdMobiSpy;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by Carlito on 14.12.2015.
 */
public class AdMobiSpy {

    public static void main(String[] args) {
        //Создаем объект WebDriver FireFox
        WebDriver driver = new FirefoxDriver();

        //Раскрываем браузер на весь экрна
        driver.manage().window().maximize();

        //Задаем тайм-аут 15 секунд
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Переходим на URL
        driver.get("http://work.admobispy.com");

        WebElement enterLink = driver.findElement(By.xpath("//*[@class='nav-box']//a[text()='ВХОД']"));
        enterLink.click();

        //Пишем ожидаемый и фактический результат
        String expectedURL = "http://work.admobispy.com/site/loginlnd";
        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("Страница Авторизации открылась");
        }
        else {
            System.out.println("Ошибка при входе на страницу авторизации");
        }



        //Сценарий перехода на страницу Возможностей
        driver.get("http://work.admobispy.com");
        WebElement capability = driver.findElement(By.xpath(".//*[@id='yw0']//*[text()='ВОЗМОЖНОСТИ']"));
        capability.click();
        String expectedURL1 = "http://work.admobispy.com/capability";
        String actualURL1 = driver.getCurrentUrl();

        if (expectedURL1.equals(actualURL1)){
            System.out.println("Страница Возможностей открылась");
        }else
        {
            System.out.println("Ошибка при входе на страницу Возможности");
        }

        //Сценарий перехода на страницу Цены
        driver.get("http://work.admobispy.com");
        WebElement payment = driver.findElement(By.xpath(".//*[@id='yw0']//*[text()='ЦЕНЫ']"));
        payment.click();
        String expectedURL2 = "http://work.admobispy.com/payment";
        String actualURL2 = driver.getCurrentUrl();

        if (expectedURL2.equals(actualURL2)){
            System.out.println("Страница Цены открылась");
        }else
        {
            System.out.println("Ошибка при входе на страницу Цены");
        }

        //Сценарий перехода на страницу БЛОГ
        driver.get("http://work.admobispy.com");
        WebElement blog = driver.findElement(By.xpath(".//*[@id='yw0']//*[text()='БЛОГ']"));
        blog.click();
        String expectedURL3 = "http://work.admobispy.com/blog";
        String actualURL3 = driver.getCurrentUrl();

        if (expectedURL3.equals(actualURL3)){
            System.out.println("Страница Блог открылась");
        }else
        {
            System.out.println("Ошибка при входе на страницу Блог");
        }

        //Сценарий перехода на страницу Регистрация
        driver.get("http://work.admobispy.com");
        WebElement registration = driver.findElement(By.xpath("//*[@class='nav-box']//a[text()='РЕГИСТРАЦИЯ']"));
        registration.click();
        String expectedURL4 = "http://work.admobispy.com/site/registerlnd?type=free";
        String actualURL4 = driver.getCurrentUrl();

        if (expectedURL4.equals(actualURL4)){
            System.out.println("Страница Регистрации открылась");
        }else
        {
            System.out.println("Ошибка при входе на страницу Регистрации");
        }


        //Сценарий перехода на


        driver.quit();


        }




    }



