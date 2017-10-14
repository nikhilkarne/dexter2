package me.training.Nikij2se.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
    Date d=new Date();
//    System.out.println(d);
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(format.format(d));
	}

}
