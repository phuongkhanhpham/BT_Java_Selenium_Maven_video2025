package material;

public class Locators {

    // Login page
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";

    // Admin page
    public static String menuProducts = "//ul[@id='main-menu']//span[normalize-space()='Products']";
    public static String menuCategory = "//span[normalize-space()='Category']";
    public static String menuAddNewProduct = "//span[normalize-space()='Add New Product']";

    // Add new product page
    public static String headerAddNewProduct = "//h5[normalize-space()='Add New Product']";
    public static String inputProductName = "//label[normalize-space()='Product Name *']/following-sibling::div/input[@placeholder='Product Name']";
    public static String dropdowncategory = "//button[@data-id='category_id']";
    public static String inputSearchProductCategoryId = "//button[@data-id='category_id']/following-sibling::div//input";
    public static String firstoptionCategory = "//button[@data-id='category_id']/following-sibling::div//li[1]/a";
    public static String dropdownBrand = "//button[@data-id='brand_id']";
    public static String inputSearchBrand = "//button[@data-id='brand_id']/following-sibling::div//input";
    public static String firstoptionBrand = "//button[@data-id='brand_id']/following-sibling::div//li[1]/a";
    public static String inputUnit = "//input[@name='unit']";
    public static String inputWeight = "//input[@name='weight']";
    public static String inputMinimumPurchaseQty = "//input[@name='min_qty']";
    public static String inputTag = "//span[@data-placeholder='Type and hit enter to add a tag']";
    public static String inputBarcode = "//label[normalize-space()='Barcode']/following-sibling::div/input";
    public static String buttonUploadGalleryImages = "//label[normalize-space()='Gallery Images (600x600)']/following-sibling::div/div[@class='input-group']";
    public static String inputSearchGalleryImages = "//input[@name='aiz-uploader-search']";
    public static String firstGalleryImages = "//div[@class='modal-body']//img[1]";
    public static String buttonAddFilesGalleryImages = "//button[normalize-space()='Add Files']";
    public static String buttonUploadThumbnailImage = "//label[normalize-space()='Thumbnail Image (300x300)']/following-sibling::div/div[@class='input-group']";
    public static String inputSearchThumbnailImage = "//input[@name='aiz-uploader-search']";
    public static String firstThumbnailImage = "//div[@class='modal-body']//img[1]";
    public static String buttonAddFilesThumbnailImage = "//button[normalize-space()='Add Files']";
    public static String dropdownVideoProvider = "//button[@data-id='video_provider']";
    public static String optionVideoProviderYoutube = "//button[@data-id='video_provider']/following-sibling::div//a[normalize-space()='Youtube']";
    public static String optionVideoProviderDailymotion = "//button[@data-id='video_provider']/following-sibling::div//a[normalize-space()='Dailymotion']";
    public static String optionVideoProviderVimeo = "//button[@data-id='video_provider']/following-sibling::div//a[normalize-space()='Vimeo']";
    public static String inputVideoLink = "//label[normalize-space()='Video Link']/following-sibling::div/input";
    public static String toggleColors = "//input[@name='colors_active']/following-sibling::span";
    public static String dropdownColors = "//button[@data-id='colors']";
    public static String inputSearchColors = "//button[@data-id='colors']/following-sibling::div//input";
    public static String firstOptionColor = "//button[@data-id='colors']/following-sibling::div//li[1]/a";
    public static String dropdownAttributes = "//button[@data-id='choice_attributes']";
    public static String optionAttributeSize = "//a[normalize-space()='Size']";
    public static String dropdownAttributeSize = "//select[@name='choice_options_1[]']/following-sibling::button";
    public static String inputSearchAttributeSize = "//select[@name='choice_options_1[]']/following-sibling::div//input";
    public static String firstOptionAttributeSize = "//select[@name='choice_options_1[]']/following-sibling::div//li[1]/a";
    public static String optionAttributeQuality3 = "//a[normalize-space()='Quality3']";
    public static String dropdownAttributeQuality3 = "//select[@name='choice_options_4[]']/following-sibling::button";
    public static String optionAttributeQuality3Real = "//select[@name='choice_options_4[]']/following-sibling::div//a[normalize-space()='Real']";
    public static String optionAttributeQuality3Remake = "//select[@name='choice_options_4[]']/following-sibling::div//a[normalize-space()='Remake']";
    public static String inputUnitPrice = "//input[@name='unit_price']";
    public static String inputDiscountDateRange = "//input[@name='date_range']";
    public static String buttonSelectDateRange = "//button[text()='Select' and @class='applyBtn btn btn-sm btn-primary']";
    public static String inputDiscount = "//input[@name='discount']";
    public static String dropdownDiscountType = "//select[@name='discount_type']/following-sibling::button";
    public static String optionDiscountTypeFlat = "//select[@name='discount_type']/following-sibling::div//a[normalize-space()='Flat']";
    public static String optionDiscountTypePercent = "//select[@name='discount_type']/following-sibling::div//a[normalize-space()='Percent']";
    public static String inputQuantity = "//input[@name='current_stock']";
    public static String inputSku = "//input[@name='sku']";
    public static String inputExternalLink = "//input[@name='external_link']";
    public static String inputExternalLinkButtonText = "//input[@name='external_link_btn']";
    public static String textareaProductDescription = "//textarea[@class='note-codable']/following-sibling::div";
    public static String buttonUploadPDFSpecification = "//label[normalize-space()='PDF Specification']/following-sibling::div/div[@class='input-group']";
    public static String firstOptionPDFSpecification = "//div[@id='aiz-select-file']//div[@class='aiz-file-box-wrap'][1]//div[@class='card-file-thumb']";
    public static String buttonAddFilesPDFSpecification = "//div[@id='aizUploaderModal']//button[normalize-space()='Add Files']";
    public static String inputMetaTitle = "//input[@name='meta_title']";
    public static String textareaMetaDescription = "//textarea[@name='meta_description']";
    public static String buttonUploadMetaImage = "//label[normalize-space()='Meta Image']//following-sibling::div/div[@class='input-group']";
    public static String inputSearchMetaImage = "//input[@name='aiz-uploader-search']";
    public static String firstOptionMetaImage = "//div[@id='aiz-select-file']//div[@class='aiz-file-box-wrap'][1]//img";
    public static String buttonAddFilesMetaImage = "//div[@id='aiz-select-file']/ancestor::div[@class='modal-body']/following-sibling::div/button";
    public static String inputLowStockQuantityWarning = "//input[@name='low_stock_quantity']";
    public static String toggleShowStockQuantity = "//label[normalize-space()='Show Stock Quantity']/following-sibling::div//span";
    public static String toggleShowStockWithTextOnly = "//label[normalize-space()='Show Stock With Text Only']/following-sibling::div//span";
    public static String toggleHideStock= "//label[normalize-space()='Hide Stock']/following-sibling::div//span";
    public static String toggleStatusCashOnDelivery = "//input[@name='cash_on_delivery']/following-sibling::span";
    public static String toggleStatusFeatured = "//input[@name='featured']/following-sibling::span";
    public static String toggleStatusTodaysDeal = "//input[@name='todays_deal']/following-sibling::span";
    public static String dropdownAddToFlash = "//button[@data-id='flash_deal']";
    public static String optionChooseFlashTitle = "//button[@data-id='flash_deal']/following-sibling::div//a[normalize-space()='Choose Flash Title']";
    public static String optionHotDeal1 = "//button[@data-id='flash_deal']/following-sibling::div//a[normalize-space()='Hot deal 01']";
    public static String inputFlashDiscount = "//input[@name='flash_discount']";
    public static String dropdownFlashDiscountType = "//button[@data-id='flash_discount_type']";
    public static String optionChooseDiscountType = "//button[@data-id='flash_discount_type']/following-sibling::div//a[normalize-space()='Choose Discount Type']";
    public static String optionFlashDiscountTypeFlat = "//button[@data-id='flash_discount_type']/following-sibling::div//a[normalize-space()='Flat']";
    public static String optionFlashDiscountTypePercent = "//button[@data-id='flash_discount_type']/following-sibling::div//a[normalize-space()='Percent']";
    public static String inputShippingDays = "//input[@name='est_shipping_days']";
    public static String inputTax = "//input[@name='tax[]']";
    public static String dropdownTaxType = "//select[@name='tax_type[]']/following-sibling::button";
    public static String optionTaxFlat = "//select[@name='tax_type[]']/following-sibling::div//a[normalize-space()='Flat']";
    public static String optionTaxPercent = "//select[@name='tax_type[]']/following-sibling::div//a[normalize-space()='Percent']";
    public static String buttonSaveAndUnpublish = "//button[normalize-space()='Save & Unpublish']";
    public static String buttonSaveAndPublish = "//button[normalize-space()='Save & Publish']";

