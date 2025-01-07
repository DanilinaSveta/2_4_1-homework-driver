package com.company.homeworkdriver.view.driver;


import com.company.homeworkdriver.entity.Document;
import com.company.homeworkdriver.entity.Driver;
import com.company.homeworkdriver.view.main.MainView;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import io.jmix.core.FileRef;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.component.upload.FileUploadField;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayInputStream;

@Route(value = "drivers/:id", layout = MainView.class)
@ViewController(id = "Driver.detail")
@ViewDescriptor(path = "driver-detail-view.xml")
@EditedEntityContainer("driverDc")
public class DriverDetailView extends StandardDetailView<Driver> {

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Downloader downloader;
    @ViewComponent
    private FileUploadField photoField;
    @ViewComponent
    private JmixImage<Object> image;

    @Supply(to = "documentsDataGrid.file", subject = "renderer")
    private Renderer<Document> documentsDataGridFileRenderer() {
        return new ComponentRenderer<>(document ->{
            FileRef docFile = document.getFile();

            if (docFile != null){
                JmixButton btn = uiComponents.create(JmixButton.class);
                btn.setText(docFile.getFileName());
                btn.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
                btn.addClickListener(click -> downloader.download(docFile));

                return btn;
            }
            return null;
        });
    }

}