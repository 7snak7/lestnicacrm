package ru.snack.spring.springboot.lestnica_crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.snack.spring.springboot.lestnica_crm.dao.ShopAnixDAO;
import ru.snack.spring.springboot.lestnica_crm.entity.ShopAnix;

import java.util.List;

@Service
public class ShopAnixServiceImpl implements ShopAnixService {

    @Autowired
    private ShopAnixDAO shopAnixDAO;

    @Override
    @Transactional
    public List<ShopAnix> findAll() {
        return shopAnixDAO.findAll();
    }

    @Override
    @Transactional
    public ShopAnix findById(int id) {
        return shopAnixDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(ShopAnix shopAnix) {shopAnixDAO.save(shopAnix);}

    @Override
    @Transactional
    public void delete(ShopAnix shopAnix) {
        shopAnixDAO.delete(shopAnix);
    }

}
