package com.example.demo.Controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/axios")
@CrossOrigin
public class AxiosController {

    @GetMapping("/get")
    public List<User> get(String username,Integer age) throws InterruptedException {
        System.out.println("name:"+username);
        System.out.println("age:"+age);
        Thread.sleep(3000);
        List<User> list = new ArrayList<>();
        list.add(new User(1l,"大娃",19));
        list.add(new User(2l,"二娃",19));
        list.add(new User(3l,"三娃",19));
        list.add(new User(5l,"四娃",19));
        list.add(new User(4l,"五娃",19));
//        throw new RuntimeException("出错了");
        return list;
    }

    @PostMapping("/postStr")
    public Map<String,String> postStr(String username,Integer age){
        System.out.println(username);
        System.out.println(age);
        Map<String,String> map = new HashMap<>();
        map.put("success","true");
        map.put("message","请求成功！");
        return map;
    }

    @PostMapping("/post")
    public Map<String,String> post(@RequestBody User user){
        System.out.println("user = " + user);
        Map<String,String> map = new HashMap<>();
        map.put("success","true");
        map.put("message","请求成功！");
        return map;
    }

}
