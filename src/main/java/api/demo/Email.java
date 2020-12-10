package api.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RequestMapping(value = "/api/email", produces = "application/hal+json")
@RestController
public class Email {

    @RequestMapping(method = RequestMethod.GET)
    private ArrayList<String> getListOfUser() {
        final ArrayList<String> strings = new ArrayList<>();
        strings.add("good");
        return strings;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    private ArrayList<String> getListOfUsers() {
        final ArrayList<String> strings = new ArrayList<>();
        strings.add("good");
        return strings;
    }


}
