import entity.Address;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.spi.SessionFactoryBuilderFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManagerFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;


public class Crud {
    public static void main(String args[])throws IOException {
//        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//
//        System.out.println(session);
        System.out.println("Welcome to Crud");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory  factory= cfg.buildSessionFactory();

        //Creating Student
        Student st=new Student();
        st.setName("rehman");
        st.setCity("south karachi");
        System.out.println(st);

        //Creating Address

        Address ad=new Address();
        ad.setStreet("street1");
        ad.setCity("Krarachi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(12.22);

        //Reading image
//        FileInputStream fis = new FileInputStream("src/main/resource/laptopbg");
//        byte[] data = new byte[fis.available()];
//        fis.read(data);
//        ad.setImage(data);



        Session session=factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(ad);
        session.save(st);
        tx.commit();

        session.close();
        System.out.println("Done");


//        System.out.println(factory);
//        System.out.println(factory.isClosed());


    }
}
