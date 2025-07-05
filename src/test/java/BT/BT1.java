package BT;

import material.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BT1 extends Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://cms.anhtester.com/login");

        // Login
        driver.findElement(By.xpath(Locators.inputEmail)).clear();
        driver.findElement(By.xpath(Locators.inputPassword)).clear();
        driver.findElement(By.xpath(Locators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(Locators.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(Locators.buttonLogin)).click();

        // Navigate to Category page
        driver.findElement(By.xpath(Locators.menuProducts)).click();
        driver.findElement(By.xpath(Locators.menuCategory)).click();

        //Navigate to create new Caregory page and create new Caregory
        driver.findElement(By.xpath(Locators.buttonAddNewCategory)).click();
        driver.findElement(By.xpath(Locators.inputName)).sendKeys("Add new category 250623001");
        driver.findElement(By.xpath(Locators.dropdownParentCategory)).click();
        driver.findElement(By.xpath(Locators.optionNoParent)).click();
        driver.findElement(By.xpath(Locators.inputOrderingNumber)).sendKeys("2");
        driver.findElement(By.xpath(Locators.dropdownType)).click();
        driver.findElement(By.xpath(Locators.optionDigital)).click();
        driver.findElement(By.xpath(Locators.buttonUploadBanner)).click();
        driver.findElement(By.xpath(Locators.inputSearchBanner)).sendKeys("pexels-photo-12334699");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.firstImageBanner)).click();
        driver.findElement(By.xpath(Locators.buttonBannerAddFiles)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.buttonUploadIcon)).click();
        driver.findElement(By.xpath(Locators.inputSearchIcon)).sendKeys("pexels-photo-12334699");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.firstImageIcon)).click();
        driver.findElement(By.xpath(Locators.buttonIconAddFiles)).click();
        driver.findElement(By.xpath(Locators.inputCategoryMetaTitle)).sendKeys("Test");
        driver.findElement(By.xpath(Locators.textareaCategoryMetaDescription)).sendKeys("Test");
        driver.findElement(By.xpath(Locators.dropdownFilteringAttributes)).click();
        driver.findElement(By.xpath(Locators.optionSize)).click();
        driver.findElement(By.xpath(Locators.buttonSave)).click();

        // Search the new Category
        driver.findElement(By.xpath(Locators.inputSearchCategory)).sendKeys("Add new category 250623001");
        driver.findElement(By.xpath(Locators.inputSearchCategory)).submit();
        Thread.sleep(1000);
        System.out.println("New Category is: " + driver.findElement(By.xpath(Locators.nameValueOfFirstCategory)).getText());

        driver.close();
    }
}
