package com.itvdn.pages;

import org.openqa.selenium.By;

public class MainPageElements {
    public By getGiftCardsDropDown() {
        return By.className( "Header_menuDropdownLinkBtn__lsosu" );
    }

    public By getAllInOneGiftCardInGoftCardsCatalog() {
        return By.xpath( "/html/body/div[4]/div/div/div/div/div[2]/div/div[1]/div/a/div[1]/div[2]/p" );
    }

    public By getAddToCartButton() {
        return By.className( "ProductDetailsOrderForm_buttonContainer__iNzrM" );
    }

    public By getNameField() {
        return By.name( "name" );
    }

    public By getEmailField() {
        return By.name( "email" );
    }

    public By getConfirmEmailField() {
        return By.name( "confirmEmail" );
    }

    public By getDeleteCardButton() {
        return By.className( "_72da90456a07324bdefdd68080f5cfee-css" );
    }

    public By getValueInCart() {
        return By.xpath( "//p[contains(@class,'_2e0a6e63c9d773873f5cb2647e252d80-css _7caba9c7daf0780df2b43c52ca2f1076-css e22395eb268bf46bd336a28d2e3c7e9d-css')]" );
    }

    public By getAcceptAllButtonCookiesAlert() {
        return By.id( "CookieConsentIOAccept" );
    }

    public By getGoToCartButton2() {
        return By.xpath( "//button[contains(@class,'Button_button__L2wUb Button_primary__wnomA Button_fill__TU8s1')]" );
    }

    public By getGoToPaymentButton() {
        return By.xpath( "//button[contains(@class,'c17eff8f211f29b27eba25e2d93a4838-css _2e17d7827c874ccef421967dcb554c83-css b6dadb1bb780bf808ecfb1f2fc52f04f-css _5ccdaccaac08e9990a425134ed83942f-css')]");
    }

    public By getOrderAsGuestButton() {
        return By.className( "_1788a994d30fa927e46eafc976844ae7-css" );
    }

    public By getFirstNameField() {
        return By.name( "firstName" );
    }

    public By getLastNameField() {
        return By.name( "lastName" );
    }

    public By getPhoneNumberField() {
        return By.name( "phoneNumber" );
    }

    public By getProceedButton() {
        return By.xpath( "//button[contains(@class,'c17eff8f211f29b27eba25e2d93a4838-css _2e17d7827c874ccef421967dcb554c83-css _0d1f58623968a8f59e733f240b62b4d9-css _9236ebaaa4e28f8cea2c275770f609c6-css')]");
    }

    public By getPaymentMethodRadioButton() {
        return By.className( "aea9d6462385e76fe8fcee98986e31e4-css" );
    }

    public By getFirstBankInBanksList() {
        return By.xpath( "/html/body/div[7]/div/div[2]/div/div/div[1]" );
    }

    public By getMakePaymentButton() {
        return By.xpath( "//button[contains(@class,'c17eff8f211f29b27eba25e2d93a4838-css _2e17d7827c874ccef421967dcb554c83-css b6dadb1bb780bf808ecfb1f2fc52f04f-css _8badd31c7bf12131aa1480790c9002e0-css')]" );
    }

    public By getAcceptCookiesButtonOnPaymentPage() {
        return By.id( "aab-cookie-consent-agree" );
    }

    public By getManualInputCreditCardNumber() {
        return By.xpath( "//span[contains(@class,'em-icon em-icon-size-7 method-icon-top pr-authentication-edentifier')]" );
    }

    public By getCardNumberInput() {
        return By.id( "ed2AccountNumber" );
    }

    public By getTypeOfCardDigital() {
        return By.xpath( "//*[@id=\"__next\"]/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]" );
    }

    public By getSearchField() {
        return By.className( "SearchInput_input__c6dUV" );
    }

    public By getSearchResults() {
        return By.className( "SearchResults_productCardContainer__wzKDa" );
    }
}
