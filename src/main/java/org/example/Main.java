package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.ClassRoom;
import org.example.entity.Lecturer;
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

//        ClassRoom clazz = new ClassRoom();
//        clazz.setId(1);
//        clazz.setName("Winchester");
//        clazz.setCount(55);

//        session.save(clazz);
//        session.update(clazz);
//        session.delete(clazz);
//        session.get(ClassRoom.class,1);

        //System.out.println("ID :" + clazz.getId());
        //System.out.println("Name :" + clazz.getName());
        //System.out.println("Count :" + clazz.getCount());

        // Lecturer
        //session.save(lecturer);
        //session.update(lecturer);
        //session.delete(lecturer);
        //session.get(Lecturer.class,1);

        //System.out.println("ID :" + lecturer.getId());
        //System.out.println("Name :" + lecturer.getName());
        //System.out.println("Subject :" + lecturer.getSubject());

        Lecturer lecturer = new Lecturer();

        lecturer.setId(1);
        lecturer.setName("Dr. Kamal Perera");
        lecturer.setSubject("Computer Science");

        //session.save(lecturer);
        //session.update(lecturer);
        //session.delete(lecturer);

        session.get(Lecturer.class,1);

        System.out.println("ID :" + lecturer.getId());
        System.out.println("Name :" + lecturer.getName());
        System.out.println("Subject :" + lecturer.getSubject());


        transaction.commit();
        session.close();
    }
}