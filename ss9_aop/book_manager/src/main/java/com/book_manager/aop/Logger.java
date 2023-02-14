package com.book_manager.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
    static int count=0;
    static int count1=0;
    @Pointcut("within(com.book_manager.controller.BookController)")
    public void getShow(){

    }
    @After(value ="getShow()" )
    public void printCount(){
        count ++;
        System.out.println("Số lần truy cập: " +count);
    }
    @Pointcut("execution(* com.book_manager.controller.BookController.borrowBook(..))|| execution(* com.book_manager.controller.BookController.giveBack(..))")
    public void showCount(){}
    @After(value = "showCount()")
    public void printChange(){
        count1 ++;
        System.out.println("số lần thay đổi: " + count1);
    }
}