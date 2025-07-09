package co.com.udea.certification.web.tasks;

import co.com.udea.certification.core.actions.WaitActions;
import co.com.udea.certification.web.pages.SignUpPage;
import co.com.udea.certification.web.utils.WebUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import co.com.udea.certification.core.models.User;


public class SignUpTasks extends SignUpPage {
    public void selectCountry(String countryName) {
        WaitActions.waitForElementToBeVisible(getCountrySelect(), 2);
        Select select = new Select(getCountrySelect());
        select.selectByVisibleText(countryName);
    }
    public void fillFormWithUser(User user) {

        selectTitleMr(user.getTitle().equals("Mr"));
        fillName(user.getName());
        fillPassword(user.getPassword());
        selectDateOfBirth(user.getBirthDate());


        if (user.isNewsletter()) activateNewsletterCheckbox();
        if (user.isReceiveOffers()) activateReceiveOffersCheckbox();

        fillFirstName(user.getFirstName());
        fillLastName(user.getLastName());
        fillCompany(user.getCompany());
        fillAddress1(user.getAddress1());
        fillAddress2(user.getAddress2());
        selectCountry(user.getCountry());
        fillState(user.getState());
        fillCity(user.getCity());
        fillZipCode(user.getZipCode());
        fillMobilePhone(user.getMobileNumber());
    }

    public List<String> getAvailableCountries() {
        WaitActions.waitForElementToBeVisible(getCountrySelect(), 2);
        Select select = new Select(getCountrySelect());
        return select.getOptions().stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public String getRandomCountry() {
        List<String> countries = getAvailableCountries();
        countries.removeIf(option -> option.trim().isEmpty() || option.toLowerCase().contains("select"));
        Random random = new Random();
        return countries.get(random.nextInt(countries.size()));
    }

    public void selectRandomCountry() {
        WaitActions.waitForElementToBeVisible(getCountrySelect(), 2);
        Select select = new Select(getCountrySelect());
        select.selectByVisibleText(getRandomCountry());
    }

    public void selectTitleMr(boolean title) {
        if (title) {
            WaitActions.waitForElementToBeVisible(getTitleMrRadio(), 2);
            getTitleMrRadio().click();
        } else {
            WaitActions.waitForElementToBeVisible(getTitleMrRadio(), 2);
            getTitleMrsRadio().click();
        }
    }

    public void selectDateOfBirth(LocalDate dateOfBirth) {
        WaitActions.waitForElementToBeVisible(getDaySelect(), 2);
        new Select(getDaySelect()).selectByVisibleText(String.valueOf(dateOfBirth.getDayOfMonth()));
        WaitActions.waitForElementToBeVisible(getMonthSelect(), 2);
        new Select(getMonthSelect()).selectByVisibleText(WebUtils.transformMonthToString(dateOfBirth.getMonthValue()));
        WaitActions.waitForElementToBeVisible(getYearSelect(), 2);
        new Select(getYearSelect()).selectByVisibleText(String.valueOf(dateOfBirth.getYear()));
    }

    public void activateNewsletterCheckbox() {
        WaitActions.waitForElementToBeVisible(getNewsletterCheckbox(), 2);
        if (!getNewsletterCheckbox().isSelected()) {
            getNewsletterCheckbox().click();
        }
    }

    public void activateReceiveOffersCheckbox() {
        WaitActions.waitForElementToBeVisible(getReceiveOffersCheckbox(), 2);
        if (!getReceiveOffersCheckbox().isSelected()) {
            getReceiveOffersCheckbox().click();
        }
    }

    public void fillName(String userName) {
        WaitActions.waitForElementToBeVisible(getNameInput(), 2);
        getNameInput().sendKeys(userName);
    }

    public void fillPassword(String password) {
        WaitActions.waitForElementToBeVisible(getPasswordInput(), 2);
        getPasswordInput().sendKeys(password);
    }

    public void fillFirstName(String firstName) {
        WaitActions.waitForElementToBeVisible(getFirstNameInput(), 2);
        getFirstNameInput().sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        WaitActions.waitForElementToBeVisible(getLastNameInput(), 2);
        getLastNameInput().sendKeys(lastName);
    }

    public void fillCompany(String company) {
        WaitActions.waitForElementToBeVisible(getCompanyInput(), 2);
        getCompanyInput().sendKeys(company);
    }

    public void fillAddress1(String address) {
        WaitActions.waitForElementToBeVisible(getAddress1Input(), 2);
        getAddress1Input().sendKeys(address);
    }

    public void fillAddress2(String address) {
        WaitActions.waitForElementToBeVisible(getAddress2Input(), 2);
        getAddress2Input().sendKeys(address);
    }
    public void fillState(String state) {
        WaitActions.waitForElementToBeVisible(getStateInput(), 2);
        getStateInput().sendKeys(state);
    }

    public void fillCity(String city) {
        WaitActions.waitForElementToBeVisible(getCityInput(), 2);
        getCityInput().sendKeys(city);
    }

    public void fillZipCode(String zipCode) {
        WaitActions.waitForElementToBeVisible(getZipCodeInput(), 2);
        getZipCodeInput().sendKeys(zipCode);
    }

    public void fillMobilePhone(String mobilePhone) {
        WaitActions.waitForElementToBeVisible(getMobileNumberInput(), 2);
        getMobileNumberInput().sendKeys(mobilePhone);
    }

    public void finishSignUp() {
        WaitActions.waitForElementToBeClickable(getCreateAccountButton(), 2);
        getCreateAccountButton().click();
    }

    public void cleanPasswordField(){
        WaitActions.waitForElementToBeClickable(getCreateAccountButton(), 2);
        getPasswordInput().clear();
    }


    public void cleanPhoneField() {
        WaitActions.waitForElementToBeClickable(getCreateAccountButton(), 2);
        getMobileNumberInput().clear();
    }

    public void cleanZipCode() {
        WaitActions.waitForElementToBeClickable(getCreateAccountButton(), 2);
        getZipCodeInput().clear();
    }


    public void cleanUserName() {
        WaitActions.waitForElementToBeClickable(getCreateAccountButton(), 2);
        getNameInput().clear();
    }

}
