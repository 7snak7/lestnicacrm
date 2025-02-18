package ru.snack.spring.springboot.lestnica_crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.snack.spring.springboot.lestnica_crm.entity.ShopAnix;
import ru.snack.spring.springboot.lestnica_crm.service.ShopAnixService;

import java.io.BufferedReader;
import java.io.FileReader;

@Controller
public class MyController {

    @Autowired
    private ShopAnixService shopAnixService;

    public void fill()
    {
        try
        {
            BufferedReader fileCSV = new BufferedReader(new FileReader("fill_shops.csv"));
            String line;
            do{
                line = fileCSV.readLine();
                if (line != null) {
                    String[] split = line.split(";");
                    ShopAnix shopAnix = new ShopAnix(split[1],split[2],split[0],split[3],split[4],split[5]);

                    shopAnixService.save(shopAnix);
                }
            }while(line != null);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
