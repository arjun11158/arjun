package com.nucleus.test;
import java.util.Arrays;
import java.util.Scanner;

import com.nucleus.pojo.Employee;

public class TestManager {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[5];
		int i,count=0;
		int dept[]=new int[10];
		
		
		for(i=0;i<5;i++)
		{ e[i]=new Employee();
			System.out.println("Enter Employee Name:");
			e[i].Uname="arjun";
		    System.out.println("Enter Employee ID:");
			e[i].UserId=11;
			System.out.println("Enter Employee Designation:");
			e[i].designation="Manager";
			System.out.println("Enter Employee Salary: ");
			e[i].Salary=4500;
			System.out.println("Enter Employee Department Name :");
			e[i].deptName="Finance";
			System.out.println("Enter Department ID:");
			e[i].deptId=sc.nextInt();
			System.out.println("Enter Joining Date: ");
			e[i].joiningDate="11/04/2019";
			
//		System.out.println("Values entered hard coded");	
			
		}
		int k=0;
		dept[0]=e[0].deptId;
		for(i=0;i<5;i++)
		{
			System.out.println(e[i]);
			if(e[i].designation.equalsIgnoreCase("Manager"));
			{
			count++;
			}
			
		
			
		}
		
		for(i=1;i<5;i++)
		{
		
			for (int j = i - 1; j>=0; j--) 
			{
				if (e[i].deptId == e[j].deptId) {
				} 
				else {
					 System.out.println("i count "+i);
					  System.out.println("k ="+k);
					  System.out.println("dept "+dept[k]);
					   k++;
					dept[k] = e[i].deptId;
					break;
               
				}
          
           
			
			}
	}	
		for(i=0;i<5;i++)
			{
				System.out.print(" "+dept[i]);
			}
		
		System.out.println("\n NO of managers are "+count);
		
		}   
	}




