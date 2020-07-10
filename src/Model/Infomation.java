package Model;

public class Infomation {
 public String ID;
 public String FullName;
 public int Sex;
 public String Village;
 public String Address;
 
public Infomation(String iD, String fullName, int sex, String village, String address) {
	super();
	ID = iD;
	FullName = fullName;
	Sex = sex;
	Village = village;
	Address = address;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
public int getSex() {
	return Sex;
}
public void setSex(int sex) {
	Sex = sex;
}
public String getVillage() {
	return Village;
}
public void setVillage(String village) {
	Village = village;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}

}
