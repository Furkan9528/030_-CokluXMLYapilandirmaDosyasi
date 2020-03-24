package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.furkankara.musteri.Musteri;



public class Merkez {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		
		 ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");

		 Musteri musteri = appCtx.getBean("BeanMusteri",Musteri.class);
		 
		 System.out.println("Adi  :"+musteri.getAdi());
		 System.out.println("Soyadi  :"+musteri.getSoyadi());
		 System.out.println("Telefon  :"+musteri.getTelNo());
		 System.out.println("Adres  :"+musteri.getAdres().getAdres());
		 
	
		 
	
	}
}
