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
            musics.put("35847388","https://sc-sycdn.kuwo.cn/5a2ca883fa96eb9a9e5f7e661c6ab18c/5d0dd958/resource/n3/21/87/3225393129.mp3");
            musics.put("16435049","https://win-web-ra01-sycdn.kuwo.cn/ddb1c71963052323e132eb5e912e5db6/5d0dd9fc/resource/n2/128/8/90/3648166111.mp3");
    }
}

