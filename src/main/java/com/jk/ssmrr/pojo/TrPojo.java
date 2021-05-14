package com.jk.ssmrr.pojo;

import java.util.List;

public class TrPojo {

    private  Integer     id	;//int	id
    private  String	   text	;//String	姓名
    private  String	   url	;//String	姓名

    private  String       href   ;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private List<TrPojo> nodes;
    private  Boolean      selectable;

    private  Integer      pid;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<TrPojo> getNodes() {
        return nodes;
    }

    public void setNodes(List<TrPojo> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
