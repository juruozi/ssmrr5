package com.jk.ssmrr.service;

import com.jk.ssmrr.pojo.TrPojo;

import java.util.List;

/**
 * @Auther:橘若子
 * @Date: 2021/4/26 17:54
 * @Description:
 */
public interface TrService {


    List<TrPojo> cha();

    List<TrPojo> dTree();

    void del(Integer id);

    void add(TrPojo tr);

    TrPojo hui(Integer id);
}
