package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {


  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello() {
    return "Hello World.";
  }
  @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
  public String index(
    @PathVariable("name") String name) {
      return "Hello " + name + ".";
  }

}