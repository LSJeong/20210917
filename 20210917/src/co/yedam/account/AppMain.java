package co.yedam.account;

import java.util.Scanner;

public class AppMain {
	
	// �̱��� : new ������ ȣ�� -> ���ο� �ν��Ͻ� ����(�ٸ� �ּҰ��� ����)
	// ���θ��������� �������� �ּҰ� ���� �޼ҵ带 ����ϰڴ�.
	private static AppMain singleton = new AppMain();
	
	// ������ private
	private AppMain() {
		
	}
	
	// method getInsatance()
	public static AppMain getInstance(){
		return singleton;
	}
	
	Account[] accountArray = new Account[100];
	Scanner scanner = new Scanner(System.in);
	
	public void createAccount() {
		System.out.println("-------");
		System.out.println("���� ����");
		System.out.println("-------");

		String ano = readStr("���¹�ȣ : ");
		String own = readStr("������ : ");
		int bal = readInt("�ʱ��Աݾ� : ");

		Account acc = new Account(ano, own, bal);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}
	
	public void accountList() {
		for (Account acc : accountArray) {
			if (acc != null)
				System.out.println(acc.getAno() + " " + acc.getOwner() + "   " + acc.getBalance());
		}
	}
	public void deposit() {
		System.out.println("-------");
		System.out.println("�� ��");
		System.out.println("-------");

		String ano = readStr("���¹�ȣ : ");
		if (findAccount(ano) != null)  {
			int bal = readInt("���ݾ� : ");
			findAccount(ano).setBalance(findAccount(ano).getBalance() + bal);
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
		}
	}
	public void withdraw() {
		System.out.println("-------");
		System.out.println("�� ��");
		System.out.println("-------");

		String ano = readStr("���¹�ȣ : ");

		if (findAccount(ano) != null) {
			int bal = readInt("��ݾ� : ");
			int won = findAccount(ano).getBalance() - bal;
			if (won < 0) {
				System.out.println("��� : ��ݰ��ɾ��� �ʰ��Ͽ����ϴ�.");
			} else {
				findAccount(ano).setBalance(won);
				System.out.println("��� : ����� �����Ǿ����ϴ�.");
			}
		}
	}
	public Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		System.out.println("���°� �����ϴ�.");
		return null;
	}
	
	public String readStr(String msg) {
		System.out.print(msg);
		return scanner.nextLine();
	}
	
	public int readInt(String msg) {
		System.out.print(msg);
		int result = 0;
		while (true) {
			String val = scanner.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		return result;
	}
	
	public void execute() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3. ���� | 4.��� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.println("���� >> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
				System.out.println("****************�����մϴ�****************");
			} else {
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
			}
		}
		
	}
}
