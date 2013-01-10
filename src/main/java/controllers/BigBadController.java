package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BigBadController {

    public BigBadController() {
        System.out.print("hi");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody String helloWorld() {
        return "helloWorld";
    }

    @RequestMapping(value = "/list/{number}", method = RequestMethod.GET)
    public @ResponseBody List<String> getList(@PathVariable Integer number) {
        List<String> strings = new ArrayList<String>();
        for(int i = 0 ; i < number; i++){
            strings.add(Integer.toString(i));
        }
        return strings;
    }

}
