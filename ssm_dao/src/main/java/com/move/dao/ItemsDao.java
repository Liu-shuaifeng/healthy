package com.move.dao;

import com.move.pojo.Items;

import java.util.List;

/**
 * @author Liushuaifeng
 * @version 2021/10/29 16:05
 */
public interface ItemsDao {

    List<Items> findAll();
}
