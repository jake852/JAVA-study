package kr.co.ezenac.membership;

public class GoldCustomer extends Customer {
	
	private int agentId;
	double salesRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;	
		return price - (int)(price * salesRatio);
	}
	
	
	
}
