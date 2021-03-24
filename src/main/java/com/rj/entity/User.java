package com.rj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //set get方法（要lombok）
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String nickName;
    private Integer sex;
    private String password;
    private String userName;
}
