package org.example;

import org.example.config.SpringConfig;
import org.example.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        //bookDao.update();
        int select = bookDao.select();
        System.out.println(select);
    }
}
