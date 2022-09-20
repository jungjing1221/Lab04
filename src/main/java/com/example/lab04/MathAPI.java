package com.example.lab04;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathAPI {
    @RequestMapping(value = "/plus/{num1}/{num2}", method = RequestMethod.GET)
    public String myPlus(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 + num2);
    }
    @RequestMapping(value = "/minus/{num1}/{num2}", method = RequestMethod.GET)
    public String myMinus(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 - num2);
    }
    @RequestMapping(value = "/divide/{num1}/{num2}", method = RequestMethod.GET)
    public String myDivide(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 / num2);
    }
    @RequestMapping(value = "/multi/{num1}/{num2}", method = RequestMethod.GET)
    public String myMulti(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 * num2);
    }
    @RequestMapping(value = "/mod/{num1}/{num2}", method = RequestMethod.GET)
    public String myMod(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 % num2);
    }
    @RequestMapping(value = "/max", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String myMax(@RequestBody MaxNum num) {
        return Double.toString(Math.max(num.num1,num.num2));
    }

}
