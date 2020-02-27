package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.mytests.uiobjects.example.site.sections.LoginForm;

@Url("/login") @Title("FMS - Авторизация")
public class LoginPage extends WebPage {

    @UI("form")
    public static LoginForm loginForm;

}
