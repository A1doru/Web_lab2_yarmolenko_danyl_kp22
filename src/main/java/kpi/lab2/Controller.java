package kpi.lab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping
  @RequestMapping(path = "/name")
  public String getName(){
    return "Danyl Yarmolenko KP22";
  }
}
