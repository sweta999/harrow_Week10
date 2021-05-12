package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class IEBrowserTest {

    public static void main(String[] args){

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.harrow.gov.uk/");

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());

        boolean VerifyTitle = title.equals("Home – Harrow Council");
        System.out.println(VerifyTitle);
        boolean VerifyTitleContains = title.contains("Home");
        System.out.println(VerifyTitleContains);

        driver.close();

    }
}
