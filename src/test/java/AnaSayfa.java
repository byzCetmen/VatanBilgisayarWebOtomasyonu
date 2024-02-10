import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfa{
    public AnaSayfa(WebDriver driver) {
        super(driver);
    }

    public final String urunArama = "navbar-search-input";
    public final String ekranKarti = "//span[.='Ekran Kartları (115)']";
    public final String msi = "//div[@class='panel-group']//div[@class='panel-body wrapper-filter-list']//div[contains(.,'MSI (12)')]";
    public final String grafikIslemci = "//div[@class='panel-group']/div[6]//a[contains(.,'Grafik İşlemci')]";
    public final String karsilastir = "//span[.='Karşılaştır']";
    public final String tumunuKarsilastir = "//a[@id='callToCompare']/span[.='Karşılaştır']";
    public final String dortAlti = "//div[@class='panel-group']//div[@class='panel-body wrapper-filter-list']//div[contains(.,'GeForce RTX 4060 (7)')]";
    public final String dortYedi = "//div[@class='panel-group']//div[@class='panel-body wrapper-filter-list']//div[contains(.,'GeForce RTX 4070 (11)')]";
    public final String dortSekiz = "//div[@class='panel-group']//div[@class='panel-body wrapper-filter-list']//div[contains(.,'GeForce RTX 4080 (3)')]";
    public final String dortDokuz = "//div[@class='panel-group']//div[@class='panel-body wrapper-filter-list']//div[contains(.,'GeForce RTX 4090 (3)')]";
    public final String urunDortAlti = "//div[@id='productsLoad']/div[2]/div[@class='product-list__image-safe']";
    public final String urunDortYedi = "//div[@id='productsLoad']/div[5]/div[@class='product-list__image-safe']";
    public final String urunDortSekiz = "//div[@id='productsLoad']/div[10]/div[@class='product-list__image-safe']";
    public final String urunDortDokuz = "//div[@id='productsLoad']/div[11]/div[@class='product-list__image-safe']";
}