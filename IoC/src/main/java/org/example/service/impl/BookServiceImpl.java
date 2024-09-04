package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bookService")
public class BookServiceImpl implements BookService {
    //private BookDao bookDao = new BookDaoImpl(); //new

    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
        System.out.println("bookDao set....");
    }


    public void save() {
        System.out.println("book service saved....");
        bookDao.save();
    }
}
