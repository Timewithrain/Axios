package com.example.demo.Controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/axios")
@CrossOrigin
public class AxiosController {

    @GetMapping("/list")
    public List<User> axios(){
        List<User> list = new ArrayList<>();
        list.add(new User(1l,"大娃",19));
        list.add(new User(2l,"二娃",19));
        list.add(new User(3l,"三娃",19));
        list.add(new User(5l,"四娃",19));
        list.add(new User(4l,"五娃",19));
        return list;
    }


}
