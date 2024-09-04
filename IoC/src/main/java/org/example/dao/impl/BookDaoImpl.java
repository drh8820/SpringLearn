package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("bookDao")
@Scope("prototype")
public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("bookDao Constructor 构造方法");
    }

    /*private BookDaoImpl() {
        System.out.println("private bookDao Constructor");
    }*/

    public void save() {
        System.out.println("book dao saved....");
    }
}
