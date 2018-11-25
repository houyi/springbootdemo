package com.houyi.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

//自动生成注解 表名 默认是类名
@Data
@Table(name = "tb_user")
public class User {
    //主键 自增
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String username;

    private String password;

    private String name;

    private Integer age;
    private Integer sex;
    private Date birthday;

    @Transient
    private String note;
    private Date created;
    private Date updated;

}
