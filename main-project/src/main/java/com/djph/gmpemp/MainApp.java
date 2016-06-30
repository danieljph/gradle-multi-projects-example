package com.djph.gmpemp;

import com.djph.gmpedp.model.Person;
import com.djph.gmpemp.controller.PersonController;

/**
 * Created by dhutapea on 6/30/16.
 */
public class MainApp
{
    public static void main(String[] args)
    {
        PersonController personController = new PersonController();
        Person person = personController.getPerson(1, "Daniel");
        System.out.println(person);
    }
}
