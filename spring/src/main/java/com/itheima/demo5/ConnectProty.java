package com.itheima.demo5;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 10:02
 * @Version 1.0
 */
public class ConnectProty {
    private List list;
    private Map map;
    private Set set;
    private Properties properties;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ConnectProty{" +
                "list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", properties=" + properties +
                '}';
    }
}
