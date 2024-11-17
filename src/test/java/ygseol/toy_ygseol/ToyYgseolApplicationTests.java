package ygseol.toy_ygseol;


import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.text.View;

@Component
public class ToyYgseolApplicationTests {


    @GetMapping(value = "/sex")
    public String home(Request req, Response res,View root) {

        System.out.println("씨발");

        return "sex";
    }


}