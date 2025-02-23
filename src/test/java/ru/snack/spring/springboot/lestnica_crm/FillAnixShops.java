package ru.snack.spring.springboot.lestnica_crm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.snack.spring.springboot.lestnica_crm.entity.AnixShop;

import java.io.*;

public class FillAnixShops {

    public static void main(String[] args) throws IOException {
        BufferedReader fileCSV = new BufferedReader(new FileReader("fill_shops.csv"));
        String line;

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(AnixShop.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            while ((line = fileCSV.readLine()) != null) {
                String[] data = line.split(";");
                System.out.println(data[1]+' '+data[2]+' '+data[0]+' '+data[3]+' '+data[4]+' '+data[5]);
//                AnixShop anixShop = new AnixShop(data[1],data[2],data[0],data[3],data[4],data[5]);
//                session.save(anixShop);
            }
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
        fileCSV.close();
    }
}