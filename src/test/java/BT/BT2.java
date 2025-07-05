package BT;

import common.Setup;
import material.Locators;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BT2 extends Setup {

    @BeforeMethod
    public void Login() {
        // Login
        driver.get("https://cms.anhtester.com/login");
        driver.findElement(By.xpath(Locators.inputEmail)).clear();
        driver.findElement(By.xpath(Locators.inputPassword)).clear();
        driver.findElement(By.xpath(Locators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(Locators.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(Locators.buttonLogin)).click();
    }

    @Test
    public void testCreateNewCategory() throws InterruptedException {

        // Navigate to Category page
        driver.findElement(By.xpath(Locators.menuProducts)).click();
        driver.findElement(By.xpath(Locators.menuCategory)).click();

        //Navigate to create new Category page and create new Category
        driver.findElement(By.xpath(Locators.buttonAddNewCategory)).click();
        driver.findElement(By.xpath(Locators.inputName)).sendKeys("Add new category 250625002");
        driver.findElement(By.xpath(Locators.dropdownParentCategory)).click();
        driver.findElement(By.xpath(Locators.optionNoParent)).click();
        driver.findElement(By.xpath(Locators.inputOrderingNumber)).sendKeys("2");
        driver.findElement(By.xpath(Locators.dropdownType)).click();
        driver.findElement(By.xpath(Locators.optionDigital)).click();
        driver.findElement(By.xpath(Locators.buttonUploadBanner)).click();
        driver.findElement(By.xpath(Locators.inputSearchBanner)).sendKeys("pexels-photo-12334699");
        Thread.sleep(2000);
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
        driver.findElement(By.xpath(Locators.inputSearchCategory)).sendKeys("Add new category 250625002");
        driver.findElement(By.xpath(Locators.inputSearchCategory)).submit();
        Thread.sleep(1000);
        System.out.println("New Category is: " + driver.findElement(By.xpath(Locators.nameValueOfFirstCategory)).getText());
    }
}
