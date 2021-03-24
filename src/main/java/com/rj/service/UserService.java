package com.rj.service;

import com.rj.dto.UserDTO;
import com.rj.entity.User;
import com.rj.exception.MyException;
import com.rj.res.Result;

public interface UserService {

    /**
     * 注册
     * @param userDTO
     * @return
     */
    Boolean regrsiter(UserDTO userDTO) throws MyException;

    User login(UserDTO userDTO);

}
