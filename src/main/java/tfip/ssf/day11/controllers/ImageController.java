package tfip.ssf.day11.controllers;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Tell Spring Boot this is the controller
@Controller
@RequestMapping(path = {"/randomimage"}) //Give the address link a path name, it is not referring to the html file name
public class ImageController {
    //GET /randomimage
    @GetMapping
    public String getRandomImage(Model model){
        Random rand = new Random();
        int randomNum = rand.nextInt(31);
        //String randomNumStr = "number"+Integer.toString(randomNum);

        System.out.printf("The random num is %s\n",randomNum);

        //Add the time to the model
        model.addAttribute("randomImage", randomNum);
        //Return the view as (randomImage.html)
        return "randomImage";
    }
}