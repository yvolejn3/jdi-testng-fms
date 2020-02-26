package org.mytests.tests.example;

import org.mytests.tests.TestsInit;
import org.mytests.tests.states.States;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.entities.LeftMenuData.*;
import static org.mytests.uiobjects.example.site.SiteJdi.*;
import static org.testng.Assert.assertEquals;

public class FmsMenuTests implements TestsInit {

    @Test
    public void menuTest() {
        States.shouldBeLoggedIn();
        dashboardPage.checkOpened();
        dashboardPage.shouldBeOpened();
        //leftMenu.select(Service, Dates);
        //datesPage.checkOpened();
        //leftMenu.select(ElementsPacks, HTML5);
        //html5Page.checkOpened();
    }
    @Test
    public void customMenuTest() {
        States.shouldBeLoggedIn();
        dashboardPage.shouldBeOpened();
        menu.select(ContactForm);
        assertEquals(menu.selected(), ContactForm.value);
        menu.select(Service, Dates);
        menu.is().selected(Dates.value);
        datesPage.checkOpened();
        leftMenu.select(ElementsPacks, HTML5);
        html5Page.checkOpened();
    }
}
