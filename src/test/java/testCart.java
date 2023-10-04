import com.codeborne.selenide.Selenide;
import com.itvdn.pages.MainPageActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCart {

    private static String FIRST_NAME = "Myname";
    private static String LAST_NAME = "Lastname";
    private static String EMAIL = "a@a.com";
    private static String PRONE_NUMBER = "47787876676";
    private static String CARD_NUMBER = "44411555333";
    MainPageActions mainPageActions = new MainPageActions();

    @BeforeMethod
    public void operPage() {
        Selenide.clearBrowserCookies();
        mainPageActions.openPage();
    }

    @Test
    public void testAddProductToCart() {
        mainPageActions
                .clickOnCardsDropDown()
                .selectAllInOneGiftCard()
                .selectTypeOfCardDigital()
                .clickAddToCartButton()
                .fillInNameField( FIRST_NAME )
                .fillInEmailField( EMAIL )
                .fillInConfirmEmailField( EMAIL )
                .clickGoToCartButton2()
                .assertCardsCountInCart( 1 )
                .assertValueInCart( "1x Alles-in-1 Keuze Cadeaukaart € 25,00" );

    }

    @Test
    public void testInputCardNumber() {
        mainPageActions
                .clickOnCardsDropDown()
                .selectAllInOneGiftCard()
                .selectTypeOfCardDigital()
                .clickAddToCartButton()
                .fillInNameField( FIRST_NAME )
                .fillInEmailField( EMAIL )
                .fillInConfirmEmailField( EMAIL )
                .clickGoToCartButton2()
                .clickGoToPaymentButton()
                .clickOrderAsGuestButton()
                .fillInFirstNameField( FIRST_NAME )
                .fillInLastNameField( LAST_NAME )
                .fillInEmailField( EMAIL )
                .fillInPhoneNumberField( PRONE_NUMBER )
                .clickProceedButton()
                .clickPaymentMethodRadioButton()
                .clickFirstBankInBanksList()
                .clickMakePaymentButton()
                .clickAcceptCookiesButtonOnPaymentPage()
                .clickManualInputCreditCardNumber()
                .fillInCardNumberInput( CARD_NUMBER )
                .assertCardNumberInputValue( CARD_NUMBER );
    }

    @Test
    public void testAutocomplete() {
        mainPageActions
                .fillInSearchField( "alles" )
                .assertSearchResultsCount( 2 );
    }
}
