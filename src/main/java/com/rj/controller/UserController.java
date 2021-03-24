package com.rj.controller;

import com.rj.dto.UserDTO;
import com.rj.entity.User;
import com.rj.exception.MyException;
import com.rj.res.Result;
import com.rj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController  //保证返回数据是json格式w
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@RequestBody UserDTO userDTO) throws MyException {
        Boolean result = userService.regrsiter(userDTO);
        if (result){
            return new Result(result,200,"注册成功",result);
        }
        return new Result(result,500,"注册失败",result);
    }

    @PostMapping("/login")
    public Result login(@RequestBody UserDTO userDTO)  {
        User user = userService.login(userDTO);
        if (Objects.isNull(user)){
            return new Result(false,500,"查询失败",user);
        }
        return new Result(true,200,"查询成功",user);
    }
}
