package com.yonyou.iuap.train.lab.domain.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private String id;
    private String name;
    private String password;
    private String age;
}
