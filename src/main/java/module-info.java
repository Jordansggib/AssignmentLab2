module org.example.assignmentlab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.assignmentlab2 to javafx.fxml;
    exports org.example.assignmentlab2;
}