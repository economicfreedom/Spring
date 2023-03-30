package 미니.규하;

import java.util.regex.Pattern;




public class InputCheck {	
	private String name;
	private String addres;
	private String gender;
	private String phoneNum;
	private int year;
	private int select;
	
	
	public boolean checkName() {
		if(Pattern.matches("[가-힣]*$", name)) {
			setName(name);
			return true;
			}
		return false;	
	}
	public boolean checkAddres() {
		
		if (Pattern.matches("[a-zA-z]*$", addres)) 
			return false;
		else
			if(addres.contains("[0-9]")) {
				setAddres(addres);
				return true;
				}
		return false;
	}
	public boolean checkYear() {
		int checker = year%10;
		String a = ((checker+1)%2==0)?"남자":"여자";
				
		
		if(year<9912315) {
			if (checker<5) {
				setYear(year);
				setGender(a);
				return true;
			}
		}
		return false;
	}
	
	public boolean checkPhoneNum(String phoneNum) {
		
		if (p) {
			
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}

//쓸 일이 올까 이걸?
//if (Pattern.matches("[0-9]*$", year)) {
//	if (year.length()==7) {
//		if (Pattern.matches("[1-4]", year.substring(6))) {
//			return true;
//		}else {
//			return false;
//		}
//	}else {
//		return false;
//	}
//}else {
//	return false;
//}
