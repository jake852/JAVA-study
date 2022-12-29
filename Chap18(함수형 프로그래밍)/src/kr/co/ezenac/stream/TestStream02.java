package kr.co.ezenac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import kr.co.ezenac.stream.model.User;

public class TestStream02 {
	
	public static void main(String[] args) {
		
		Stream<Integer> numberStream = Stream.of(3, -5, 7, 10, -3);
		Stream<Integer> filteredNuberStream = numberStream.filter(x -> x > 0);
		List<Integer> filteredNumber = filteredNuberStream.collect(Collectors.toList());
		System.out.println(filteredNumber);
		
		List<Integer> numberStream2 = Stream.of(3, -5, 7, 10, -3)
				.filter(x -> x >0)
				.collect(Collectors.toList());
		System.out.println(numberStream2);
		
		User user1 = new User()
				.setId(101)
				.setName("jake")
				.setVerified(true)
				.setEmailAddress("jake852@daum.net");
				
		User user2 = new User()
				.setId(102)
				.setName("Juliana")
				.setVerified(false)
				.setEmailAddress("Juliana@daum.net");
		
		User user3 = new User()
				.setId(103)
				.setName("Jodun")
				.setVerified(true)
				.setEmailAddress("Jodun@daum.net");
		
		List<User> users = Arrays.asList(user1, user2, user3);
		List<User> verifiedUsers = users.stream()
			.filter(user -> user.isVerified())
			.collect(Collectors.toList());
		System.out.println(verifiedUsers);
		
		System.out.println();
		
		List<User> unverifiedUsers = users.stream()
			.filter(user -> !user.isVerified())
			.collect(Collectors.toList());
		System.out.println(unverifiedUsers);
		
		
		
	}
	
}
