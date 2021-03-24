package com.rj.mapper;

import com.rj.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {


    Boolean regrsiter(String userName, String password);

    /**
     * 检查账号是否重复
     * @param userName
     * @return
     */
    Boolean check(String userName);

    User login(String userName, String md5pass);
}
