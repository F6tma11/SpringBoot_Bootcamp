package main.com.myApp.controller;

import main.com.myApp.modle.BirthDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.time.LocalDate;

@Controller
public class HomeController
{

    @Autowired
    private BirthDate date;

    @RequestMapping("/")
    public String showHomePage()
    {
        //businbess logic@
        return "calcPage";
    }

    @RequestMapping("/yourAge")
    public String calcYear(HttpServletRequest request, Model model){
        int month=Integer.parseInt(request.getParameter("month"));
        int day=Integer.parseInt(request.getParameter("day"));
        int year=Integer.parseInt(request.getParameter("year"));
        date.setDay(day);
        date.setMonth(month);
        date.setYear(year);
        model.addAttribute("age",calculateAge(date));
        model.addAttribute("day",day);
        model.addAttribute("month",month);
        model.addAttribute("year",year);
        return "age";
    }

    public int calculateAge(BirthDate date){
        LocalDate localDate=LocalDate.of(date.getYear(),date.getMonth(),date.getDay());
        LocalDate now=LocalDate.now();
        return now.getYear()-localDate.getYear();
    }
}
