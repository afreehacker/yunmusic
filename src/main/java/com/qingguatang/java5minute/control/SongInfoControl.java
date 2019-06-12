package com.qingguatang.java5minute.control;

import com.qingguatang.java5minute.model.SongInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SongInfoControl {

    private static Map<String, SongInfo> songInfoMap = new HashMap<>();

    @RequestMapping(value = "/songinfo")
    public String index(String songId, ModelMap modelMap) {

        if (songId == null) {
            songId = "35847388";
        }
        SongInfo songInfo = songInfoMap.get(songId);
        modelMap.addAttribute("song", songInfo);
        return "index";
    }

    @RequestMapping(value = "/songinfo/get")
    @ResponseBody
    public SongInfo get(String songId) {
        SongInfo songInfo = songInfoMap.get(songId);
        return songInfo;
    }

    @PostConstruct
    public void init() {

        //滴答 这首歌
        SongInfo songInfo = new SongInfo();
        songInfo.setId("35847388");
        songInfo.setName("滴答");
        songInfo.setSinger("陈思诚");
        songInfo.setAlbumName("滴答");
        songInfo.setCommentCount(10);
        songInfo.setAlbumImg("http://p1.music.126.net/HhckGWKZMjkC9xH3HteMjA==/119846767440813.jpg?param=130y130");
        songInfo.setLyrics("嘀嗒嘀嗒嘀嗒嘀嗒<br/>时针它不停在转动<br/>嘀嗒嘀嗒嘀嗒嘀嗒<br/>小雨她拍打着水花<br/>嘀嗒嘀嗒嘀嗒嘀嗒<br/>是不是还会牵挂他<br>嘀嗒嘀嗒嘀嗒嘀嗒<br/>有几滴眼泪已落下<br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>寂寞的夜和谁说话 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>伤心的泪儿谁来擦 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>整理好心情再出发 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>还会有人把你牵挂 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>寂寞的夜和谁说话 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>伤心的泪儿谁来擦 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>整理好心情再出发 <br/>嘀嗒嘀嗒嘀嗒嘀嗒 <br/>还会有人把你牵挂");
        songInfoMap.put("35847388",songInfo);

        //故乡 这首歌
        songInfo=new SongInfo();
        songInfo.setId("16435049");
        songInfo.setName("故乡");
        songInfo.setSinger("许巍");
        songInfo.setAlbumName("珍藏许巍作品全集");
        songInfo.setCommentCount(11);
        songInfo.setAlbumImg("http://p1.music.126.net/OvgbsC9XCCtKXtp7GB_Xyg==/91259465106346.jpg?param=130y130");
        songInfo.setLyrics("天边夕阳再次映上我的脸庞<br/> 再次映着我那不安的心<br/> 这是什么地方依然是如此的荒凉<br/> 那无尽的旅程如此漫长<br/> 我是永远向着远方独行的浪子<br/> 你是茫茫人海之中我的女人<br/> 在异乡的路上每一个寒冷的夜晚<br/> 这思念它如刀让我伤痛<br/> 总是在梦里我看到你无助的双眼<br/> 我的心又一次被唤醒<br/> 我站在这里想起和你曾经离别情景<br/> 你站在人群中间那么孤单<br/> 那是你破碎的心<br/> 我的心却那么狂野<br/> 你在我的心里永远是故乡<br/> 你总为我独自守候沉默等待<br/> 在异乡的路上每一个寒冷的夜晚<br/> 这思念它如刀让我伤痛<br/> 总是在梦里我看到你无助的双眼<br/> 我的心又一次被唤醒<br/> 我站在这里想起和你曾经离别情景<br/> 你站在人群中间那么孤单<br/> 那是你破碎的心<br/> 我的心却那么狂野<br/> 总是在梦里我看到你无助的双眼<br/> 我的心又一次被唤醒<br/> 总是在梦里看到自己走在归乡路上<br/> 你站在夕阳下面容颜娇艳<br/> 那是你衣裙漫飞<br/> 那是你温柔如水");
        songInfoMap.put("16435049",songInfo);
        //modelMap.addAttribute("song", songInfo);
        //return "index";
    }
}

