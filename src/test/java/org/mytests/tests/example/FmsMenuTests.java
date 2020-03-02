package org.mytests.tests.example;

import org.mytests.tests.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mytests.tests.states.States.shouldBeLoggedIn;
import static org.mytests.uiobjects.example.entities.LeftMenuData.*;
import static org.mytests.uiobjects.example.entities.SidebarData.*;
import static org.mytests.uiobjects.example.entities.UserMenuData.*;
import static org.mytests.uiobjects.example.site.SiteJdi.*;
import static org.testng.Assert.assertEquals;

public class FmsMenuTests extends TestsInit {

    @BeforeMethod
    public void openPerformancePage() {
        shouldBeLoggedIn();
        if (!logoTitle.isDisplayed()) {
            if (!userMenu.isDisplayed())
                userIcon.click();
            userMenu.select(SIDEBAR);
        }
    }

    @Test
    public void monitoringMenuTest() {
        sidebar.select(Monitoring, Chart);
        //chartPage.checkOpened();
        sidebar.select(Monitoring, Map);
        //mapPage.checkOpened();
        sidebar.select(Monitoring, Railway);
        //railwayPage.checkOpened();
    }

    @Test
    public void dashboardMenuTest() {
        sidebar.select(Dashboard);
        dashboardPage.checkOpened();
    }

    //@Test
    public void customMenuTest() {
        menu.select(ContactForm);
        assertEquals(menu.selected(), ContactForm.value);
        menu.select(Service, Dates);
        menu.is().selected(Dates.value);
        datesPage.checkOpened();
        leftMenu.select(ElementsPacks, HTML5);
        html5Page.checkOpened();
    }
}
