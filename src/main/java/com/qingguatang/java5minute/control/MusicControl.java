package com.qingguatang.java5minute.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MusicControl {

    private static final Map<String,String> musics=new HashMap<>();

    @RequestMapping(value = "/song/music")
    @ResponseBody
    public String getMusicSrc(String songId) {
        return musics.get(songId);


    }
    @PostConstruct
    public void init(){
            musics.put("35847388","https://m801.music.126.net/20190611112600/808581cc6c66d8d06f7840382042726a/jdyyaac/070c/0709/0058/0fb288e90a0c36e714977232f4a290e8.m4a");
    }
}

