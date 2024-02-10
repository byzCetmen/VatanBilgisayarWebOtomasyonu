import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrunTests {
    private static WebDriver driver;
    private static AnaSayfa anaSayfa;

    @BeforeAll
    static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        driver.get("https://www.vatanbilgisayar.com");
    }

    @Test
    void urunAramaTesti(){
        anaSayfa.bekle(anaSayfa.urunArama);
        anaSayfa.yaziYaz(anaSayfa.urunArama, "RTX");
        anaSayfa.klavyeTusunaBas(anaSayfa.urunArama, Keys.ENTER);
    }

    @Test
    void urunFiltrelemeTesti(){
        anaSayfa.bekleXpath(anaSayfa.ekranKarti);
        anaSayfa.tusaBas(anaSayfa.ekranKarti);
        anaSayfa.tusaBas(anaSayfa.dortAlti);
        anaSayfa.tusaBas(anaSayfa.dortYedi);
        anaSayfa.tusaBas(anaSayfa.grafikIslemci);
        anaSayfa.bekleXpath(anaSayfa.dortDokuz);
        anaSayfa.tusaBas(anaSayfa.dortDokuz);
        anaSayfa.tusaBas(anaSayfa.dortSekiz);
        anaSayfa.bekleXpath(anaSayfa.msi);
        anaSayfa.tusaBas(anaSayfa.msi);
    }

    @Test
    void urunKarsilastirmaTesti(){
        anaSayfa.tusaBas(anaSayfa.urunDortAlti);
        anaSayfa.tusaBas(anaSayfa.karsilastir);
        driver.navigate().back();
        anaSayfa.scroll(anaSayfa.urunDortYedi);
        anaSayfa.tusaBas(anaSayfa.karsilastir);
        driver.navigate().back();
        anaSayfa.bekleXpath(anaSayfa.urunDortSekiz);
        anaSayfa.tusaBas(anaSayfa.urunDortSekiz);
        anaSayfa.tusaBas(anaSayfa.karsilastir);
        driver.navigate().back();
        anaSayfa.bekleXpath(anaSayfa.urunDortDokuz);
        anaSayfa.tusaBas(anaSayfa.urunDortDokuz);
        anaSayfa.tusaBas(anaSayfa.karsilastir);
        anaSayfa.tusaBas(anaSayfa.tumunuKarsilastir);
    }

    @AfterAll
    static void tearDown(){
        driver.close();
    }
}