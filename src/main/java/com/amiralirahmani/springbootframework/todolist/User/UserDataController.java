package com.amiralirahmani.springbootframework.todolist.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserDataController {
    @RequestMapping(value = "/get-user-info" , method= RequestMethod.GET)
    public String GetUserData(){

         return "get-user-data";
    }

    @RequestMapping(value="/display" , method=RequestMethod.POST)
    public String DisplayUserData(ModelMap model , @ModelAttribute User user){
        model.addAttribute("user",user);
        return "display-user-data";
    }

}
