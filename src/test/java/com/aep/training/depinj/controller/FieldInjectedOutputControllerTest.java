package com.aep.training.depinj.controller;

import static org.junit.jupiter.api.Assertions.*;
import com.aep.training.depinj.service.impl.PrinterOutputServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldInjectedOutputControllerTest {
    public  FieldInjectedOutputController controller;

    @BeforeEach
    void setUp() {
        controller = new FieldInjectedOutputController();
        controller.outputService = new PrinterOutputServiceImpl();
    }

    @Test
    void doOutput() {
        System.out.println(controller.doOutput());
    }
}