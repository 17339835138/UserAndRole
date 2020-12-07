package com.wty.entity;

import java.io.Serializable;

/**
 * (Roles)实体类
 *
 * @author makejava
 * @since 2020-12-01 21:15:13
 */
public class Roles implements Serializable {
    private static final long serialVersionUID = 728773006450868798L;

    private Integer rid;

    private String ranme;

    private String rdesc;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRanme() {
        return ranme;
    }

    public void setRanme(String ranme) {
        this.ranme = ranme;
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }

}