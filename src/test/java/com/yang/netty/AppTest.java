package com.yang.netty;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        PersonModel.Person.Builder builder = PersonModel.Person.newBuilder();
        builder.setId(1);
        builder.setName("yang");
        builder.setName("yangzijing08@gmail.com");

        PersonModel.Person person = builder.build();
        System.out.println("Before:" + person);

        System.out.println("Bytes: ");
        for (byte b : person.toByteArray()) {
            System.out.println(b);
        }

    }
}
