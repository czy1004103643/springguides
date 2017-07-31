package com.zs.webservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController注解相当于struts中的action
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * @RequestMapping("/greeting") 定义访问路径
     * @RequestParam(value="desc", defaultValue="World")定义访问传参，
     * 如果不定义RequestParam，那么默认是以name为键访问参数，如果不传name或者传的name是空字符串，那么name=null
     * 如果定义了RequestParam，那么这里desc的值就会赋给name,如果不传des或者传的des是空字符串，那么name
     * @param name
     * @return
     */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="desc", defaultValue="World") String name) {
        if(name==null){
            name="river";
        }
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
