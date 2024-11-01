package com.ahmedehab.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(value = "calculator/api")
public class CalculatorControler {
    CalculatorServices calculatorServices;

    CalculatorControler(CalculatorServices calculatorServices){
        this.calculatorServices = calculatorServices;
    }
    @GetMapping("/calculate")
    String Calculate(@RequestParam String expression){

        try {
            return calculatorServices.evaluate(expression);
        }
        catch (Exception e){
            return "SE";
        }


    }
}
