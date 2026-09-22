package org.example;

import config.PackageConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(PackageConfig.class);

        Parrot p1 = context.getBean("first" ,Parrot.class),
        p2 = context.getBean(Parrot.class),
                p3 = context.getBean("third" ,Parrot.class);

        System.out.println(p1 + "\n" + p2 + "\n" + p3);
    }
}