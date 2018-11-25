package com.yang.netty;

import static org.junit.Assert.assertTrue;

import com.google.protobuf.ByteString;
import com.yang.netty.entity.PersonModel;
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
    public void shouldAnswerWithTrue() throws Exception
    {
        assertTrue( true );
        PersonModel.Person.Builder builder = PersonModel.Person.newBuilder();
        builder.setId(1);
        builder.setName("yang");
        builder.setEmail("yangzijing08@gmail.com");

        PersonModel.Person person = builder.build();
        System.out.println("Before:" + person);

        ByteString data = person.toByteString();

        PersonModel.Person fromBytes = PersonModel.Person.parseFrom(data);
        System.out.println("id :" + fromBytes.getId());
        System.out.println("name ：" + fromBytes.getName());
        System.out.println("email: " + fromBytes.getEmail());

        System.out.println("after: " + data.toString("UTF-8"));


    }
}
