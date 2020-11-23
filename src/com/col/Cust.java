package com.col;

import java.util.Comparator;

public class Cust implements Comparator{

	int accno;
	String custname;
	int custid;
	String custadd;
	
	
	public Cust(int accno, String custname, int custid, String custadd) {
		
		this.accno = accno;
		this.custname = custname;
		this.custid = custid;
		this.custadd = custadd;
	}
	
	public int compare(Object o1,Object o2)
	{
		
		Customer c1=(Customer)o1;
        Customer c2=(Customer)o2;
		if(c1.accno<c2.accno)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
