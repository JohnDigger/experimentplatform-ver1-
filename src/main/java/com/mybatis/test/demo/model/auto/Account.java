package com.mybatis.test.demo.model.auto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Account extends Model {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer UID;

    private Integer MMONEY;

    private Integer TIMELONG;
}
