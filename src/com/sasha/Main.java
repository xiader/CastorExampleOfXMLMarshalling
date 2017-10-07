package com.sasha;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.apache.commons.lang3.StringUtils;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws MarshalException, ValidationException {
        Person petya = new Person(
                "Petya",
                48,
                86,
                186,
                new Wallet(
                        986786875L,
                        3684L,
                        43L));

        FileWriter fw = null;
        FileReader fr = null;
        try {
            System.out.println(petya);

            fw = new FileWriter("petya.xml");
            Marshaller.marshal(petya, fw);

               }catch (Exception e){
            e.printStackTrace();
        }
}}
