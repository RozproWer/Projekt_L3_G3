module com.projekt.projekt_l3_g3_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.projekt.projekt_l3_g3_ to javafx.fxml;
    exports com.projekt.projekt_l3_g3_;
}