package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
      return "Hello World.";
    }
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String helloName(
      @PathVariable("name") String name) {
        return "Hello " + name + ".";
    }

}