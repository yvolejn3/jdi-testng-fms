package org.mytests.tests.states;

import com.epam.jdi.light.elements.composite.WebPage;
import io.qameta.allure.Step;

import static org.mytests.uiobjects.example.entities.Defaults.DEFAULT_USER;
import static org.mytests.uiobjects.example.site.SiteJdi.*;
import static org.mytests.uiobjects.example.site.pages.LoginPage.loginForm;


/**
 * Created by Roman_Iovlev on 3/1/2018.
 */
public class States {
    private static void onSite() {
        if (!WebPage.getUrl().contains("https://dev.lorus-scm.com/#/"))
            dashboardPage.open();
    }
    @Step
    public static void shouldBeLoggedIn() {
        onSite();
        if (WebPage.getUrl().contains("login"))
            login();
    }
    @Step
    public static void login() {
        loginForm.loginAs(DEFAULT_USER);
    }
    @Step
    public static void shouldBeLoggedOut() {
        onSite();
        if (userName.isDisplayed())
            logout();
        if (loginForm.isDisplayed())
            userIcon.click();
    }
    @Step
    public static void logout() {
        if (!logout.isDisplayed())
            userIcon.click();
        logout.click();
    }
}
