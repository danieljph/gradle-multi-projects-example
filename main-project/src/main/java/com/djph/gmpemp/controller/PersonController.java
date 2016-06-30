package com.djph.gmpemp.controller;

import com.djph.gmpedp.model.Person;

/**
 * Created by dhutapea on 6/30/16.
 */
public class PersonController
{
    public PersonController()
    {
    }

    public Person getPerson(int id, String name)
    {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(20);
        return person;
    }
}
