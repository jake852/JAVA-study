package kr.co.ezenac.exception02;

public class PasswordTest {

	private String Password;
	
	
	public void setPassword(String password) throws PasswordException {
		
		if(password == null)
			throw new PasswordException("비밀번호는 null일 수 없습니다. ");
		else if (password.length() < 5)
			throw new PasswordException("비밀번호는 5 이상 이여야 합니다. ");
		
		Password = password;
	}


	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String password = null;
		
		
		
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
		
		password = "ezen";
		
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
}
