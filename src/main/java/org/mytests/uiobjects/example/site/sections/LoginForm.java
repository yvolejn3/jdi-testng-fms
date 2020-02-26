package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.mytests.uiobjects.example.entities.User;

public class LoginForm extends Form<User> {
    @UI("input[type=text]")
    public TextField username;
    @UI("input[type=password]")
    public TextField password;
    @UI(".btn__block")
    public Button login;

    public void loginAs(User user) {
        //TODO выяснить почему не работает super.loginAs(user)
        if (user.username != null) {
            username.clear();
            username.sendKeys(user.username);
        }
        if (user.password != null) {
            password.clear();
            password.sendKeys(user.password);
        }
        login.click();
    }
}
