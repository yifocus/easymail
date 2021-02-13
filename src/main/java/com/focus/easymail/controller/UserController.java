package com.focus.easymail.controller;

import com.focus.easymail.controller.vo.ResponseResult;
import com.focus.easymail.entity.User;
import com.focus.easymail.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-02-23 11:58:01
 */
@Api(tags = "用户登录注册相关")
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User getUserByUsername(String username) {
        return userService.queryByUserName(username);
    }

    @PostMapping(value = "login")
    @ApiOperation("用户登录")
    public ResponseResult login(String username, String password, HttpServletRequest request) {

        // 要判断输入的用户名称 是否为空
        // 判断输入的密码是否为空
        // 通过用户名称从数据库中查询， 用户是否存在
        // 在判断数据库中的密码是否和输入的密码是一样的

        // username = null , ""
//        if(username == null || username.length() == 0){
//
//        }

        ResponseResult responseResult = new ResponseResult();
        if (Strings.isEmpty(username)) {
            // 用户名称为空
            responseResult.setState(-1);
            responseResult.setMessage("用户名称不能为空");
            return responseResult;
        }

        if (Strings.isEmpty(password)) {
            // 密码为空
            responseResult.setState(-2);
            responseResult.setMessage("密码不能为空");
            return responseResult;
        }

        User user = userService.queryByUserName(username);

        if (user == null) {
            responseResult.setState(-3);
            responseResult.setMessage("用户名不存在");
            return responseResult;
        }


        String dbPassword = user.getPassword();

        //if(dbPassword.equals(md5Password) == false){
        if (!dbPassword.equals(password)) {
            responseResult.setState(-4);
            responseResult.setMessage("用户输入密码错误");
            return responseResult;
        }

        responseResult.setState(0);
        responseResult.setMessage("用户登录成功");


        request.getSession().setAttribute("user",user);

        return responseResult;
    }


    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ApiOperation("用户注册")
    public ResponseResult register(@RequestBody User user, HttpServletRequest request) {

        String username = user.getUsername();

        user.setCreatetime(new Date());
        user.setUpdatetime(new Date());
        user.setStatus(1);

        // 1 用户名不能为空
        // 2 密码不能为空
        // 3 判断用户名称是否已经注册
        // 4 保存用户信息到数据库

        ResponseResult responseResult = new ResponseResult();

        if (Strings.isEmpty(user.getUsername())) {
            // 用户名称为空
            responseResult.setState(-1);
            responseResult.setMessage("用户名称不能为空");
            return responseResult;
        }

        if (Strings.isEmpty(user.getPassword())) {
            // 密码为空
            responseResult.setState(-2);
            responseResult.setMessage("密码不能为空");
            return responseResult;
        }


        User dbUser = userService.queryByUserName(username);
        if (dbUser != null) {
            // 当前用户名称已经被注册
            // 密码为空
            responseResult.setState(-6);
            responseResult.setMessage("用户已存在");
            return responseResult;
        }

        try {

            // 对输入密码进行md5加密
            String password = user.getPassword();
            user.setPassword(password);

            userService.insert(user);

            responseResult.setState(0);
            responseResult.setMessage("注册成功");
            return responseResult;

        } catch (Exception e) {
            // 可能会出现数据库异常
            responseResult.setState(-7);
            responseResult.setMessage("数据库异常");
            return responseResult;
        }

    }

}