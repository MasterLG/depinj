package com.aep.training.depinj;

import com.aep.training.depinj.controller.FieldInjectedOutputController;
import com.aep.training.depinj.controller.SetterInjectedOutputController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepinjApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(DepinjApplication.class, args);

        /*FieldInjectedOutputController fieldInjectedOutputController= (FieldInjectedOutputController)context.getBean("fieldInjectedOutputController");
        String fieldResult=fieldInjectedOutputController.doOutput();
        System.out.println(fieldResult);*/


        SetterInjectedOutputController setterInjectedOutputController=(SetterInjectedOutputController)context.getBean("setterInjectedOutputController");
        String setterResult=setterInjectedOutputController.doOutput();
        System.out.println(setterResult);
    }

}
