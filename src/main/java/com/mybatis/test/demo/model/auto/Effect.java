package com.mybatis.test.demo.model.auto;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_effect")
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class Effect extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "effect_id")
    @TableGenerator(name = "effect_id", initialValue = 0, allocationSize = 1,table = "seq_table")
    private int id;
    private String effect_name;
    private String effect_imgurl;
    private String effect_person;
    @Column(columnDefinition = "text")
    private String effect_content;
    private int dic_num;
    private Date dic_datetime;
    private int course_id;
}
