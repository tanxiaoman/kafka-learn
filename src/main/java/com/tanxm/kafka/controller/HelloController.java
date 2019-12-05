package com.tanxm.kafka.controller;

import com.tanxm.kafka.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        return "id:"+id;
        //return girlProperties.getCupSize();
    }

    @RequestMapping(value = "/speak",method = RequestMethod.GET)
    public String speak(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        return "id:"+myId;
    }
}
