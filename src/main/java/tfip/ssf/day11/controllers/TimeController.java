package tfip.ssf.day11.controllers;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Tell Spring Boot this is the controller
@Controller
@RequestMapping(path = {"/time","/time.html"}) //Give the address link a path name, it is not referring to the html file name
public class TimeController {
    //GET /time
    @GetMapping
    public String getTime(Model model){
        Date date = new Date();
        String currentTime = date.toString();

        System.out.printf("The current time is %s\n",currentTime);

        //Add the time to the model
        model.addAttribute("time", currentTime);
        //Return the view
        return "time";
    }
}