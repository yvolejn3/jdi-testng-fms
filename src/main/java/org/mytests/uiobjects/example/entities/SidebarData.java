package org.mytests.uiobjects.example.entities;

/**
 * Created by Roman_Iovlev on 3/2/2018.
 */
public enum SidebarData {
    Dashboard("Панель управления"),

    Receivables("ДЗ/ПДЗ"),

    ResourcePlanning("Планирование ресурсов"),
    Calendar("Календарь"),

    AffordableFleet("Доступный флот"),

    OrderProcessing("Обработка заявок"),

    AgentReport("Отчеты агентов"),

    ClientReport("Отчёты клиента"),

    Orders("Заявки"),

    VehicleChart("График ТС"),

    Directories("Справочники"),
    Drivers("Водители"),
    Vehicle("ТС"),

    Monitoring("Мониторинг"),
    Chart("График"),
    Map("Карта"),
    Railway("ЖД"),

    Routing("Маршрутизация"),

    Statistic("Статистика"),
    Report("Отчеты");

    public String value;

    SidebarData(String value) {
        this.value = value;
    }
}
