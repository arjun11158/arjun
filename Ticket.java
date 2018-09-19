package com.nucleus.pojo;

public class Ticket {
	private int ticketId;
	private String personName;
	private String createDate;


	private int price;
	public static final int maxTicket=5;
	public static int counter1=0;
	
	public Ticket()
	{
	 counter1++;
	}


	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    
	
	
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", personName=" + personName + ", createDate=" + createDate + ", price="
				+ price + "]";
	}


	public String showTicket()
	{
		return "Ticket [ticketId=" + ticketId + ", personName=" + personName + ", createDate=" + createDate + ", price="
				+ price + "]";
	}

    public static void ticketStatus()
    {
    	System.out.println("No of tickets that can be booked: "+( maxTicket-counter1));
    	
    	
    }
}

