package com.taotao.portal.controller;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Eric on 2/13/17.
 */
@Controller
public class IndexController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/index")
    public String showIndex(Model model) {
        String adJson = contentService.getContentList();
        model.addAttribute("ad1", adJson);
        return "index";
    }

    // 该处理器居然可以和http://localhost:8082/httpclient/post.action相匹配
    @RequestMapping(value = "/httpclient/post", method = RequestMethod.POST)
    @ResponseBody
    public TaotaoResult testPost() {
        return TaotaoResult.ok();
    }

    // 该处理器居然可以和http://localhost:8082/httpclient/post1.action相匹配
    // produces="xxxxx"可以让return result返回的字符串不再出现乱码
    @RequestMapping(value = "/httpclient/post1", method = RequestMethod.POST,
            produces = MediaType.TEXT_PLAIN_VALUE + ";charset=utf-8")
    @ResponseBody
    public String testPost1(@RequestParam(defaultValue = "ABC") String username,
                            @RequestParam(defaultValue = "EFG") String password) {
        String result = "username:" + username + ",password:" + password;
        // 服务端打印result并不是乱码
        System.out.println(result);
        // 浏览器获取的json却会导致中文输出乱码
        return result;
    }
}
