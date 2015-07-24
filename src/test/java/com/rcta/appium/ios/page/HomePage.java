package com.rcta.appium.ios.page;
import io.appium.java_client.MobileBy;

import static com.rcta.appium.ios.util.Helpers.back;
import static com.rcta.appium.ios.util.Helpers.element;

/**
 * Created by bree.lu on 7/22/15.
 */
public abstract class HomePage {
    /** Verify the Alert page has loaded.
     *  Click the Alerts button.
     *  Verify the Alerts page has loaded. **/
    public static void alertsClick() {
        element(MobileBy.AccessibilityId("Alert Controller")).click();
        System.out.println("[INFO] load Alerts page successfully");
    }

    /** Verify the home page has loaded.
     *  Click the buttons button.
     *  Verify the buttons page has loaded. **/
    public static void buttonsClick() {
        element(MobileBy.AccessibilityId("Buttons")).click();
        System.out.println("[INFO] load home page successfully");
    }

    /** Verify the home page has loaded.
     *  Click the controls button.
     *  Verify the controls page has loaded. **/
    public static void controlsClick() {
        loaded();
        element(MobileBy.AccessibilityId("Controls")).click();
        ControlsPage.loaded();
    }

    /** Verify the home page has loaded **/
    public static void loaded() {
        element(MobileBy.AccessibilityId("UICatalog"));
        System.out.println("[INFO] load home page successfully");
    }

    public static void enterCatalogPage() {
        loaded();
        back();
        System.out.println("[INFO] enter catalogPage successfully");
    }
}
