package com.itvdn.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class MainPageActions {
    MainPageElements mainPageElements = new MainPageElements();

    public MainPageActions openPage() {
        Selenide.open( "https://www.cadeaubon.nl" );
        acceptCookies();
        return this;
    }

    public MainPageActions clickOnCardsDropDown() {
        $( mainPageElements.getGiftCardsDropDown() ).click();
        return this;
    }

    public MainPageActions selectAllInOneGiftCard() {
        $( mainPageElements.getAllInOneGiftCardInGoftCardsCatalog() ).click();
        return this;
    }

    public MainPageActions selectTypeOfCardDigital() {
        $( mainPageElements.getTypeOfCardDigital() ).click();
        return this;
    }

    public MainPageActions clickAddToCartButton() {
        $( mainPageElements.getAddToCartButton() ).click();
        return this;
    }

    public MainPageActions fillInNameField( String value ) {
        $( mainPageElements.getNameField() ).setValue( value );
        return this;
    }

    public MainPageActions fillInEmailField( String value ) {
        $( mainPageElements.getEmailField() ).setValue( value );
        return this;
    }

    public MainPageActions fillInConfirmEmailField( String value ) {
        $( mainPageElements.getConfirmEmailField() ).setValue( value );
        return this;
    }

    public int getDeleteButtonElementsCount() {
//        Selenide.sleep(30000);
        $( mainPageElements.getDeleteCardButton() ).shouldBe( visible );
        return $$( mainPageElements.getDeleteCardButton() ).size();
    }

    public MainPageActions assertCardsCountInCart( int count ) {
        assertEquals( getDeleteButtonElementsCount(), count );
        return this;
    }

    public MainPageActions assertValueInCart( String value ) {
        $( mainPageElements.getValueInCart() ).shouldHave( text( value ) );
        return this;
    }

    public MainPageActions acceptCookies() {
        if ( $( mainPageElements.getAcceptAllButtonCookiesAlert() ).isDisplayed() ) {
            $( mainPageElements.getAcceptAllButtonCookiesAlert() ).click();
        }
        return this;
    }

    public MainPageActions clickGoToCartButton2() {
        $( mainPageElements.getGoToCartButton2() ).click();
        return this;
    }

    public MainPageActions clickGoToPaymentButton() {
        $( mainPageElements.getGoToPaymentButton() ).click();
        return this;
    }

    public MainPageActions clickOrderAsGuestButton() {
        $( mainPageElements.getOrderAsGuestButton() ).click();
        return this;
    }

    public MainPageActions fillInFirstNameField( String value ) {
        $( mainPageElements.getFirstNameField() ).setValue( value );
        return this;
    }
    public MainPageActions fillInLastNameField( String value ) {
        $( mainPageElements.getLastNameField() ).setValue( value );
        return this;
    }

    public MainPageActions fillInPhoneNumberField( String value ) {
        $( mainPageElements.getPhoneNumberField() ).setValue( value );
        return this;
    }

    public MainPageActions clickProceedButton () {
        $( mainPageElements.getProceedButton() ).click();
        return this;
    }

    public MainPageActions clickPaymentMethodRadioButton() {
        $( mainPageElements.getPaymentMethodRadioButton() ).click();
        return this;
    }

    public MainPageActions clickFirstBankInBanksList() {
        $( mainPageElements.getFirstBankInBanksList() ).click();
        return this;
    }

    public MainPageActions clickMakePaymentButton() {
        $( mainPageElements.getMakePaymentButton() ).click();
        return this;
    }

    public MainPageActions clickAcceptCookiesButtonOnPaymentPage() {
        $( mainPageElements.getAcceptCookiesButtonOnPaymentPage() ).click();
        return this;
    }

    public MainPageActions clickManualInputCreditCardNumber() {
        $( mainPageElements.getManualInputCreditCardNumber() ).click();
        return this;
    }

    public MainPageActions fillInCardNumberInput( String value ) {
        $( mainPageElements.getCardNumberInput() ).setValue( value );
        return this;
    }

    public MainPageActions assertCardNumberInputValue( String value ) {
        $( mainPageElements.getCardNumberInput() ).shouldHave( exactValue(value) );
        return this;
    }

    public MainPageActions fillInSearchField( String value ) {
        $( mainPageElements.getSearchField() ).setValue( value );
        return this;
    }

    public int getSearchResultsCount() {
        $( mainPageElements.getSearchResults() ).shouldBe( visible );
        return $$( mainPageElements.getSearchResults() ).size();
    }

    public MainPageActions assertSearchResultsCount( int count ) {
        assertEquals( getSearchResultsCount(), count );
        return this;
    }
}
