package com.move.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author Liushuaifeng
 * @version 2021/10/29 16:06
 */
@Data
public class Items {

    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
    //get..set..
}