package com.mobile.back.controller;

import com.mobile.back.model.Mobile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MobileController {
    @GetMapping("mobiles")
    public List getMobiles(){
        List list = new ArrayList();
        list.add(new Mobile("mts", 50.5, 1));
        list.add(new Mobile("velcom", 150.5, 2));
        list.add(new Mobile("life:)", 650.5, 8));
        list.add(new Mobile("a1", 50.5, 4));
        list.add(new Mobile("bel", 590.5, 9));
        list.add(new Mobile("mobil", 50.5, 1));
        list.add(new Mobile("kgb", 991.9, 10));
        return list;
    }
}
