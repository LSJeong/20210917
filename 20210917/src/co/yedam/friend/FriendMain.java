package co.yedam.friend;

import java.util.Scanner;

/*
 * ģ�� ��� ����.
 * �̸�, ����ó, email, Ű, ������
 * 1.���, 2.��ȸ(�̸�), 3.���, 4.����(�̸��������� ���� ����, ���ȳ����� �����ȵǵ���), 5.����, 9.����. 
 */
public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] friendLib = new Friend[50];
		
		friendLib[0] = new Friend("ȫ�浿","010-1111-2222","hong@naver.com",178.2,80.5);
		friendLib[1] = new Friend("��ö��","010-3333-4444","Kim@naver.com",195.7,85.2);
		friendLib[2] = new Friend("�迵��","010-5555-6666","Young@naver.com",158.4,42.7);
		

		while (true) {
			System.out.println("================================================");
			System.out.println("1.ģ����� 2.ģ����ȸ 3.ģ����� 4.ģ������ 5.ģ������ 9.����");
			int menu = readInt("�޴���ȣ�� �Է��ϼ���>> ");
			if (menu == 1) {
				System.out.println("*******ģ����� �޴�*********");
				String name = readStr("ģ�� �̸��� �Է��ϼ���.");
				String phone = readStr("ģ�� ����ó�� �Է��ϼ���.");
				String email = readStr("ģ�� �̸����� �Է��ϼ���.");
				Double height = readDou("ģ�� Ű�� �Է��ϼ���.");
				Double weight = readDou("ģ�� �����Ը� �Է��ϼ���.");

				Friend friends = new Friend(name, phone, email, height, weight);

				for (int i = 0; i < friendLib.length; i++) {
					if (friendLib[i] == null) {
						friendLib[i] = friends;
						break;
					}
				}
				System.out.println("!!!���� �Ϸ�!!!");
			} else if (menu == 2) {
				System.out.println("*******ģ����ȸ �޴�*********");
				String search = readStr("��ȸ�� ģ�� �̸��� �Է��ϼ���>>");
				for (Friend friends : friendLib) {
					if (friends != null && friends.getName().indexOf(search) != -1)
						friends.showInfo();
				}

			} else if (menu == 3) {
				System.out.println("*******ģ����� �޴�*********");
				for (Friend friends : friendLib) {
					if (friends != null) {
						friends.showInfo();
					}
				}
			} else if (menu == 4) {
				System.out.println("*******ģ������ �޴�*********");
				String name = readStr("������ ģ�� �̸��� �Է��ϼ���>>");
				String phone = readStr("������ ����ó�� �Է��ϼ���.");
				String email = readStr("������ �̸����� �Է��ϼ���.");
				String height = readStr("������ Ű�� �Է��ϼ���.");
				String weight = readStr("������ �����Ը� �Է��ϼ���.");
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
					System.out.println("���������� �����߽��ϴ�!!!");
				else
					System.out.println("���������ʴ� ģ���Դϴ�!!!");

			} else if (menu == 5) {
				System.out.println("*******ģ������ �޴�*********");
				String search = readStr("������ ģ�� �̸��� �Է��ϼ���>> ");
				for (int i = 0; i < friendLib.length; i++) {
					if (friendLib[i] != null && friendLib[i].getName().indexOf(search) != -1) {
						friendLib[i] = null;
					}
				}
				System.out.println("���� �Ϸ�!!!");
			} else if (menu == 9) {
				System.out.println("==================�����մϴ�===============");
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
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
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
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		return result;
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

}
