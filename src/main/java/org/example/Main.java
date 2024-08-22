package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.ClassRoom;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
//        Student student = new Student();
//        FullName fullName = new FullName("Kamal","Perera");
//        student.setId(1);
//        student.setName(fullName);
//        student.setAddress("Kandy");
        Transaction transaction = session.beginTransaction();

//        session.save(student);
//        session.update(student);
//        session.delete(student);
//        session.get(Student.class,1);
//        System.out.println("ID :" + student.getId());
//        System.out.println("Name :" + student.getName());
//        System.out.println("Address :" + student.getAddress());

        ClassRoom clazz = new ClassRoom();

        clazz.setId(1);
        clazz.setName("Winchester");
        clazz.setCount(55);

        session.save(clazz);

        transaction.commit();
        session.close();
    }
}