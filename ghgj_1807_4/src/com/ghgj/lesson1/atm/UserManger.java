package com.ghgj.lesson1.atm;

public class UserManger {
	User[]  um = new  User[1000];
	// ��ǰ��¼�����±�
	int  flag;
	public UserManger() {	
		User  a = new User("0001","3517827",50000);
		um[0] = a;
	}
	
	//��ѯ
	public void xun() {
		for(int i = 0 ; i<um.length;i++) {
			if(um[i]==null) {
				break;
			}
			System.out.println(um[i]);
		}
	}
	//��¼
	public boolean login(String number,String password) {
		for(int i = 0 ; i<um.length;i++) {
			if(um[i]==null) {
				return false;
			}
			if(um[i].getNumber().equals(number)&&um[i].getPassword().equals(password)) {
				flag = i;
				return true;
			}	
		}
		return false;
	}
	// ��� �û��˻� ����
	public void addUser(User user) {
		for(int i = 0 ; i<um.length;i++) {
			if(um[i]==null) {
				um[i]=user;
				System.out.println("�����ɹ���");
				System.out.println("����\t���");
				System.out.println(um[i].getNumber()+"\t"+um[i].getMoney());
				break;
			}
		}
	}
	
	//1.��Ǯ 
	public void addMoney(int money) {
		um[flag].addMoney(money);
		System.out.println("��ɹ����"+money+"Ԫ");
		System.out.println("�㵱ǰ���Ϊ��"+um[flag].getMoney());
		
	}
	//2.ȡǮ	
	public void takeMoney(int money) {
		um[flag].takeMoney(money);
		System.out.println("��ɹ�ȡ��"+money+"Ԫ");
		System.out.println("�㵱ǰ���Ϊ��"+um[flag].getMoney());
	}
	//3.ת��	
	public boolean transfer(String number,int money) {
		for(int i = 0 ; i<um.length;i++) {
			if(um[i]==null) {
				return false;
			}
			if(um[i].getNumber().equals(number)) {
				um[flag].takeMoney(money);
				um[i].addMoney(money);
				System.out.println(um[flag]);
				System.out.println(um[i]);
				return true;
			}
		}
		return false;
	}
	//4.�����
	public void query() {
		System.out.println(um[flag]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
