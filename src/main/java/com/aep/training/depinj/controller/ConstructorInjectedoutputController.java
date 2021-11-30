package com.aep.training.depinj.controller;

import com.aep.training.depinj.service.OutputService;
import com.aep.training.depinj.service.impl.PrinterOutputServiceImpl;

public class ConstructorInjectedoutputController {
    private final OutputService outputService;

    public ConstructorInjectedoutputController(OutputService outputService){
        this.outputService=outputService;
    }

    public String doOutput(){
        System.out.println("ConstructorInjected is working..");
        return this.outputService.getOutput();
    }
}
