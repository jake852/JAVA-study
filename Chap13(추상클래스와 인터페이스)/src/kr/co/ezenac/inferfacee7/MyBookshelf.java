package kr.co.ezenac.inferfacee7;



//class랑 interface가  있으면 class먼저(extends) 선언 
public class MyBookshelf extends Bookshelf implements Queue{

	@Override
	public void enQueue(String title) {
		bookshelf.add(title);
		
		
	}

	@Override
	public String deQueue() {
		
		
		return bookshelf.remove(0);
	}  
	
	
	
}
