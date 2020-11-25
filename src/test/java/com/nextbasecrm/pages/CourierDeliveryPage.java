package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourierDeliveryPage extends BasePage{

    @FindBy(css = "[title='Services']")
    private WebElement servicesModuleLink;

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

    @FindBy(css = "ul[class='bx-mylist-form-results']>li>div[class='bx-mylist-form-status']")
    private WebElement mostRecentOrderStatus;

    @FindBy(css = "ul[class='bx-mylist-form-results']>li>div[class='bx-mylist-form-data']>span")
    private WebElement mostRecentOrderPlacementDate;

    @FindBy(css = "ul[class='bx-mylist-form-results']>li>div[class='bx-mylist-form-data']>a")
    private WebElement mostRecentOrderCollectionDate;

}
