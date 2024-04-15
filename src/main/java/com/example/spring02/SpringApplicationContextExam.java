package com.example.spring02;

import exam.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextExam {
    public static void main(String[] args) {
        // 인스턴스를 인터페이스 타입으로 참조할 수 있다.
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book1 = (Book) context.getBean("book1");

        book1.setTitle("즐거운 Spring Boot");
        book1.setPrice(5000);

        System.out.println(book1.getTitle());
        System.out.println(book1.getPrice());

        Book book2 = context.getBean("book1", Book.class);

        System.out.println(book2.getTitle());

        Book book3 = context.getBean("book2", Book.class);

        System.out.println(book2.getTitle());

    }
}
