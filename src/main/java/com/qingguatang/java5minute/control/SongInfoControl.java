package com.qingguatang.java5minute.control;

import com.qingguatang.java5minute.model.SongInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongInfoControl {
    @RequestMapping(value="/songinfo")
    public String index(ModelMap modelMap){

        SongInfo songInfo=new SongInfo();
        songInfo.setName("滴答");
        songInfo.setSinger("陈思诚");
        songInfo.setAlbumName("滴答");
        songInfo.setCommentCount(10);
        songInfo.setAlbumIng("http://p1.music.126.net/HhckGWKZMjkC9xH3HteMjA==/119846767440813.jpg?param=130y130");
        songInfo.setLyrics("嘀嗒嘀嗒嘀嗒嘀嗒<br/>时针它不停在转动<br/>嘀嗒嘀嗒嘀嗒嘀嗒<br/>小雨她拍打着水花<br/>嘀嗒嘀嗒嘀嗒嘀嗒<br/>是不是还会牵挂他<br>嘀嗒嘀嗒嘀嗒嘀嗒<br/>有几滴眼泪已落下<br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>寂寞的夜和谁说话 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>伤心的泪儿谁来擦 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>整理好心情再出发 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>还会有人把你牵挂 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>寂寞的夜和谁说话 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>伤心的泪儿谁来擦 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>整理好心情再出发 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>还会有人把你牵挂");

        modelMap.addAttribute("song",songInfo);

        return "index";
    }
}
