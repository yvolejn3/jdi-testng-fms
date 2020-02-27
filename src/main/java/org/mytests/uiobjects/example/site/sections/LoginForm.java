package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.SetTextAs;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.mytests.uiobjects.example.entities.User;

import static com.epam.jdi.light.common.SetTextTypes.CLEAR_SEND_KEYS;

public class LoginForm extends Form<User> {

    @UI("input[type=text]")
    @SetTextAs(CLEAR_SEND_KEYS)
    private TextField username;

    @UI("input[type=password]")
    @SetTextAs(CLEAR_SEND_KEYS)
    private TextField password;

    @UI(".btn__block")
    private Button login;

}
