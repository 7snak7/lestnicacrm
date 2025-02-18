package ru.snack.spring.springboot.lestnica_crm.service;

import ru.snack.spring.springboot.lestnica_crm.entity.ShopAnix;

import java.util.List;

public interface ShopAnixService {

    public List<ShopAnix> findAll();

    public ShopAnix findById(int id);

    public void save(ShopAnix shopAnix);

    public void delete(ShopAnix shopAnix);
}
