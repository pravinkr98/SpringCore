package com.ps.test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ps.config.AppConfig;

public class I18nAppTest {

	public static void main(String[] args) {
		Locale locale=null;
		//ResourceBundle bundle=null;
		String lsno=null,lsname=null,lsadd=null,cap1=null,cap2=null,cap3=null,cap4=null;
		JFrame frame=null;
		JLabel lno=null,lname=null,ladd=null;
		JTextField tno=null,tname=null,tadd=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		ApplicationContext ctx=null;
		
		//create Locale object
		locale=new Locale(args[0],args[1]);
		
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Locate the Properties file
		//bundle=ResourceBundle.getBundle("com/ps/commons/App",locale);
		
		//String labels by submitting keys
		lsno=ctx.getMessage("sno.label", new Object[] {"Student"}, "msg1", locale);
		lsname=ctx.getMessage("sname.label", new Object[] {}, "msg2", locale);
		lsadd=ctx.getMessage("sadd.label", new Object[] {}, "msg3", locale);
		cap1=ctx.getMessage("btn1.cap", new Object[] {}, "msg4", locale);
		cap2=ctx.getMessage("btn2.cap", new Object[] {}, "msg5", locale);
		cap3=ctx.getMessage("btn3.cap", new Object[] {}, "msg6", locale);
		cap4=ctx.getMessage("btn4.cap", new Object[] {}, "msg7", locale);
		String label11=ctx.getMessage("sno.label", new Object[] {"customer","label11"}, new Locale("de","DE"));
		System.out.println(label11);
		
		//create JFrame
		frame=new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 300);
		frame.setBackground(Color.orange);
		frame.setTitle("I18n App");
		
		//create Labels,textBoxes,buttons
		lno=new JLabel(lsno);
		frame.add(lno);
		tno=new JTextField(10);
		frame.add(tno);
		
		lname=new JLabel(lsname);
		frame.add(lname);
		tname=new JTextField(10);
		frame.add(tname);
		
		ladd=new JLabel(lsadd);
		frame.add(ladd);
		tadd=new JTextField(10);
		frame.add(tadd);
		
		btn1=new JButton(cap1);
		frame.add(btn1);
		btn2=new JButton(cap2);
		frame.add(btn2);
		btn3=new JButton(cap3);
		frame.add(btn3);
		btn4=new JButton(cap4);
		frame.add(btn4);
		
		//set visible true
		frame.setVisible(true);
		
		//set for closing
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}//main

}//class
