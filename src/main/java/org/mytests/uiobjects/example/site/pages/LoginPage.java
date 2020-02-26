package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import org.mytests.uiobjects.example.site.sections.LoginForm;

public class LoginPage extends WebPage {
    @Css("form") public static LoginForm loginForm;
}
