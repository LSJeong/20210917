package co.yedam.account;

import java.util.Scanner;

public class AppMain {
	
	// 싱글톤 : new 생성자 호출 -> 새로운 인스턴스 생성(다른 주소값을 가짐)
	// 새로만들지말고 만들어놓은 주소값 같은 메소드를 사용하겠다.
	private static AppMain singleton = new AppMain();
	
	// 생성자 private
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
		System.out.println("계좌 생성");
		System.out.println("-------");

		String ano = readStr("계좌번호 : ");
		String own = readStr("계좌주 : ");
		int bal = readInt("초기입금액 : ");

		Account acc = new Account(ano, own, bal);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	public void accountList() {
		for (Account acc : accountArray) {
			if (acc != null)
				System.out.println(acc.getAno() + " " + acc.getOwner() + "   " + acc.getBalance());
		}
	}
	public void deposit() {
		System.out.println("-------");
		System.out.println("예 금");
		System.out.println("-------");

		String ano = readStr("계좌번호 : ");
		if (findAccount(ano) != null)  {
			int bal = readInt("예금액 : ");
			findAccount(ano).setBalance(findAccount(ano).getBalance() + bal);
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
	}
	public void withdraw() {
		System.out.println("-------");
		System.out.println("출 금");
		System.out.println("-------");

		String ano = readStr("계좌번호 : ");

		if (findAccount(ano) != null) {
			int bal = readInt("출금액 : ");
			int won = findAccount(ano).getBalance() - bal;
			if (won < 0) {
				System.out.println("결과 : 출금가능액을 초과하였습니다.");
			} else {
				findAccount(ano).setBalance(won);
				System.out.println("결과 : 출금이 성공되었습니다.");
			}
		}
	}
	public Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		System.out.println("계좌가 없습니다.");
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
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}
	
	public void execute() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택 >> ");

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
				System.out.println("****************종료합니다****************");
			} else {
				System.out.println("잘못된 값을 입력하였습니다.");
			}
		}
		
	}
}
