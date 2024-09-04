package org.app;

import org.example.dao.BookDao;
import org.example.factory.BookDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        /*BookDao bookDao = BookDaoFactory.getBookDaoImpl();
        bookDao.save();*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();
    }
}
