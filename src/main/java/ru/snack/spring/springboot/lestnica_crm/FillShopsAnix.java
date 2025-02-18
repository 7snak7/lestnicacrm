package ru.snack.spring.springboot.lestnica_crm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.snack.spring.springboot.lestnica_crm.controller.MyController;

@Component
public class FillShopsAnix {

    @Autowired
    static MyController myController = new MyController();

    public static void main(String[] args) {
        myController.fill();
    }
}
