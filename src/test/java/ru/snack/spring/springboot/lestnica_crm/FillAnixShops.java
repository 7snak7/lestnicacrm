package ru.snack.spring.springboot.lestnica_crm;

import org.springframework.beans.factory.annotation.Autowired;
import ru.snack.spring.springboot.lestnica_crm.entity.AnixShop;
import ru.snack.spring.springboot.lestnica_crm.repository.AnixShopRepository;

import java.io.*;

public class FillAnixShops {

    public static void main(String[] args) throws IOException {
        BufferedReader fileCSV = new BufferedReader(new FileReader("fill_shops.csv"));
        String line;

        while ((line = fileCSV.readLine()) != null) {
//            System.out.println(line);
//            System.out.println('1');
            String[] data = line.split(";");
//            System.out.println(data[1]+' '+data[2]+' '+data[0]+' '+data[3]+' '+data[4]+' '+data[5]);
            AnixShop anixShop = new AnixShop(0,data[1],data[2],data[0],data[3],data[4],data[5]);
//            AnixShopRepository.save(anixShop);
            System.out.println(anixShop);
        }
        fileCSV.close();
    }
}