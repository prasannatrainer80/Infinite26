package com.example.service;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Menu;
import com.example.repo.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> showMenu() {
        return menuRepository.findAll();
    }

    public Menu searchByMenuId(int id) {
        Menu menuFound = menuRepository.findById(id).get();
        if (menuFound == null) {
            throw new ResourceNotFoundException("Menu Not Exists with id " +id);
        }
        return menuFound;
    }

}
