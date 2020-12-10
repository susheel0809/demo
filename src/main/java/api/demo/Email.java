package api.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api/email")
public class Email {

    private ArrayList<String> getListOfUser() {


        final ArrayList<String> strings = new ArrayList<>();
        strings.add("good");

        return strings;
    }
}
