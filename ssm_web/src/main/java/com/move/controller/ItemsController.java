package com.move.controller;

import com.move.pojo.Items;
import com.move.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Liushuaifeng
 * @version 2021/10/29 17:32
 */
@Controller
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("findAll")
    public String findAll(Model model){

        List<Items> list = itemsService.findAll();

        model.addAttribute("items",list);

        return "items";

    }

}
