package africa.semicolon.aMiniApiConsumer.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/demo-home-controller")
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;
    public static String url= "http://api.themoviedb.org/3/movie/550?api_key=5fe726b69eafac315d8d6f40e1970e7a";

    @GetMapping()
    public String welcomeUsers(@RequestBody String name){
        return restTemplate.getForObject(url, String.class);
    }
}
