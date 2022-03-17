module com.mufanz.chat.ui {
    exports com.mufanz.chat.ui;

    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;


    opens com.mufanz.chat.ui to javafx.fxml;
    exports com.mufanz.chat.ui.view;
    opens com.mufanz.chat.ui.view to javafx.fxml;
    exports com.mufanz.chat.ui.view.login;
    opens com.mufanz.chat.ui.view.login to javafx.fxml;
}