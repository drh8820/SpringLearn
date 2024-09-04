package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bookDao")
//@Scope("prototype") /*默认单例*/
public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("bookDao constructing...");
    }

    @PostConstruct
    public void init() {
        System.out.println("bookDao init...");
    }

    public void save() {
        System.out.println("book dao save ..." );
    }

    @PreDestroy
    public void destroy() {
        System.out.println("bookDao destroy...");
    }
}
