package com.example.controller;

import com.example.model.Menu;
import com.example.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MenuController {

	@Autowired
	private MenuService menuService;
	
    @GetMapping("/showMenu")
    public ResponseEntity<List<Menu>> showMenus() {
        return ResponseEntity.ok(menuService.showMenu());
    }

    @GetMapping("/search/{menuId}")
    public ResponseEntity<Menu> searchMenuById(@PathVariable int menuId) {
        return ResponseEntity.ok(menuService.searchByMenuId(menuId));
    }

}
