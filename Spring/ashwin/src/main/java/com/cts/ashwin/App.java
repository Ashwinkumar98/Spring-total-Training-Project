package com.cts.ashwin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ashwin.AnnotationBased.Config;
import com.cts.configuration.MyConfig;
import com.cts.scd.service.GreetNoteTimeBaseImp;
import com.cts.scd.service.GreetService;
import com.cts.scd.service.GreetServiceImp;
import com.cts.scd.service.GreetingServiceArguementImp;
import com.cts.scd.service.ListServiceImp;

public class App 
{
    public static void main( String[] args )
    
    {
    	//Bean Configuration
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("bean1.xml");
    	
    	GreetService gs1 = (GreetService) ctx.getBean("gs1");
    	System.out.println(gs1.greet("Ashwin"));
    	
    	GreetService gs2 = (GreetService) ctx.getBean("gs2");
    	System.out.println(gs2.greet("opop"));
    	
    	((GreetingServiceArguementImp)gs2).setGreetNote("Hai");
    	System.out.println(gs2.greet("sdsd"));
    	
    	GreetService gs2a = (GreetService) ctx.getBean("gs2");
    	System.out.println(gs2a.greet("opop"));
    	
    	GreetService gs3 = (GreetService) ctx.getBean("gs3");
    	System.out.println(gs3.greet("opop"));
    	
    	GreetService gs4 = (GreetService) ctx.getBean("gs5");
    	System.out.println(gs4.greet("opop"));
    	
    	GreetService gs6 = (GreetService) ctx.getBean("gs6");
    	System.out.println(gs6.greet("dfgdfgdf"));
    	
    	ListServiceImp gs7 = (ListServiceImp) ctx.getBean("gs7");
    	System.out.println(gs7.getList());
//    	
    	//Java Based Configuration
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    	
    	GreetNoteTimeBaseImp gs8= (GreetNoteTimeBaseImp) context.getBean("gs1");
    	System.out.println(gs8.getGreetNote());
    	
    	//Java Based Configuration Constructor Injection
    	
    	GreetingServiceArguementImp gs9 = (GreetingServiceArguementImp) context.getBean("gs2");
    	System.out.println(gs9.greet("Ashwin"));
    	
    	//Java Based Configuration Bean Injection
    	
    	GreetService gs10 = (GreetService) context.getBean("gs3");
    	System.out.println(gs10.greet("Manjula"));
    	
    	//Java Based Configuration Attribute Value Setting
    	
    	GreetService gs11 = (GreetService) context.getBean("gs4");
    	System.out.println(gs11.greet("pandia"));
    	
    	
    	//Annotation Based Configuration Attribute Value
    	
    	ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config.class);
    	GreetService gs22 = (GreetService) ctx1.getBean("gs2");
    	System.out.println(gs22.greet("Aswath ..."));
    	
    	//Annotation Based Configuration  
    
    	GreetService gs33 = (GreetService) ctx1.getBean("s1");
    	System.out.println(gs33.greet("NAwin ..."));
    	
    	
    	//Annotation Based Configuration  
        
    	GreetService gs44 = (GreetService) ctx1.getBean("s2");
    	System.out.println(gs44.greet("dai loouse payale ..."));
    }
}
