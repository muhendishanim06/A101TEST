import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a101 {
    protected static WebDriver driver;
    static String baseUrl="https://www.a101.com.tr/";



    public static void main(String[] args) throws InterruptedException
    {
        String email="aybuke7837@hotmail.com";
        String Value_="";
        String Color="";
        String adresshedar="Kuzeykent";
        String name_="Aybuke";
        String surname_="Ozdemır";
        String phone_="5411416278";
        String openaddress="kuzeykent mah. toki1 C21 blok daire:12 kat:2 ";

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        Assert.assertEquals("Anasayfa açılırken bir hata oluştu !!",baseUrl,driver.getCurrentUrl());



        waitBySecond(5);

        By path_=By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        WebElement secici=driver.findElement(path_);
        secici.click();
        waitBySecond(5);

        By path_1=By.xpath("//ul[@class='desktop-menu']/li[4]/a[1]");
        WebElement secici1=driver.findElement(path_1);
        secici1.click();
        waitBySecond(5);


        By path_2=By.xpath("//li[@class='derin '][2]/a");
        WebElement secici2=driver.findElement(path_2);
        secici2.click();
        waitBySecond(5);


        By path_3=By.xpath("//div[@class='categories']/ul/li[4]");
        WebElement secici3=driver.findElement(path_3);
        secici3.click();
        waitBySecond(5);


        By path_4=By.xpath("//ul[@class='product-list-general']/li[1]/article/div/a");
        WebElement secici4=driver.findElement(path_4);
        secici4.click();
        waitBySecond(5);


        By path_5=By.xpath("//ul[@class='product-list-general']/li[1]/article/div/a");
        Color=driver.findElement(path_5).getText();
        waitBySecond(5);
        Assert.assertEquals("Fiyat eşleşmedi","Siyah",Color);
        waitBySecond(5);

        By path_6=By.xpath("//div[@class='product-buy-info js-product-buy-info']/button");
        WebElement secici6=driver.findElement(path_6);
        secici6.click();
        waitBySecond(5);

        By path_7=By.xpath("//div[@class='right-side']/a[@class='go-to-shop']");
        WebElement secici7=driver.findElement(path_7);
        secici7.click();
        waitBySecond(5);

        By path_8=By.cssSelector(".button green checkout-button block js-checkout-button");
        WebElement secici8=driver.findElement(path_8);
        secici8.click();
        waitBySecond(5);

        By path_9=By.cssSelector(".button green checkout-button block js-checkout-button");
        WebElement secici9=driver.findElement(path_9);
        secici9.click();
        waitBySecond(5);

        By path_10=By.xpath("//input[@name='user_email']");
        WebElement secici10=driver.findElement(path_10);
        secici10.click();
        waitBySecond(5);
        secici10.sendKeys(email);

        By path_11=By.xpath("//form[@class='js-proceed-to-checkout-form form--white guest-form']/button");
        WebElement secici11=driver.findElement(path_11);
        secici11.click();
        waitBySecond(5);

        By path_12=By.xpath("//div[@class='addresses']/div[@class='list']/ul/li/a");
        WebElement secici12=driver.findElement(path_12);
        secici12.click();
        waitBySecond(5);
        //yeni adres oluştur
        By path_13=By.xpath("//label[@class='error--title']/input");
        WebElement secici13=driver.findElement(path_13);
        secici13.click();
        secici13.sendKeys(adresshedar);
        waitBySecond(5);

        By path_14=By.xpath("//label[@class='error--first_name']/input");
        WebElement secici14=driver.findElement(path_14);
        secici14.click();
        secici14.sendKeys(name_);
        waitBySecond(5);

        By path_15=By.xpath("//label[@class='error--last_name']/input");
        WebElement secici15=driver.findElement(path_15);
        secici15.click();
        secici15.sendKeys(surname_);
        waitBySecond(5);

        By path_16=By.xpath("//label[@class='error--phone_number']/input");
        WebElement secici16=driver.findElement(path_16);
        secici16.click();
        secici16.sendKeys(phone_);
        waitBySecond(5);

        By path_17=By.xpath("//div[@class='select valid--city']/select/option[@value='40']");
        WebElement secici17=driver.findElement(path_17);
        secici17.click();
        waitBySecond(5);

        By path_18=By.xpath("//div[@class='select valid--township']/select/option[@value='448']");
        WebElement secici18=driver.findElement(path_18);
        secici18.click();
        waitBySecond(5);

        By path_19=By.xpath("//div[@class='select valid--district']/select/option[@value='35388']");
        WebElement secici19=driver.findElement(path_19);
        secici19.click();
        waitBySecond(5);

        By path_20=By.cssSelector(".js-address-textarea");
        WebElement secici20=driver.findElement(path_20);
        secici20.click();
        secici20.sendKeys(openaddress);
        waitBySecond(5);

        By path_21=By.cssSelector(".button green js-set-country js-prevent-emoji");
        WebElement secici21=driver.findElement(path_21);
        secici21.click();
        waitBySecond(5);

        By path_22=By.xpath("//ul[@class='js-shipping-list']/li[1]/label");
        WebElement secici22=driver.findElement(path_22);
        secici22.click();
        waitBySecond(5);

        By path_23=By.cssSelector(".button block green js-proceed-button");
        WebElement secici23=driver.findElement(path_23);
        secici23.click();
        waitBySecond(5);

        By path_24=By.xpath("//div[@class='js-complete-with-masterpass']/button");
        WebElement secici24=driver.findElement(path_24);
        secici24.click();
        waitBySecond(5);

        By path_25=By.xpath("//div[@class='installment-area']/span[@class='error']");
        Value_=driver.findElement(path_25).getText();
        waitBySecond(5);
        Assert.assertEquals("ödeme ekranı gelmedi","Lütfen kart seçin veya kart bilgisi girin.",Value_);
        waitBySecond(5);





    }
    public static void waitBySecond(Integer key) throws InterruptedException  {

        Thread.sleep(key*1000);
    }
}
