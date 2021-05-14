package com.jk.ssmrr.mapper;

import com.jk.ssmrr.pojo.TrPojo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TrDao {

        List<TrPojo> cha();

    List<TrPojo> dTree(int pid);

    void del(Integer id);

    void add(TrPojo tr);

    TrPojo hui(Integer id);

    void xg(TrPojo tr);
}
