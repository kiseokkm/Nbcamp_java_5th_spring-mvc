package com.sparta.nbcamp_java_5th_springmvc.responce;

import com.sparta.nbcamp_java_5th_springmvc.responce.Star;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {

    // [Response header]
    //   Content-Type: text/html ( 아래 출력이 html)
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // [Response header]
    //   Content-Type: application/json ( 아래 출력이 json 형태 )
    // [Response body]
    //   {"name":"Robbie","age":95}

    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson() {
        return new Star("Robbie", 95);
    }
}