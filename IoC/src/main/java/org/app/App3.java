package org.app;

import org.example.dao.BookDao;
import org.example.factory.BookDaoFactory2;

public class App3 {
    public static void main(String[] args) {
        BookDaoFactory2 bookDaoFactory = new BookDaoFactory2();
        BookDao bookDao = bookDaoFactory.getBookDaoImpl();
        bookDao.save();
    }
}
