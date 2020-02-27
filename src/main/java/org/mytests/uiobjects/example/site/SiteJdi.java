package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.JList;
import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.mytests.uiobjects.example.site.custom.MenuItem;
import org.mytests.uiobjects.example.site.pages.*;

//@JSite("https://jdi-testing.github.io/jdi-light/")
public class SiteJdi {

    public static DashboardPage dashboardPage;
    public static LoginPage loginPage;
    public static JDIPerformancePage performancePage;
    public static ContactFormPage contactFormPage;
    public static ContactsPage contactsPage;
    public static DatesPage datesPage;
    public static Html5Page html5Page;
    public static UsersPage usersPage;

    @UI(".navigation-avatar")
    public static UIElement userIcon;

    @UI(".navigation-avatar__info .button")
    public static JList<UIElement> userMenu;

    @UI(".sidebar-menu span")
    public static Menu leftMenu;

    @UI(".sidebar-menu li")
    public static JList<MenuItem> menu;

    @UI("n-menu__list item-icon")
    public static JList<MenuItem> sibebar;

}
