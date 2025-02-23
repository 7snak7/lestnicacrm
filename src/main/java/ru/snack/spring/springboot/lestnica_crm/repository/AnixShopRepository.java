package ru.snack.spring.springboot.lestnica_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import ru.snack.spring.springboot.lestnica_crm.entity.AnixShop;

@CrossOrigin
public interface AnixShopRepository extends JpaRepository<AnixShop, Integer> {
}
