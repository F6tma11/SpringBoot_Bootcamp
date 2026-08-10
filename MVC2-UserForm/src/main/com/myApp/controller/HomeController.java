package main.com.myApp.controller;

import main.com.myApp.modle.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage(Model model)
    {
        //businbess logic@
        model.addAttribute("userData",new UserData());
        return "home";
    }

    @RequestMapping("/showInfo")
    public String showUserData(@ModelAttribute("userData") UserData user, Model model){
        model.addAttribute("userInfo",user);
        return "show";
    }
}
