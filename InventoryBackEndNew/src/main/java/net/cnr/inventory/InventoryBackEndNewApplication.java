package net.cnr.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.cnr.inventory.entities.Item;
import net.cnr.inventory.repository.ItemRepository;

@SpringBootApplication
public class InventoryBackEndNewApplication implements CommandLineRunner{

	@Autowired
	private ItemRepository itemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(InventoryBackEndNewApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		itemRepository.save(new Item("test1",1111.00,111.00,"test1","test1"));
		itemRepository.save(new Item("test2",2222.00,222.00,"test2","test2"));
		itemRepository.save(new Item("test3",3333.00,333.00,"test3","test3"));
	}
}
