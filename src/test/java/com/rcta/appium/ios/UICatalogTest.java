package com.rcta.appium.ios;

import com.rcta.appium.ios.util.AppiumTest;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.rcta.appium.ios.util.Helpers.back;
import static com.rcta.appium.ios.util.Helpers.element;
import static com.rcta.appium.ios.util.Helpers.text;

/**
 * Created by bree.lu on 7/23/15.
 */
public class UICatalogTest extends AppiumTest {
    @Test
    public void buttonPageTest() {
        home.enterCatalogPage();
        home.buttonsClick();
        back();
    }

    @Test
    public void simpleAlertTest() throws InterruptedException {
        home.enterCatalogPage();
        home.alertsClick();
        System.out.println("[INFO]step 1 : Simple alert pop up ");
        text("Simple").click();
        element(By.name("OK")).click();

        System.out.println("[INFO]step 1 : Text entry alert pop up ");
        text("Text entry").click();
        element(By.name("Cancel"));
    }

    @Test
    @Ignore
    public void pageObject() throws Exception {
        home.buttonsClick();
        back();

        home.controlsClick();
        back();
    }
}
