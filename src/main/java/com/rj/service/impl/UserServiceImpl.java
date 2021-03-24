package com.rj.service.impl;

import com.rj.dto.UserDTO;
import com.rj.entity.User;
import com.rj.exception.MyException;
import com.rj.mapper.UserMapper;
import com.rj.res.Result;
import com.rj.service.UserService;
import com.rj.util.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Boolean regrsiter(UserDTO userDTO) throws MyException {
        String userName = userDTO.getUserName();
        Boolean flag =  userMapper.check(userName);
        if (!Objects.isNull(flag)){
            throw new MyException("名字重复");
        }
        String password = userDTO.getPassword();
        String mdPass =  md5pass(password);
        Boolean bxx =  userMapper.regrsiter(userName,mdPass);
        return bxx;
    }

    @Override
    public User login(UserDTO userDTO) {
        String password = userDTO.getPassword();
        String userName = userDTO.getUserName();
        String md5pass = md5pass(password);
        User user = userMapper.login(userName,md5pass);
        return user;
    }

    private String md5pass(String password) {
        Md5 md5 = new Md5();
        String newString = password;
        try {
            newString = md5.EncoderByMd5(password);
            return newString;
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return newString;
    }


}
