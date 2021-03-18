package com.mybatis.test.demo.model.auto;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import javax.annotation.Generated;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)

public class Users extends Model {
    @TableId(value = "id",type= IdType.AUTO)
    private Integer id;

    private String username;

    private Date birthday;

    private String sex;

    private String address;

}
