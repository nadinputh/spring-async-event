package net.skybooking.asyncevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired private AsyncComponent asyncComponent;

    @GetMapping
    public String index() {
        asyncComponent.asyncMethodWithVoidReturnType();
        return "Hello World!!!!!!";
    }

}
