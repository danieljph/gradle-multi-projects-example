package com.djph.gmpemp;

import com.djph.gmpedp.model.Person;
import com.djph.gmpemp.controller.PersonController;

/**
 *
 * @author Daniel Joi Partogi Hutapea
 */
public class MainApp
{
    public static void main(String[] args)
    {
        PersonController personController = new PersonController();
        Person person = personController.getPerson(1, "Daniel");
        person.setAddress("Test address.");
        System.out.println(person);
    }
}
