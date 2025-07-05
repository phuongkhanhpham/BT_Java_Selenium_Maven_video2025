package BT;

import common.Setup;
import material.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BT4 extends Setup {

    SoftAssert softAssert = new SoftAssert();
    String newProduct = "Test Add new Product 050725004";

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
    public void testCreateProduct() throws InterruptedException {

        Actions actions = new Actions(driver);

        // Access to Add New Product page
        driver.findElement(By.xpath(Locators.menuProducts)).click();
        driver.findElement(By.xpath(Locators.menuAddNewProduct)).click();
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.headerAddNewProduct)).getText(), "Add New Product", "The header of Add New Product page is not matched");

        // Input all fields
        driver.findElement(By.xpath(Locators.inputProductName)).sendKeys(newProduct);
        driver.findElement(By.xpath(Locators.dropdowncategory)).click();
        driver.findElement(By.xpath(Locators.inputSearchProductCategoryId)).sendKeys(BT3.newCategory);
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.firstoptionCategory)).click();
        driver.findElement(By.xpath(Locators.dropdownBrand)).click();
        driver.findElement(By.xpath(Locators.inputSearchBrand)).sendKeys("NikeVTK");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.firstoptionBrand)).click();
        driver.findElement(By.xpath(Locators.inputUnit)).sendKeys("KG");
        driver.findElement(By.xpath(Locators.inputWeight)).clear();
        driver.findElement(By.xpath(Locators.inputWeight)).sendKeys("10");
        driver.findElement(By.xpath(Locators.inputMinimumPurchaseQty)).clear();
        driver.findElement(By.xpath(Locators.inputMinimumPurchaseQty)).sendKeys("2");
        actions.sendKeys(driver.findElement(By.xpath(Locators.inputTag)), "Test").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        actions.sendKeys(driver.findElement(By.xpath(Locators.inputTag)), "Test0").sendKeys(Keys.ENTER).build().perform();
        driver.findElement(By.xpath(Locators.inputBarcode)).sendKeys("Test");
        driver.findElement(By.xpath(Locators.buttonUploadGalleryImages)).click();
        driver.findElement(By.xpath(Locators.inputSearchGalleryImages)).sendKeys("download (11)");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.firstGalleryImages)).click();
        driver.findElement(By.xpath(Locators.buttonAddFilesGalleryImages)).click();
        driver.findElement(By.xpath(Locators.buttonUploadThumbnailImage)).click();
        driver.findElement(By.xpath(Locators.inputSearchThumbnailImage)).sendKeys("download (11)");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.firstThumbnailImage)).click();
        driver.findElement(By.xpath(Locators.buttonAddFilesThumbnailImage)).click();
        driver.findElement(By.xpath(Locators.dropdownVideoProvider)).click();
        driver.findElement(By.xpath(Locators.optionVideoProviderVimeo)).click();
        actions.sendKeys(driver.findElement(By.xpath(Locators.inputVideoLink)), "Test").build().perform();
        driver.findElement(By.xpath(Locators.toggleColors)).click();
        driver.findElement(By.xpath(Locators.dropdownColors)).click();
        driver.findElement(By.xpath(Locators.inputSearchColors)).sendKeys("Bisque");
        driver.findElement(By.xpath(Locators.firstOptionColor)).click();
        driver.findElement(By.xpath(Locators.inputSearchColors)).clear();
        driver.findElement(By.xpath(Locators.inputSearchColors)).sendKeys("CadetBlue");
        driver.findElement(By.xpath(Locators.firstOptionColor)).click();
        driver.findElement(By.xpath(Locators.dropdownColors)).click();
        Assert.assertEquals(driver.findElement(By.xpath(Locators.dropdownColors)).getText(), "2 items selected", "The number of selected colors does not match");
        driver.findElement(By.xpath(Locators.dropdownAttributes)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.optionAttributeSize)).click();
        driver.findElement(By.xpath(Locators.optionAttributeQuality3)).click();
        driver.findElement(By.xpath(Locators.dropdownAttributes)).click();
        Assert.assertEquals(driver.findElement(By.xpath(Locators.dropdownAttributes)).getText(), "2 items selected", "The number of selected attributes does not match");
        driver.findElement(By.xpath(Locators.dropdownAttributeSize)).click();
        actions.sendKeys(driver.findElement(By.xpath(Locators.inputSearchAttributeSize)), "22").build().perform();
        driver.findElement(By.xpath(Locators.firstOptionAttributeSize)).click();
        driver.findElement(By.xpath(Locators.dropdownAttributeSize)).click();
        Assert.assertEquals(driver.findElement(By.xpath(Locators.dropdownAttributeSize)).getText(), "22", "The value of selected attribute size does not match");
        driver.findElement(By.xpath(Locators.dropdownAttributeQuality3)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.optionAttributeQuality3Real)).click();
        driver.findElement(By.xpath(Locators.optionAttributeQuality3Remake)).click();
        driver.findElement(By.xpath(Locators.dropdownAttributeQuality3)).click();
        Assert.assertEquals(driver.findElement(By.xpath(Locators.dropdownAttributeQuality3)).getText(), "Real, Remake", "The value of selected attribute size does not match");
        driver.findElement(By.xpath(Locators.inputUnitPrice)).sendKeys("10000");
        driver.findElement(By.xpath(Locators.inputDiscountDateRange)).sendKeys("10-07-2025 00:00:00 to 11-08-2025 23:59:00");
        driver.findElement(By.xpath(Locators.buttonSelectDateRange)).click();
        driver.findElement(By.xpath(Locators.inputDiscount)).clear();
        driver.findElement(By.xpath(Locators.inputDiscount)).sendKeys("15");
        driver.findElement(By.xpath(Locators.dropdownDiscountType)).click();
        driver.findElement(By.xpath(Locators.optionDiscountTypePercent)).click();
        driver.findElement(By.xpath(Locators.inputExternalLink)).sendKeys("Test External Link");
        driver.findElement(By.xpath(Locators.inputExternalLinkButtonText)).sendKeys("Test External Link Button Text");
        driver.findElement(By.xpath(Locators.textareaProductDescription)).sendKeys("Test");
        driver.findElement(By.xpath(Locators.buttonUploadPDFSpecification)).click();
        driver.findElement(By.xpath(Locators.firstOptionPDFSpecification)).click();
        driver.findElement(By.xpath(Locators.buttonAddFilesPDFSpecification)).click();
        driver.findElement(By.xpath(Locators.inputMetaTitle)).sendKeys("Test Meta Title");
        driver.findElement(By.xpath(Locators.textareaMetaDescription)).sendKeys("Test Meta Description");
        driver.findElement(By.xpath(Locators.buttonUploadMetaImage)).click();
        driver.findElement(By.xpath(Locators.inputSearchMetaImage)).sendKeys("download (11)");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Locators.firstOptionMetaImage)).click();
        driver.findElement(By.xpath(Locators.buttonAddFilesMetaImage)).click();
        driver.findElement(By.xpath(Locators.inputLowStockQuantityWarning)).clear();
        driver.findElement(By.xpath(Locators.inputLowStockQuantityWarning)).sendKeys("5");
        driver.findElement(By.xpath(Locators.toggleShowStockWithTextOnly)).click();
        driver.findElement(By.xpath(Locators.toggleStatusFeatured)).click();
        driver.findElement(By.xpath(Locators.toggleStatusTodaysDeal)).click();
        driver.findElement(By.xpath(Locators.dropdownAddToFlash)).click();
        driver.findElement(By.xpath(Locators.optionHotDeal1)).click();
        driver.findElement(By.xpath(Locators.inputFlashDiscount)).clear();
        driver.findElement(By.xpath(Locators.inputFlashDiscount)).sendKeys("30");
        driver.findElement(By.xpath(Locators.dropdownFlashDiscountType)).click();
        driver.findElement(By.xpath(Locators.optionFlashDiscountTypePercent)).click();
        driver.findElement(By.xpath(Locators.inputShippingDays)).sendKeys("7");
        driver.findElement(By.xpath(Locators.inputTax)).clear();
        driver.findElement(By.xpath(Locators.inputTax)).sendKeys("10");
        driver.findElement(By.xpath(Locators.dropdownTaxType)).click();
        driver.findElement(By.xpath(Locators.optionTaxPercent)).sendKeys("10");
        driver.findElement(By.xpath(Locators.buttonSaveAndPublish)).click();
        Thread.sleep(20000);

        softAssert.assertAll();
    }
}
