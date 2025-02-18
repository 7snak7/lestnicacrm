package ru.snack.spring.springboot.lestnica_crm.dao;

import ru.snack.spring.springboot.lestnica_crm.entity.ShopAnix;

import java.util.List;

public interface ShopAnixDAO {

    public ShopAnix findById(int id);

    public List<ShopAnix> findAll();

    public void save(ShopAnix shopAnix);

    public void delete(ShopAnix shopAnix);
}
