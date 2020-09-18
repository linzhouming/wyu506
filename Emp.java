package Myhomework;

import java.sql.Date;
import java.text.DateFormat;
import java.io.Serializable;

public class Emp  implements Serializable{
     private String name;
     private int  age;
     private String gender;
     private int salay;
     private String hiredate;
     private static final long serialVersionUID = 1L;
     
     public Emp(String name, int  age,String gender, int salay, String hirdate) {
    	   this.name = name;
    	   this.age = age;
    	   this.gender = gender;
    	   this.salay = salay;
    	   this.hiredate = hirdate;				
	}
		
	
	public static void main(String[] args) {
		
		
		Emp e = new Emp("张三",25,"男",5000,"2020-01-11");
		Emp e1 = new Emp("张三",26,"男",5000,"2020-02-15");
		System.out.println(e);
        System.out.println(e.equals(e1));
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalay() {
		return salay;
	}
	public void setSalay(int salay) {
		this.salay = salay;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", gender=" + gender + ", salay=" + salay + ", hiredate="
				+ hiredate + "]";
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
//		result = prime * result + ((hiredate == null) ? 0 : hiredate.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + salay;
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hiredate == null) {
			if (other.hiredate != null)
				return false;
		} else if (!hiredate.equals(other.hiredate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salay != other.salay)
			return false;
		return true;
	}

}
