package co.yedam.friend;

import java.util.Scanner;

/*
 * 친구 목록 관리.
 * 이름, 연락처, email, 키, 몸무게
 * 1.등록, 2.조회(이름), 3.목록, 4.수정(이름기준으로 모든걸 수정, 값안넣으면 수정안되도록), 5.삭제, 9.종료. 
 */
public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] friendLib = new Friend[50];
		
		friendLib[0] = new Friend("홍길동","010-1111-2222","hong@naver.com",178.2,80.5);
		friendLib[1] = new Friend("김철수","010-3333-4444","Kim@naver.com",195.7,85.2);
		friendLib[2] = new Friend("김영희","010-5555-6666","Young@naver.com",158.4,42.7);
		

		while (true) {
			System.out.println("================================================");
			System.out.println("1.친구등록 2.친구조회 3.친구목록 4.친구수정 5.친구삭제 9.종료");
			int menu = readInt("메뉴번호를 입력하세요>> ");
			if (menu == 1) {
				System.out.println("*******친구등록 메뉴*********");
				String name = readStr("친구 이름을 입력하세요.");
				String phone = readStr("친구 연락처를 입력하세요.");
				String email = readStr("친구 이메일을 입력하세요.");
				Double height = readDou("친구 키를 입력하세요.");
				Double weight = readDou("친구 몸무게를 입력하세요.");

				Friend friends = new Friend(name, phone, email, height, weight);

				for (int i = 0; i < friendLib.length; i++) {
					if (friendLib[i] == null) {
						friendLib[i] = friends;
						break;
					}
				}
				System.out.println("!!!저장 완료!!!");
			} else if (menu == 2) {
				System.out.println("*******친구조회 메뉴*********");
				String search = readStr("조회할 친구 이름을 입력하세요>>");
				for (Friend friends : friendLib) {
					if (friends != null && friends.getName().indexOf(search) != -1)
						friends.showInfo();
				}

			} else if (menu == 3) {
				System.out.println("*******친구목록 메뉴*********");
				for (Friend friends : friendLib) {
					if (friends != null) {
						friends.showInfo();
					}
				}
			} else if (menu == 4) {
				System.out.println("*******친구수정 메뉴*********");
				String name = readStr("수정할 친구 이름을 입력하세요>>");
				String phone = readStr("수정할 연락처를 입력하세요.");
				String email = readStr("수정할 이메일을 입력하세요.");
				String height = readStr("수정할 키를 입력하세요.");
				String weight = readStr("수정할 몸무게를 입력하세요.");
				boolean isEx = false;

				for (int i = 0; i < friendLib.length; i++) {
					if (friendLib[i] != null && friendLib[i].getName().equals(name)) {
						if (!phone.equals("")) {
							friendLib[i].setPhone(phone);
						} else if (!email.equals("")) {
							friendLib[i].setEmail(email);
						} else if (!height.equals("")) {
							friendLib[i].setHeight(Double.parseDouble(height));
						} else if (!weight.equals("")) {
							friendLib[i].setWeight(Double.parseDouble(weight));
						}
						isEx = true;
					}
				}
				if (isEx)
					System.out.println("정상적으로 수정했습니다!!!");
				else
					System.out.println("존재하지않는 친구입니다!!!");

			} else if (menu == 5) {
				System.out.println("*******친구삭제 메뉴*********");
				String search = readStr("삭제할 친구 이름을 입력하세요>> ");
				for (int i = 0; i < friendLib.length; i++) {
					if (friendLib[i] != null && friendLib[i].getName().indexOf(search) != -1) {
						friendLib[i] = null;
					}
				}
				System.out.println("삭제 완료!!!");
			} else if (menu == 9) {
				System.out.println("==================종료합니다===============");
				break;
			}

		}
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}

	public static double readDou(String msg) {
		System.out.println(msg);
		double result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Double.parseDouble(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

}
