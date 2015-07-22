package com.rcta.appium.ios.page;

import io.appium.java_client.MobileBy;

import static com.rcta.appium.ios.util.Helpers.element;

/**
 * Created by bree.lu on 7/22/15.
 */
public abstract class ButtonsPage {
    /** Verify the buttons page has loaded **/
    public static void loaded() {
        element(MobileBy.AccessibilityId("Buttons"));
    }
}
