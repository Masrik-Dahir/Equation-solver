module com.masrik.demointerface {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens com.masrik.equation_solver to javafx.fxml;
    exports com.masrik.equation_solver;
}