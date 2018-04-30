package net.cnr.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.cnr.inventory.entities.Item;

public interface ItemRepository extends JpaRepository<Item,Long> {

}
