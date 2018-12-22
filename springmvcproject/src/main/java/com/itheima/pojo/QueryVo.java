package com.itheima.pojo;

/**
 * @Author: MR.z
 * @Date: 2018/12/18 11:22
 * @Version 1.0
 */
public class QueryVo {
    private String custName;
    private String custSource;
    private String custIndustry;
    private  String custLevel;

//    当前页码数
    private Integer page = 1;
//    数据库从哪一条开始查
    private Integer strart;;
//    每页显示数据条数
    private Integer size = 10;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public QueryVo() {
    }

    public QueryVo(String custName, String custSource, String custIndustry, String custLevel, Integer page, Integer strart, Integer rows) {
        this.custName = custName;
        this.custSource = custSource;
        this.custIndustry = custIndustry;
        this.custLevel = custLevel;
        this.page = page;
        this.strart = strart;
        this.size = rows;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getStrart() {
        return strart;
    }

    public void setStrart(Integer strart) {
        this.strart = strart;
    }


}
