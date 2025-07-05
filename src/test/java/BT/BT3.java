package BT;

import common.Setup;
import material.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BT3 extends Setup {

    public static String newCategory = "Add new category 050725002";
    SoftAssert softAssert = new SoftAssert();

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
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.headerCategory)).getText(), "All categories", "The Category header is incorrect.");
        Assert.assertTrue(driver.findElement(By.xpath(Locators.buttonAddNewCategory)).isDisplayed(), "The Add New category is NOT displayed.");

        //Navigate to create new Category page and create new Category
        driver.findElement(By.xpath(Locators.buttonAddNewCategory)).click();
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.headerAddNewCategory)).getText(), "Category Information", "The Add New category header is incorrect.");
        driver.findElement(By.xpath(Locators.inputName)).sendKeys(newCategory);
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

        softAssert.assertTrue(driver.findElement(By.xpath(Locators.alertMessage)).isDisplayed(), "The create successfully alert is not displayed.");
        softAssert.assertTrue(driver.findElement(By.xpath(Locators.alertMessage)).getText().contains("Category has been inserted successfully"), "The create successfully alert is not matched.");

        // Search the new Category
        driver.findElement(By.xpath(Locators.inputSearchCategory)).sendKeys(newCategory);
        driver.findElement(By.xpath(Locators.inputSearchCategory)).submit();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath(Locators.nameValueOfFirstCategory)).getText(), newCategory, "The Category name is not matched.");

        // Access to the new Category to check values
        driver.findElement(By.xpath(Locators.buttonEditOfFirstCategory)).click();
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.inputName)).getAttribute("value"), newCategory, "The category name is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.dropdownParentCategory)).getText(), "No Parent", "The Parent Category value is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.inputOrderingNumber)).getAttribute("value"), "2", "The Ordering Number is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.filePreviewNameOfBanner)).getText(), "pexels-photo-12334699", "The file preview name of Banner is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.filePreviewNameOfIcon)).getText(), "pexels-photo-12334699", "The file preview name of Icon is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.inputCategoryMetaTitle)).getAttribute("value"), "Test", "The Meta Title is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.textareaCategoryMetaDescription)).getText(), "Test", "The Meta description is not matched.");
        softAssert.assertTrue(driver.findElement(By.xpath(Locators.inputSlug)).getAttribute("value").contains(newCategory.trim().replaceAll("\\s", "-")), "The Slug value is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.dropdownFilteringAttributes)).getText(), "Size", "The Filtering Attributes is not matched.");

        softAssert.assertAll();
    }

    @Test
    public void testEditCategory() throws InterruptedException {

        testCreateNewCategory();

        // Access to Category page and search for the category which need to be edited
        driver.findElement(By.xpath(Locators.menuCategory)).click();
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.headerCategory)).getText(), "All categories", "The Category header is incorrect.");
        Assert.assertTrue(driver.findElement(By.xpath(Locators.buttonAddNewCategory)).isDisplayed(), "The Add New category is NOT displayed.");
        driver.findElement(By.xpath(Locators.inputSearchCategory)).sendKeys(newCategory);
        driver.findElement(By.xpath(Locators.inputSearchCategory)).submit();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath(Locators.nameValueOfFirstCategory)).getText(), newCategory, "The Category name is not matched.");

        // Access to the new Category to edit values
        driver.findElement(By.xpath(Locators.buttonEditOfFirstCategory)).click();
        driver.findElement(By.xpath(Locators.inputName)).clear();
        driver.findElement(By.xpath(Locators.inputName)).sendKeys(newCategory + " test edit");
        driver.findElement(By.xpath(Locators.dropdownParentCategory)).click();
        driver.findElement(By.xpath(Locators.inputSearchParentCategory)).sendKeys("123");
        driver.findElement(By.xpath(Locators.firstOptionParentCategory)).click();
        driver.findElement(By.xpath(Locators.inputOrderingNumber)).clear();
        driver.findElement(By.xpath(Locators.inputOrderingNumber)).sendKeys("3");
        driver.findElement(By.xpath(Locators.dropdownType)).click();
        driver.findElement(By.xpath(Locators.optionPhysical)).click();
        driver.findElement(By.xpath(Locators.buttonSave)).click();

        Thread.sleep(1000);

        softAssert.assertTrue(driver.findElement(By.xpath(Locators.alertMessage)).isDisplayed(), "The edit successfully alert is not displayed.");
        softAssert.assertTrue(driver.findElement(By.xpath(Locators.alertMessage)).getText().contains("Category has been updated successfully"), "The edit successfully alert is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.inputName)).getAttribute("value"), newCategory + " test edit", "The category name is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.dropdownParentCategory)).getText(), "123", "The Parent Category value is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.inputOrderingNumber)).getAttribute("value"), "3", "The Ordering Number is not matched.");

        softAssert.assertAll();

    }

    @Test
    public void testDeleteCategory() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        testCreateNewCategory();

        // Access to Category page and search for the category which need to be deleted
        driver.findElement(By.xpath(Locators.menuCategory)).click();
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.headerCategory)).getText(), "All categories", "The Category header is incorrect.");
        Assert.assertTrue(driver.findElement(By.xpath(Locators.buttonAddNewCategory)).isDisplayed(), "The Add New category is NOT displayed.");
        driver.findElement(By.xpath(Locators.inputSearchCategory)).sendKeys(newCategory);
        driver.findElement(By.xpath(Locators.inputSearchCategory)).submit();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath(Locators.nameValueOfFirstCategory)).getText(), newCategory, "The Category name is not matched.");

        // Delete category
        driver.findElement(By.xpath(Locators.buttonDeleteOfFirstCategory)).click();
        Thread.sleep(1000);
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.titlePopupDeleteConfirmation)).getText(), "Delete Confirmation", "The title in Delete confirmation pop-up is not matched.");
        softAssert.assertEquals(driver.findElement(By.xpath(Locators.messagePopupDeleteConfirmation)).getText(), "Are you sure to delete this?", "The message in Delete confirmation pop-up is not matched.");
        driver.findElement(By.xpath(Locators.buttonConfirmDelete)).click();

        softAssert.assertTrue(driver.findElement(By.xpath(Locators.alertMessage)).isDisplayed(), "The delete successfully alert is not displayed.");
        softAssert.assertTrue(driver.findElement(By.xpath(Locators.alertMessage)).getText().contains("Category has been deleted successfully"), "The delete successfully alert is not matched.");

        // Search again to check if the category is deleted successfully
        driver.findElement(By.xpath(Locators.inputSearchCategory)).sendKeys(newCategory);
        driver.findElement(By.xpath(Locators.inputSearchCategory)).submit();
        Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Locators.nameValueOfFirstCategory))), "Category still visible after deletion.");

        softAssert.assertAll();

    }
}
