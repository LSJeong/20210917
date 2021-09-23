package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {
	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// 친구, 학교친구, 회사친구 -> 배열에 저장.
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("홍길동", "1111-1311");
		friends[5] = new Friend("홍길동", "1111-1234");
		friends[1] = new UnivFriend("김길동", "2222-1211", "컴퓨터공학과");
		friends[2] = new UnivFriend("김철수", "3333-1231", "역사학과");
		friends[3] = new CompFriend("김길동", "4444-1211", "총무부");
		friends[4] = new CompFriend("최짱구", "4444-1211", "총무부");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.친구등록 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("--------------------------------");

//			ScanUtil su = new ScanUtil(); // 인스턴스 메모리 할당. -> static 아닐때
//			su.readInt(null);

			// 정적타입(static), 인스턴스 메모리 할당
			int menu = ScanUtil.readInt("메뉴를 선택하세요.");
			if (menu == 1) {
				System.out.println("등록");
				addFriend();
			} else if (menu == 2) {
				System.out.println("조회");
				showList();
			} else if (menu == 3) {
				System.out.println("수정");
				modify();
			} else if (menu == 4) {
				System.out.println("삭제");
				remove();
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			}
		}

		System.out.println("끝.");

	}

	private void addFriend() {
		// 친구, 학교, 회사친구
		System.out.println("1.친구 2.학교친구 3.회사친구");
		int choice = ScanUtil.readInt("메뉴를 선택하세요.");
		String name = ScanUtil.readStr("친구이름을 입력하세요.");
		String phone = ScanUtil.readStr("연락처를 입력하세요.");
		Friend friend = null;

		if (choice == 1) {
			friend = new Friend(name, phone);
		} else if (choice == 2) {
			String major = ScanUtil.readStr("전공을 입력하세요.");
			friend = new UnivFriend(name, phone, major);
		} else if (choice == 3) {
			String depart = ScanUtil.readStr("부서를 입력하세요.");
			friend = new CompFriend(name, phone, depart);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

		System.out.println("등록 성공!!!");

	}

	private void showList() {
		// 이름, 연락처 입력 => 홍길동, 김길동 -> 길동이면 둘다 나오도록
		// 1111-1211, 2222-1211 -> 1211 검색 -> 둘다 나오도록
		// 길동, 1211 -> 이름 & 연락처. 조회

		String search = ScanUtil.readStr("조회할 이름을 입력하세요.");
		String search2 = ScanUtil.readStr("조회할 연락처를 입력하세요.");
		
		for (int i = 0; i < friends.length; i++) { 
			if (!search.equals("") && !search2.equals("")) { // 둘다 입력했을때
				if (friends[i] != null && friends[i].getName().indexOf(search) != -1 && friends[i].getPhone().indexOf(search2) != -1) 
					System.out.println(friends[i].toString());
			} else if (!search.equals("")) { // 이름만 입력
				if (friends[i] != null && friends[i].getName().indexOf(search) != -1)
					System.out.println(friends[i].toString());
			} else if (!search2.equals("")) { // 연락처만 입력
				if (friends[i] != null && friends[i].getPhone().indexOf(search2) != -1) 
					System.out.println(friends[i].toString());				
			} else { // 둘다 입력x -> 전체 나오게
				if (friends[i] != null)
					System.out.println(friends[i].toString());
			}
		} // end of for		
	
	}
	
	private void modify() {
		System.out.println("[친구목록]");
		for(int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println("[" + i + "]" + friends[i].toString());
			}
		}
		
		int num = ScanUtil.readInt("친구를 선택하세요.");
		String phone = ScanUtil.readStr("바꿀 번호를 입력하세요");
		
		if(!phone.equals(""))
			friends[num].setPhone(phone);
		
		if(friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("바꿀 전공을 입력하세요");
			if(!major.equals(""))
				((UnivFriend) friends[num]).setMajor(major);
		}else if(friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("바꿀 전공을 입력하세요");
			if(!depart.equals(""))
				((CompFriend) friends[num]).setDepart(depart);
		}
		
		System.out.println("수정완료.");
		
	}
	
	private void remove() {
		System.out.println("[친구목록]");
		for(int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println("[" + i + "]" + friends[i].toString());
			}
		}
		
		int num = ScanUtil.readInt("삭제할 친구를 선택하세요.");		
		
		if(friends[num] != null) {
			friends[num] = null;
			System.out.println("삭제완료.");
		}
		else
			System.out.println("삭제할 친구정보가 없습니다.");
	}

}
