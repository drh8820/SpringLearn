package org.app;

import com.alibaba.druid.pool.DruidDataSource;
import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService1 = (BookService) context.getBean("bookService1");
        BookService bookService2 = (BookService) context.getBean("bookService2");

        //System.out.println(bookService1);
        //System.out.println(bookService2);
        bookService1.save();
        bookService2.save();

    }
}
