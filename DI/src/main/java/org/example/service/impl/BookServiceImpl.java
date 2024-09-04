package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.UserDao;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    private UserDao userDao;

    // 引用类型constructor注入
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    // 引用类型setter注入
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
        System.out.println("bookDao set....");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("userDao set....");
    }

    public void save() {
        System.out.println("book service saved....");
        bookDao.save();
        userDao.save();
    }
}
