package TestPckage;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.util.List;

public class SeleniumTest {

   public static  WebDriver driver;
    public static void main(String[] arg) throws IOException {
        System.setProperty("webdriver.chrome.driver", "D:/SeleniumProject/chromedriver.exe");
 driver = new ChromeDriver();
 driver.get("https://www.newbalance.com/");
 driver.manage().window().maximize();

        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");

 driver.findElement(By.xpath("//a[@role='button' and  contains(text(),'Shop women') ]")).click();
// List<WebElement> links = driver.findElements(By.xpath("//a"));
 /*for(WebElement ele : links){
     if(ele !=null){
         CloseableHttpClient client = HttpClientBuilder.create().build();
         HttpGet request = new HttpGet(ele.getAttribute("href"));
         HttpResponse response = client.execute(request);
         if(response.getStatusLine().getStatusCode() !=200){
             System.out.println(ele.getAttribute("href") +" is broken");
         }
         else { System.out.println(ele.getAttribute("href") );}
     }
 }*/

 driver.close();
    }

    public static void scrollWindow(WebDriver driver,WebElement element){
       // We have to use JavascriptExecutor

        //To scroll using coordinate

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        //To scroll till end of the page

                ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //To scroll till any element

                ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }
}
