package com.aep.training.depinj.controller;

import com.aep.training.depinj.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldInjectedOutputController {
    public OutputService outputService;

    @Autowired
    public String doOutput(){
        System.out.println("Injection working...");
        return outputService.getOutput();
    }

}
