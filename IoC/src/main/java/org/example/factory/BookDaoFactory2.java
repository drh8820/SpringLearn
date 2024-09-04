package org.example.factory;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;


public class BookDaoFactory2 {
    public BookDao getBookDaoImpl() {
        System.out.println("bookDao factory");
        return new BookDaoImpl();
    }
}
