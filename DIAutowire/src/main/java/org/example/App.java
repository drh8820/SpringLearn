package org.example;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //BookService bookService = (BookService) ctx.getBean("bookService");
        //bookService.save();
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}