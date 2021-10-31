package com.move.service;

import com.move.pojo.Items;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liushuaifeng
 * @version 2021/10/29 17:18
 */
public interface ItemsService {
    List<Items> findAll();
}
