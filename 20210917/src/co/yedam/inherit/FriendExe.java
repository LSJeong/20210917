package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {
	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// ģ��, �б�ģ��, ȸ��ģ�� -> �迭�� ����.
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("ȫ�浿", "1111-1311");
		friends[5] = new Friend("ȫ�浿", "1111-1234");
		friends[1] = new UnivFriend("��浿", "2222-1211", "��ǻ�Ͱ��а�");
		friends[2] = new UnivFriend("��ö��", "3333-1231", "�����а�");
		friends[3] = new CompFriend("��浿", "4444-1211", "�ѹ���");
		friends[4] = new CompFriend("��¯��", "4444-1211", "�ѹ���");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.ģ����� 2.��ȸ 3.���� 4.���� 5.����");
			System.out.println("--------------------------------");

//			ScanUtil su = new ScanUtil(); // �ν��Ͻ� �޸� �Ҵ�. -> static �ƴҶ�
//			su.readInt(null);

			// ����Ÿ��(static), �ν��Ͻ� �޸� �Ҵ�
			int menu = ScanUtil.readInt("�޴��� �����ϼ���.");
			if (menu == 1) {
				System.out.println("���");
				addFriend();
			} else if (menu == 2) {
				System.out.println("��ȸ");
				showList();
			} else if (menu == 3) {
				System.out.println("����");
				modify();
			} else if (menu == 4) {
				System.out.println("����");
				remove();
			} else if (menu == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
		}

		System.out.println("��.");

	}

	private void addFriend() {
		// ģ��, �б�, ȸ��ģ��
		System.out.println("1.ģ�� 2.�б�ģ�� 3.ȸ��ģ��");
		int choice = ScanUtil.readInt("�޴��� �����ϼ���.");
		String name = ScanUtil.readStr("ģ���̸��� �Է��ϼ���.");
		String phone = ScanUtil.readStr("����ó�� �Է��ϼ���.");
		Friend friend = null;

		if (choice == 1) {
			friend = new Friend(name, phone);
		} else if (choice == 2) {
			String major = ScanUtil.readStr("������ �Է��ϼ���.");
			friend = new UnivFriend(name, phone, major);
		} else if (choice == 3) {
			String depart = ScanUtil.readStr("�μ��� �Է��ϼ���.");
			friend = new CompFriend(name, phone, depart);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

		System.out.println("��� ����!!!");

	}

	private void showList() {
		// �̸�, ����ó �Է� => ȫ�浿, ��浿 -> �浿�̸� �Ѵ� ��������
		// 1111-1211, 2222-1211 -> 1211 �˻� -> �Ѵ� ��������
		// �浿, 1211 -> �̸� & ����ó. ��ȸ

		String search = ScanUtil.readStr("��ȸ�� �̸��� �Է��ϼ���.");
		String search2 = ScanUtil.readStr("��ȸ�� ����ó�� �Է��ϼ���.");
		
		for (int i = 0; i < friends.length; i++) { 
			if (!search.equals("") && !search2.equals("")) { // �Ѵ� �Է�������
				if (friends[i] != null && friends[i].getName().indexOf(search) != -1 && friends[i].getPhone().indexOf(search2) != -1) 
					System.out.println(friends[i].toString());
			} else if (!search.equals("")) { // �̸��� �Է�
				if (friends[i] != null && friends[i].getName().indexOf(search) != -1)
					System.out.println(friends[i].toString());
			} else if (!search2.equals("")) { // ����ó�� �Է�
				if (friends[i] != null && friends[i].getPhone().indexOf(search2) != -1) 
					System.out.println(friends[i].toString());				
			} else { // �Ѵ� �Է�x -> ��ü ������
				if (friends[i] != null)
					System.out.println(friends[i].toString());
			}
		} // end of for		
	
	}
	
	private void modify() {
		System.out.println("[ģ�����]");
		for(int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println("[" + i + "]" + friends[i].toString());
			}
		}
		
		int num = ScanUtil.readInt("ģ���� �����ϼ���.");
		String phone = ScanUtil.readStr("�ٲ� ��ȣ�� �Է��ϼ���");
		
		if(!phone.equals(""))
			friends[num].setPhone(phone);
		
		if(friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���");
			if(!major.equals(""))
				((UnivFriend) friends[num]).setMajor(major);
		}else if(friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���");
			if(!depart.equals(""))
				((CompFriend) friends[num]).setDepart(depart);
		}
		
		System.out.println("�����Ϸ�.");
		
	}
	
	private void remove() {
		System.out.println("[ģ�����]");
		for(int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println("[" + i + "]" + friends[i].toString());
			}
		}
		
		int num = ScanUtil.readInt("������ ģ���� �����ϼ���.");		
		
		if(friends[num] != null) {
			friends[num] = null;
			System.out.println("�����Ϸ�.");
		}
		else
			System.out.println("������ ģ�������� �����ϴ�.");
	}

}
