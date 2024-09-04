package org.example.factory;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;


public class BookDaoFactory {
    public static BookDao getBookDaoImpl() {
        System.out.println("bookDao factory");
        return new BookDaoImpl();
    }
}
