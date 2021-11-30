package com.aep.training.depinj.service.impl;

import com.aep.training.depinj.service.OutputService;
import org.springframework.stereotype.Service;

@Service
public class PrinterOutputServiceImpl implements OutputService {
    @Override
    public String getOutput() {
        return "Printer is working..";
    }
}
