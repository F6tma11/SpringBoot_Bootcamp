package main.com.myApp.controller;


import main.com.myApp.database.DatabaseConnection;
import main.com.myApp.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class HomeController
{

    DatabaseConnection connection;

    public HomeController(DatabaseConnection connection) {
        this.connection = connection;
    }

    @RequestMapping("/")
    public String showHomePage(Model model)
    {
        //businbess logic@

        model.addAttribute("userData",new UserData());
        return "home";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("userData") UserData userData, BindingResult bindingResult,Model model) throws SQLException {
        if(bindingResult.hasErrors()){
            return "home";
        }
        String query = "INSERT INTO user (username, email, password) VALUES (?, ?, ?)";

        Connection conn = connection.connectDB();

        PreparedStatement preparedStatement = conn.prepareStatement(query);

        preparedStatement.setString(1, userData.getUsername());
        preparedStatement.setString(2, userData.getEmail());
        preparedStatement.setString(3, userData.getPassword());

        preparedStatement.executeUpdate();
        return "saved";
    }
}
