package com.company.homeworkdriver.view.driver;

import com.company.homeworkdriver.entity.Driver;
import com.company.homeworkdriver.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "drivers/:id", layout = MainView.class)
@ViewController(id = "Driver.detail")
@ViewDescriptor(path = "driver-detail-view.xml")
@EditedEntityContainer("driverDc")
public class DriverDetailView extends StandardDetailView<Driver> {
}