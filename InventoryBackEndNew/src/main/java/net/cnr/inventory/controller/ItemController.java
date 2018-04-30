package net.cnr.inventory.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.cnr.inventory.entities.Item;
import net.cnr.inventory.repository.ItemRepository;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemRepository userRepository;
	
	@RequestMapping("/")
    public String home(){
        return "WelCome For Inventory!";
    }
	
	@GetMapping("/items")
	public List<Item> getItem(){
		return userRepository.findAll();
		
	}
	
	@GetMapping("/item/{id}")
	public Optional<Item> getItem(@PathVariable Long id){
		return userRepository.findById(id);
		
	}
	
	@DeleteMapping("/item/{id}")
	public boolean deleteItem(@PathVariable Long id){
	 userRepository.deleteById(id);
	 return true;
		
	}
	
	@PutMapping("/item")
	public Item UpdateItem(@RequestBody Item item){
		return userRepository.save(item);
		
	}
	
	@PostMapping("/item")
	public Item CreateItem(@RequestBody Item item){
		return userRepository.save(item);
		
	}

}
