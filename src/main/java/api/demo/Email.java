package api.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

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
    private Map<Object, Object> getListOfUsers() {

        final LinkedHashMap<Object, Object> objectObjectLinkedHashMap = new LinkedHashMap<>();

        objectObjectLinkedHashMap.put("name", "Susheel kumar");
        objectObjectLinkedHashMap.put("kam", "java developer");
        return objectObjectLinkedHashMap;
    }


}
