package com.qingguatang.java5minute.control;

import com.qingguatang.java5minute.model.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CommentControl {

    @RequestMapping(value = "/comments")
    public String comments(ModelMap modelMap){

        List<Comment> comments=getComment();
        modelMap.addAttribute("comments",comments);
        return "comments";
    }
    private List<Comment> getComment(){

        List<Comment> comments=new ArrayList<>();

        Comment comment=new Comment();
        comment.setIcon("https://p1.music.126.net/_C4PY4MFhtM3PzMZWWcoUw==/109951163440375634.jpg?param=50y50");
        comment.setNickName("缥缈虚无云中子");
        comment.setContent("非常好听，适合初级吉他弹唱，我现在正在学");
        comment.setCommentTime("2018年5月17日");
        comment.setLikeNum(666);
        comments.add(comment);


        comment=new Comment();
        comment.setIcon("https://p1.music.126.net/mYJEmmqdtnw9aIbfape-sg==/2533274790902499.jpg?param=50y50");
        comment.setNickName("沧海任逍遥");
        comment.setContent("曾经喜欢过的女孩推荐我看的北爱，也不知道她现在怎么样了，应该很幸福。那样我也就放心了，虽然从未拥有过，但是还是感谢你出现过我的生命中");
        comment.setCommentTime("2015年10月25日");
        comment.setLikeNum(105);
        comments.add(comment);


        return comments;
    }
}
