package fr.ldnr.thomas;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args)throws Exception {
		System.out.println("hello world");
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring.xml");
		Resource rAlaska = ctx.getResource("classpath:alaska.txt");
		InputStream is = rAlaska.getInputStream();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e) {
        	System.err.println("err");
        }
		
		CanadaService cs = (CanadaService) ctx.getBean("CanadaService");
		UsaService us = (UsaService) ctx.getBean("UsaService");
		
		int jour = 1;
		int rt = cs.getPrix(jour);
		System.out.print("pour "+ jour + " jour" + (jour <= 1 ? " ": "s ") + " au Canada " );
		if(rt < 0) {
			System.out.println("il n'y a pas de trajet");
		}else {
			System.out.println("prix " + rt + " €");
		}
		
		

		System.out.print("pour "+ jour + " jour" + (jour <= 1 ? " ": "s ") + " au USA " );
		System.out.println("prix " + us.getPrix(jour)+ " €");
		
			
		
		ctx.close();
	}

}
