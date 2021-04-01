import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UsersTest {

    public static WebDriver driver;
    @Test
    public void login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("http://users.bugred.ru/user/login/index.html");
        driver.findElement(By.name("login")).sendKeys("lr2021@gmail.com");
        driver.findElement(By.name("password")).sendKeys("lr2021");

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();
        WebElement Anna =driver.findElement(By.xpath("//a[contains(text(),'Добавить пользователя')]"));
        Assert.assertEquals(true, Anna.isDisplayed());

        // Найти пользователя

        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td/input")).sendKeys("Svyat");
        driver.findElement(By.xpath("//button[contains(text(),'Найти')]")).click();

        // Добавить пользователя

        driver.findElement(By.xpath("//a[contains(text(),'Добавить пользователя')]")).click();

        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("vesna");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("vesna@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("vesna");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("30.03.2021");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td[2]/select")).sendKeys("Женский");
        driver.findElement(By.name("noibiz_hobby")).sendKeys("Рисование");
        driver.findElement(By.name("noibiz_name1")).sendKeys("Мария");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[10]/td[2]/input")).sendKeys("Иванова");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[11]/td[2]/input[1]")).sendKeys("Александровна");
        driver.findElement(By.name("noibiz_cat")).sendKeys("Барс");
        driver.findElement(By.name("noibiz_dog")).sendKeys("Тузик");
        driver.findElement(By.name("noibiz_parrot")).sendKeys("Чирик");
        driver.findElement(By.name("noibiz_cavy")).sendKeys("кави");
        driver.findElement(By.name("noibiz_hamster")).sendKeys("хамстер");
        driver.findElement(By.name("noibiz_squirrel")).sendKeys("белочка");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[18]/td[2]/input")).sendKeys("0568427896");
        driver.findElement(By.name("noibiz_adres")).sendKeys("Odessa");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[20]/td[2]/input")).sendKeys("15151383");
        driver.findElement(By.name("noibiz_date_start")).sendKeys("15.01.2021");

        driver.findElement(By.name("act_create")).click();

        //Переход в личный кабинет

        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();

        // Редактирование личного кабинета
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys(" rl");
        driver.findElement(By.name("gender")).sendKeys("Мужской");
        driver.findElement(By.name("birthday")).clear();
        driver.findElement(By.name("birthday")).sendKeys("12.12.2012");
        driver.findElement(By.name("date_start")).clear();
        driver.findElement(By.name("date_start")).sendKeys("15.01.2021");
        driver.findElement(By.name("hobby")).clear();
        driver.findElement(By.name("hobby")).sendKeys("Рисование");
        driver.findElement(By.name("inn")).clear();
        driver.findElement(By.name("inn")).sendKeys("565578933258");

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();









    }

}
