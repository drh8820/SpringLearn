package org.example.service.impl;

import org.example.service.BookService;
import org.springframework.stereotype.Component;

@Component /*接口不能创建对象*/
public class BookServiceImpl implements BookService {
    public void save() {
        System.out.println("book service save ...");
    }
}
