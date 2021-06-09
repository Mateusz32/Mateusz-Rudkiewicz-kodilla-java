package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//button[contains(@class,\"_42ft _4jy0 _9o-t _4jy3 _4jy1 selected _51sy\")]";
    public static final String XPATH_REGISTRED = "//a[contains(@class,\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\")]";
    public static final String XPATH_WAITFOR = "//a[contains(@class,\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\")]::after";
    public static final String XPATH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span";
    public static final String XPATH_SELECT_DAY = "select[name='birthday_day']";
    public static final String XPATH_SELECT_MONTH = XPATH_SELECT + "/select[2]";
    public static final String XPATH_SELECT_YEAR = XPATH_SELECT + "/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement bottonCookies = driver.findElement(By.xpath(XPATH_COOKIES));
        bottonCookies.click();

        WebElement bottonRegistred = driver.findElement(By.xpath(XPATH_REGISTRED));
        bottonRegistred.click();

       // while (!driver.findElement(By.xpath(XPATH_WAITFOR)).isDisplayed()) ;

        //02.11.1999
        WebElement selectComboDay = driver.findElement(By.cssSelector(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(2);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(11);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(20);


}}
