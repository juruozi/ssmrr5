package com.jk.ssmrr.service.impl;



import com.jk.ssmrr.mapper.TrDao;
import com.jk.ssmrr.pojo.TrPojo;
import com.jk.ssmrr.service.TrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:橘若子
 * @Date: 2021/4/26 17:54
 * @Description:
 */
@Service
public class TrServiceImpl implements TrService {

    @Autowired
    private TrDao dao;


    @Override
    public List<TrPojo> cha() {
        return dao.cha();
    }

    public List<TrPojo> dTree() {
       int pid=0;
        List<TrPojo> list = dTree(pid);
        return list;
    }

    @Override
    public void del(Integer id) {
        dao.del(id);
    }

    @Override
    public void add(TrPojo tr) {
        if (tr.getId()!=null){ dao.xg(tr);}
        else { dao.add(tr);}

    }

    @Override
    public TrPojo hui(Integer id) {
        return dao.hui(id);
    }

    private List<TrPojo> dTree(int pid) {
        List<TrPojo> list = dao.dTree(pid);
        for (TrPojo tree : list) {
            Integer id = tree.getId();
            List<TrPojo> li = dTree(id);
            if(li!=null && li.size()>0){
                tree.setSelectable(false);
                tree.setNodes(li);
            }else{
                tree.setSelectable(true);
            }
        }
        return list;
    }




}
