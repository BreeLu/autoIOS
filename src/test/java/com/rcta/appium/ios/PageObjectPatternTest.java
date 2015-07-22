package com.rcta.appium.ios;

import com.rcta.appium.ios.util.AppiumTest;

import static com.rcta.appium.ios.util.Helpers.back;

/**
 * Created by bree.lu on 7/22/15.
 */
public class PageObjectPatternTest extends AppiumTest {

    @org.junit.Test
    public void pageObject() throws Exception {
        home.buttonsClick();
        back();

        home.controlsClick();
        back();
    }
}