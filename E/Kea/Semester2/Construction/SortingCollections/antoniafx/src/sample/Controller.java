package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {

    @FXML
    private TextField nameInput;
    @FXML
    private TextField emailInput;
    @FXML
    private PasswordField passField;

    public void saveAction(ActionEvent actionEvent) {
        System.out.println("Hello ...");
        String name = nameInput.getText();
        String email = emailInput.getText();
        String pass = passField.getText();

        System.out.println("Name ->" + name + "<-");
        System.out.println("Email ->" + email + "<-");
        System.out.println("Pass ->" + pass + "<-");

        try {
            String sql = "INSERT INTO students VALUES " +
                    "(NULL, '" + name + "', '" + email + "', MD5('" + pass + "'));";
            System.out.println(sql);

            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
