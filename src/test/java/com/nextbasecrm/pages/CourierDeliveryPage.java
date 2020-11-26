package com.nextbasecrm.pages;

import com.nextbasecrm.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class CourierDeliveryPage extends BasePage{

    @FindBy(css = "[title='Services']")
    private WebElement servicesModuleLink;

    @FindBy(xpath = "//span[text()='e-Orders']/../..")
    private WebElement eOrdersTab;

    @FindBy(xpath = "//a[contains(text(), 'Courier')]")
    private WebElement courierDeliveryOption;

    @FindBy(name = "form_date_31")
    private WebElement collectionDateInput;

    @FindBy(name = "form_text_32")
    private WebElement deliveryAddressInput;

    @FindBy(name = "form_text_33")
    private WebElement weightInput;

    @FindBy(name = "form_textarea_34")
    private WebElement descriptionInput;

    @FindBy(name = "form_textarea_35")
    private WebElement commentInput;

    @FindBy(name = "web_form_submit")
    private WebElement submitOrderBtn;

    @FindBy(name = "web_form_apply")
    private WebElement applyBtn;

    @FindBy(css = "[type='reset']")
    private WebElement resetBtn;

    @FindBy(id = "pagetitle")
    private WebElement pageTitle;

    @FindBy(css = "ul[class='bx-mylist-form-results']>li>div[class='bx-mylist-form-status']")
    private WebElement mostRecentOrderStatus;

    @FindBy(css = "ul[class='bx-mylist-form-results']>li>div[class='bx-mylist-form-data']>span")
    private WebElement mostRecentOrderPlacementDate;

    @FindBy(css = "ul[class='bx-mylist-form-results']>li>div[class='bx-mylist-form-data']>a")
    private WebElement mostRecentOrderRequestNumber_CollectionDate;



    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);

    public void enterInput(WebElement element, String string){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(string);
        wait.until(ExpectedConditions.textToBePresentInElementValue(element,string));
    }


    public void navigateToCourierDelivery(){
        wait.until(ExpectedConditions.elementToBeClickable(servicesModuleLink));
        servicesModuleLink.click();
        wait.until(ExpectedConditions.elementToBeClickable(eOrdersTab));
        eOrdersTab.click();
        wait.until(ExpectedConditions.elementToBeClickable(courierDeliveryOption));
        courierDeliveryOption.click();
    }

    public void sendCourierDeliveryForm(Map<String,String> table){
        enterInput(collectionDateInput,table.get("Collection Date"));
        enterInput(deliveryAddressInput,table.get("Delivery Address"));
        enterInput(weightInput,table.get("Weight"));
        enterInput(descriptionInput,table.get("Description"));
        enterInput(commentInput,table.get("Comment"));
    }

    public void clickSubmitOrder(){
        submitOrderBtn.click();
    }

    public String getPageTitle(){
        wait.until(ExpectedConditions.visibilityOf(pageTitle));
        return pageTitle.getText().trim();
    }

    public boolean confirmRequest(){
        boolean orderStatusCondition = mostRecentOrderStatus.getText().trim().equals("New");

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate currentDate = LocalDate.now() ;
        LocalDate dateDisplayed = LocalDate.parse(mostRecentOrderPlacementDate.getText().trim(),format);
        boolean orderPlacementDateCondition = dateDisplayed.isEqual(currentDate);

        return orderStatusCondition && orderPlacementDateCondition;
    }

}
