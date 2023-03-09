module com.projekt.projekt_l3_g3_ {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.orm.core;

    opens com.projekt.projekt_l3_g3_.entities to org.hibernate.orm.core;
    exports com.projekt.projekt_l3_g3_.entities;
    opens com.projekt.projekt_l3_g3_ to javafx.fxml;
    exports com.projekt.projekt_l3_g3_;
}