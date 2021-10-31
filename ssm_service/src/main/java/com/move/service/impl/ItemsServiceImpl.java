package com.move.service.impl;

import com.move.dao.ItemsDao;
import com.move.pojo.Items;
import com.move.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Liushuaifeng
 * @version 2021/10/29 17:22
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    @Transactional//开启事务
    public List<Items> findAll() {
       return itemsDao.findAll();
    }
}
