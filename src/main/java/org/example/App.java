package org.example;

import entity.Student;
import org.hibernate.cfg.Configuration;
import sun.security.krb5.Config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student student = new Student("Artur", "Sharipov");


    }
}
