package JavaAssessment;

import java.util.*;

public class Student {
	private int prn;
	private String name;
	private String address;
public int getPrn() {
		return prn;
	}
	public void setPrn(int prn) {
		this.prn = prn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
public Student(int prn, String name,String address) {
	this.prn=prn;
	this.name=name;
	this.address=address;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	String s="Student prn: "+getPrn()+"\tName :"+getName()+"\tAddress :"+getAddress();
	return s;
}

public void search(int prn,ArrayList<Integer> array) {
//	for(int i=0;i<array.size();i++) {
//		if(array[i]== prn) {
//			System.out.println("Found the Student. Student information is\n"+ );
//		}
//	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	boolean choose = true;
	ArrayList<Student> studentList = new ArrayList<Student>();
	Scanner scan = new Scanner(System.in);
	while(choose) {
		//add students
		System.out.println("Do you want to add Student Information? Yes-0 No-1");
		int flag = scan.nextInt();
		if(flag == 0) {
			System.out.println("Enter student prn");
			int prn = scan.nextInt();
			System.out.println("Enter student name");
			String name = scan.next();
			System.out.println("Enter student Address");
			String address = scan.next();
			Student s1 = new Student(prn,name,address);
			studentList.add(s1);
		}
		else {
			choose = false;
		}
		
	}
	System.out.println("===============================================================");

	//Find Student
	boolean nonfind = true;
	while(nonfind) {
		System.out.println("Do you want to search student information? Yes-0 No-1");
		int flag1 = scan.nextInt();
		int ctr=0;
		if(flag1==0) {
			System.out.println("Enter student prn");
			int prn = scan.nextInt();
			for(int i =0;i<studentList.size();i++) {
				if(prn==studentList.get(i).getPrn()) {
					System.out.println("Find the student, Information is \n"+studentList.get(i).toString());
				break;
				}
				else{ctr++;}
			}//end loop
			if(ctr>=studentList.size()) {
				System.out.println("Sorry, Not Find the Student");
			}
			
		}
		else {
			nonfind=false;
		}
		}
	
	}
}


