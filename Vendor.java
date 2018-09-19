package com.nucleus.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Vendor {
	
	int vendorId;
	String vendorName;
	String contractStartDate;
	String contractEndDate;
	String customerName;
	
	public void setData()
	{
		
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Vendor Id: ");
	vendorId=in.nextInt();
	System.out.println("Enter Vendor Name: ");
    vendorName=in.next();
    System.out.println("Enter Contract Start Date in Format dd/MM/yyyy: ");
	contractStartDate=in.next();
	System.out.println("Enter Contract End Date: in Format dd/MM/yyyy: ");
	contractEndDate=in.next();
	System.out.println("Enter Customer Name");
	customerName=in.next();
	
	in.close();
	
	}
	
	public String getData()
	{
		return " Vendor ID: "+vendorId+" \n Vendor Name: "+vendorName+" \n Contract Start Date "+contractStartDate+
			"\n Contract End Date "+contractEndDate+"\n Customer Name "+customerName;	
		
	}
	

	
	
	public void calculateContractDuration() throws ParseException
	{
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(contractStartDate);
		Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(contractEndDate);
		
		long diffInMillies=Math.abs(date1.getTime()-date2.getTime());  
		long diff=TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
		
		System.out.println(" Contract Duration "+diff+" days");
	
	}
	
	
	public void calculateContractExpiry() throws ParseException
	{
		
		Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(contractEndDate);
		Date d1=new Date();
		long diffInMillies=Math.abs(date2.getTime()-d1.getTime());
        long diff=TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
		
		System.out.println(" Contract Expiry "+diff+" days");
		
		
		
		
		
		
	
	}
	
	
	
	

}