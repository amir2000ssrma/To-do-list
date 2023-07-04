package com.amiralirahmani.springbootframework.todolist;



import com.amiralirahmani.springbootframework.todolist.employee.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class ToDoListApplication {

    public static void main(String[] args) {

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Employee e1=new Employee();
        e1.setId(6L);
        e1.setName("Sergio Ramos");

        session.persist(e1);
        t.commit();
        factory.close();
        session.close();
        SpringApplication.run(ToDoListApplication.class, args);
    }


}
