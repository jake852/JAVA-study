package kr.co.ezenac.inferfacee3;

public class RoundrobinCall implements Distribution {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵ㄴ디ㅏ.");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("다음 순서의 상담원에게 배분합니다.");
		
	}

}
