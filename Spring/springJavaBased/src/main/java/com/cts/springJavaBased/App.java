package com.cts.springJavaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.currency.configuration.MyConfig;
import com.cts.currency.service.CurrencyConverter;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        
        CurrencyConverter obj = (CurrencyConverter) ctx.getBean("b1");
        System.out.println(obj.ConverteCurrency(191,"US","GBP"));
    }
}
