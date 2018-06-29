package msws2018.controllers;


import msws2018.dto.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    /**
     * Add a to b and returns result. Sample URL: http://localhost:9000/plus?a=1&b=2
     */
    @GetMapping("/plus")
    @ResponseBody
    public Response plus(@RequestParam(name="a", required=true) int a, @RequestParam(name="b", required=true) int b) {
        return new Response(a+b);
    }

}
