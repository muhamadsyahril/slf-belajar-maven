package com.arielslf.belajar.java;

import org.joda.time.DateTime;
public class DemoJodaTime {

	public static void main (String[] x){
		DateTime sekarang = new DateTime();
		DateTime tigaBulanLagi = sekarang.plusMonths(3);

		System.out.println("Tiga bulan lagi dari sekarang:" +tigaBulanLagi);
	}
}