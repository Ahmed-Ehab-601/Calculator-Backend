package com.ahmedehab.Calculator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@Service
@Component
@ComponentScan
public class CalculatorServices {
    public String evaluate(String expression) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        Number result =(Number) engine.eval(expression);

        if(result.doubleValue() == result.intValue()){
            return String.valueOf(result.intValue());
        }
        else{
            return String.valueOf(result.doubleValue());
        }



    }
}