    // Categories page
    public static String headerCategory = "//h1[normalize-space()='All categories']";
    public static String buttonAddNewCategory = "//a[normalize-space()='Add New category']";
    public static String inputSearchCategory = "//input[@id='search']";
    public static String nameValueOfFirstCategory = "//tbody//td[2]";
    public static String buttonEditOfFirstCategory = "//tbody/tr[1]//a[@title='Edit']";
    public static String buttonDeleteOfFirstCategory = "//tbody/tr[1]//a[@title='Delete']";

    // Create New Category page
    public static String headerAddNewCategory = "//h5[normalize-space()='Category Information']";
    public static String inputName = "//input[@id='name']";
    public static String dropdownParentCategory = "//select[@name='parent_id']/following-sibling::button";
    public static String inputSearchParentCategory = "//select[@name='parent_id']/following-sibling::button/following-sibling::div//input";
    public static String optionNoParent = "//a[@role='option' and normalize-space()='No Parent']";
    public static String firstOptionParentCategory = "//div[@id='bs-select-1']//li[1]";
    public static String inputOrderingNumber = "//input[@id='order_level']";
    public static String dropdownType = "//select[@name='digital']/following-sibling::button";
    public static String optionPhysical = "//a[@role='option' and normalize-space()='Physical']";
    public static String optionDigital = "//a[@role='option' and normalize-space()='Digital']";
    public static String buttonUploadBanner = "//label[normalize-space()='Banner (200x200)']/following-sibling::div/div[@class='input-group']";
    public static String filePreviewNameOfBanner = "//label[normalize-space()='Banner (200x200)']/following-sibling::div//span[@class='text-truncate title']";
    public static String inputSearchBanner = "//div[@id='aiz-select-file']//input[@placeholder='Search your files']";
    public static String firstImageBanner = "//div[@id='aiz-select-file']//div[@class='aiz-file-box-wrap'][1]//div[@class='card-file-thumb']";
    public static String buttonBannerAddFiles = "//button[normalize-space()='Add Files']";
    public static String buttonUploadIcon = "//label[normalize-space()='Icon (32x32)']/following-sibling::div/div[@class='input-group']";
    public static String filePreviewNameOfIcon = "//label[normalize-space()='Icon (32x32)']/following-sibling::div//span[@class='text-truncate title']";
    public static String inputSearchIcon = "//div[@id='aiz-select-file']//input[@placeholder='Search your files']";
    public static String firstImageIcon = "//div[@id='aiz-select-file']//div[@class='aiz-file-box-wrap'][1]//div[@class='card-file-thumb']";
    public static String buttonIconAddFiles = "//button[normalize-space()='Add Files']";
    public static String inputCategoryMetaTitle = "//label[normalize-space()='Meta Title']/following-sibling::div/input";
    public static String textareaCategoryMetaDescription = "//label[normalize-space()='Meta description']/following-sibling::div/textarea";
    public static String dropdownFilteringAttributes = "//label[normalize-space()='Filtering Attributes']/following-sibling::div//button";
    public static String optionSize = "//a[@role='option' and normalize-space()='Size']";
    public static String optionQuality3 = "//a[@role='option' and normalize-space()='Quality3']";
    public static String buttonSave = "//button[normalize-space()='Save']";
    public static String alertMessage = "//div[@role='alert']";

    // Edit Category page
    public static String inputSlug = "//input[@id='slug']";

    // Delete category pop-up
    public static String titlePopupDeleteConfirmation = "//h4[normalize-space()='Delete Confirmation']";
    public static String messagePopupDeleteConfirmation = "//p[normalize-space()='Are you sure to delete this?']";
    public static String buttonConfirmDelete = "//a[@id='delete-link']";
    public static String buttonCancelDelete = "//a[@id='delete-link']/preceding-sibling::button";
}
