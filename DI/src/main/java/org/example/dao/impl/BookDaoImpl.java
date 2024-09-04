package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bookDao")
@Scope("prototype")
public class BookDaoImpl implements BookDao {
    private String dataBaseUrl;
    private int connNum;

    // 简单类型constructor注入
    public BookDaoImpl(String dataBaseUrl, int connNum) {
        this.dataBaseUrl = dataBaseUrl;
        this.connNum = connNum;
    }

    // 简单类型setter注入
    /*public void setDataBaseUrl(String dataBaseUrl) {
        this.dataBaseUrl = dataBaseUrl;
    }

    public void setConnNum(int connNum) {
        this.connNum = connNum;
    }*/

    public void save() {
        //System.out.println("book dao saved....");
        System.out.println("book dao saved...." + dataBaseUrl + " connNum:" + connNum);
    }
}
