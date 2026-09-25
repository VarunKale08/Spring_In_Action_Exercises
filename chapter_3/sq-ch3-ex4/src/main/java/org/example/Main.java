package org.example;

import beans.Parrot;
import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

            var parrot = context.getBean(Parrot.class);

            var Person = context.getBean(Person.class);


        System.out.println("Person: " + Person.getPersonName() + " Parrot: " + Person.getParrot().getParrotName());
        }
    }
