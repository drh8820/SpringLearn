package org.example;

import org.example.config.SpringConfig;
import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAnno {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        /*BookDao bookDao1 = (BookDao) applicationContext.getBean("bookDao");*/
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookDao);
        /*System.out.println(bookDao1);*/
        //bookDao.save();
        applicationContext.registerShutdownHook();
        //bookService.save();
    }
}
