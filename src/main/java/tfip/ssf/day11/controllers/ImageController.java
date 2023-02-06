package tfip.ssf.day11.controllers;

import java.lang.System.Logger.Level;
import java.util.Random;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Tell Spring Boot this is the controller
@Controller
@RequestMapping(path = {"/randomimage"},produces = MediaType.TEXT_HTML_VALUE) //Give the address link a path name, it is not referring to the html file name
public class ImageController {
    //Setup a logger
    private Logger logger = Logger.getLogger(NumberController.class.getName());
    //GET /randomimage
    @GetMapping
    public String getRandomImage(Model model){
        Random rand = new Random();
        int randomNum = rand.nextInt(31);
        //Create a log format called imgIndex
        logger.log(Level.INFO,"imgIndex = %d".formatted(randomNum));
        //Bind the value to the model
        model.addAttribute("randomImage", randomNum);
        //Render the template with the model
        return "randomImage";
    }
}