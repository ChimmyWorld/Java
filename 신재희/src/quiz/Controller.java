package quiz;

import java.util.Comparator;	
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
		Scanner sc = new Scanner(System.in);
		
		private LinkedList<Member> list = new LinkedList<Member>();
		
		Comparator<Member> IdDesc = (Member o1, Member o2) ->{
			return o2.compareTo(o1);
			// ID를 기준으로 내림차순 정렬
		};
		
		public boolean duplicateCheck(String id) {
			for (int i=0; i<list.size(); i++) {
				if (id.equals(list.get(i).getId())) {
					System.out.println("아이디 중복");
					return true;
				}
			}
			return false;
			
			// 중복 체크 로직
			// 중복인 경우 true를 반환, 이후 각 유형의 signUp 메서드에서 ID 중복 여부에 따라 추가 정보를 받을지 말지 판단 
		}
		
		public void sellerSignUp() {
			System.out.println("ID입력: ");
			String id = sc.next();
			
			if (duplicateCheck(id) == true) {
				return;
			}
			
			System.out.println("PW입력: ");
			String pw = sc.next();
				
			System.out.println("이름: ");
			String name = sc.next(); 
				
			System.out.println("가게 이름: ");
			String marketName = sc.next();
				
			Seller seller = new Seller(id, pw, name, marketName);
			list.add(seller);
			//seller로 선택되면 공통 속성과 함께 가게 이름을 입력받는다.
		}
		
		public void customerSignUp() {
			System.out.println("ID입력: ");
			String id = sc.next();
			
			if (duplicateCheck(id) == true) {
				return;
			}
			
			System.out.println("PW입력: ");
			String pw = sc.next();
				
			System.out.println("이름: ");
			String name = sc.next(); 
			
			System.out.println("배송주소: ");
			String address = sc.next();
				
			Customer customer = new Customer(id, pw, name, address);
			list.add(customer);	
			// customer로 선택되면 공통 속성과 함께 배송 주소를 입력받는다.
		}
	
		public void signUp() {
			
			System.out.println("가입하실 회원유형을 숫자로 입력해주세요. [1.판매자 2. 구매자]");
			int category = sc.nextInt();
			
			if(category == 1) sellerSignUp();
			if(category == 2) customerSignUp();
			// 회원 유형에 따라 다른 정보를 입력 받기 위해 분기를 나누었음.
		}
		
		public void withdraw() {
			System.out.println("탈퇴 처리할 아이디를 입력하세요");
			String withdraw = sc.next();
			
			for (int i=0; i < list.size(); i++) {
				if(withdraw.equals(list.get(i).getId())) {
					list.remove(i);
					System.out.println("회원 삭제 완료");
					return;
				}
				System.out.println("존재하지 않는 아이디입니다.");
			}
			// 탈퇴할 아이디가 리스트에 이미 존재하는 아이디와 동일하면 해당 인덱스에 있는 객체를 삭제
			
		}
		
		public void listAll() {
			System.out.println(list);
		}
		
		public void selectOne() {
			System.out.println("찾는 아이디를 입력하세요: ");
			String find = sc.next();
			
			for (int i=0; i < list.size(); i++) {
				if (find.equals(list.get(i).getId())){
					System.out.println(list.get(i));
				}
			}
			// 찾는 아이디가 리스트에 이미 존재하는 아이디라면 해당 인덱스에 있는 객체 정보를 출력
		}
		
		public void sort() {
			System.out.println("아이디를 정렬할 기준을 선택하세요 [1. 오름차순 정렬 | 2. 내림차순 정렬]");
			int std = sc.nextInt();
			if (std == 1) list.sort(null);			
			if (std == 2) list.sort(IdDesc);
			// 아이디를 기준으로 입력 기준에 따라 오름차순 혹은 내림차순 정렬 실행
			// Member의 compareTo는 오름차순으로 오버라이드 하여서 null을 넣으면 기존 기준인 오름차순이 실행됨.
		}
		
		public void run() {
			int menu;
			do {
				System.out.println("------------- 메뉴 -------------");
				System.out.println("\t 1. 회원 가입");
				System.out.println("\t 2. 회원 탈퇴");
				System.out.println("\t 3. 전체 목록");
				System.out.println("\t 4. 단일 검색");
				System.out.println("\t 5. 정렬");
				System.out.println("\t 0. 프로그램 종료");
				
				System.out.println(">>>");
				menu = sc.nextInt();
				
				switch(menu) {
				case 1:
					signUp();
					continue;
				case 2:
					withdraw();
					continue;
				case 3:
					listAll();
					continue;
				case 4:
					selectOne();
					continue;
				case 5:
					sort();
					continue;
				case 0:
					System.out.println("프로그램 종료");
					
				}
				
			} while(menu!=0);
			
			
		}
	}

