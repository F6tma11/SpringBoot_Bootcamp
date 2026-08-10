package main.com.myApp.controller;

import main.com.myApp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String dataForm(Model model)
    {
        //businbess logic@
        model.addAttribute("userData" , new User());
        return "infoForm";
    }

    @RequestMapping("/showInfo")
    public String showUserData(@ModelAttribute("userData") User user,Model model){
        model.addAttribute("userInfo",user);
        return "showInfo";
    }

}
