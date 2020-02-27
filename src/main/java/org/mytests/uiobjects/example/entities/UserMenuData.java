package org.mytests.uiobjects.example.entities;

public enum UserMenuData {

    SIDEBAR("БОКОВОЕ МЕНЮ"),
    ESCALATE("ЭСКАЛАЦИЯ"),
    THEME("ТЕМА ПАНЕЛИ"),
    LOGOUT("ВЫХОД");

    public String value;

    UserMenuData(String value) {
        this.value = value;
    }

}
