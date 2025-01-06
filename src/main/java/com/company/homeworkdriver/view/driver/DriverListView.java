package com.company.homeworkdriver.view.driver;

import com.company.homeworkdriver.entity.Driver;
import com.company.homeworkdriver.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "drivers", layout = MainView.class)
@ViewController(id = "Driver.list")
@ViewDescriptor(path = "driver-list-view.xml")
@LookupComponent("driversDataGrid")
@DialogMode(width = "64em")
public class DriverListView extends StandardListView<Driver> {
}