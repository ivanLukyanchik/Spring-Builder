package net.idt.learning;

import javax.annotation.PostConstruct;

public class AngryPoliceman implements Policeman {

    @InjectByType
    private Recommendator recommendator;

    @PostConstruct
    public void init() {
        System.out.println(recommendator.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Всех убью! Все вон!");
    }

}
