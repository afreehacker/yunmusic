package com.qingguatang.java5minute.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SongControl {
    @RequestMapping(value="/song")
     public String getSong(@RequestParam(name="id",required = false) String songId){
        //判断这个songId
        if(songId==null){
            songId="1";
        }
        if(songId.equals("1")){
            return "1.html";
        }else{
            return "other.html";
        }
    }
}
