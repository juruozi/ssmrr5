package com.jk.ssmrr.controller;

import com.jk.ssmrr.pojo.TrPojo;
import com.jk.ssmrr.service.TrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("tree")
public class TrController {

    @Autowired
    private TrService ice;


    @RequestMapping("show")
    public String show(){
        return "a";
    }

    //加载tymeleaf表格
    @RequestMapping("show2")
    public String show2(Model model){
        List<TrPojo> list = ice.cha();
        model.addAttribute("userlist",list);
        return "a";
    }

    @RequestMapping("cha")
    @ResponseBody
    public List<TrPojo> cha() {
        return ice.cha();
    }


    @RequestMapping("dTree")
    @ResponseBody
    public List<TrPojo> dTree(){
        return ice.dTree();
    }

    @RequestMapping("del")
    @ResponseBody
    public void del(Integer id) {
        ice.del(id);
    }

    @RequestMapping("add")
    @ResponseBody
    public void add(TrPojo tr) {
        ice.add(tr);
    }

    @RequestMapping("hui")
    @ResponseBody
    public TrPojo hui(Integer id){
        TrPojo list = ice.hui(id);
        return list;
    }


}
