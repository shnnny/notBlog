package com.shnnny.notBlog.controller.admin;

import com.shnnny.notBlog.bean.Result;
import com.shnnny.notBlog.bean.User;
import com.shnnny.notBlog.controller.BaseController;
import com.shnnny.notBlog.utils.ResultUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangzhh
 * @date 2018/10/10 15:40
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        long l = System.currentTimeMillis();
        return "hello spring security";
    }

   @GetMapping("/{id}")
    public Result getUserById(@PathVariable("id")Integer id){

        User user = new User();
        user.setScreenName("123");
        user.setUid(id);


        return ResultUtils.success(user);
    }
}