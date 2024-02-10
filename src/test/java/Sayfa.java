import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {
    WebDriver driver;

    public Sayfa(WebDriver driver) {
        this.driver = driver;
    }

    public void bekle(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    public void bekleXpath(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementId)));
    }

    public void tusaBas(String tusId){
        driver.findElement(By.xpath(tusId)).click();
    }

    public void yaziYaz(String elementId, String urun){
        driver.findElement(By.id(elementId)).sendKeys(urun);
    }

    public void klavyeTusunaBas(String elementId, Keys klavyeTusu){
        driver.findElement(By.id(elementId)).sendKeys(klavyeTusu);
    }

    public void elementiBul(String elementId){
        WebElement element = driver.findElement(By.xpath(elementId));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    public void scroll(String elementId){
        WebElement element = driver.findElement(By.xpath(elementId));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); element.click();
    }
}