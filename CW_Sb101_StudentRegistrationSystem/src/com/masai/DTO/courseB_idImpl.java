package com.masai.DTO;

public class courseB_idImpl implements courseB_id {

	String Cname;
	int bid;
	int availSeats;
	
	
	public courseB_idImpl(String cname, int bid, int availSeats) {
		super();
		Cname = cname;
		this.bid = bid;
		this.availSeats = availSeats;
	}

	public int getAvailSeats() {
		return availSeats;
	}

	public void setAvailSeats(int availSeats) {
		this.availSeats = availSeats;
	}

	

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Cname=" + Cname + ", bid=" + bid + ", availSeats=" + availSeats;
	}

	
	
	
	
}
