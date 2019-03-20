import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient  {
    	static String name;
    	static String address;
    	static String phone;
    	static int gender;
    	static int fileNumber;
    	static String regDate;
    	
  public Patient(String Patientname,String Patientaddress,String Patientphone,int Patientgender,int PatientfileNumber,String PatientregDate) {
  	name = Patientname;
  	address = Patientaddress;
  	phone = Patientphone;
  	gender = Patientgender;
  	fileNumber = PatientfileNumber;
  	regDate = PatientregDate;  	
  }
    	String getName(){
    		return name;
    	}
    	
    	String getAddress(){
    		return address;
    	}
    	
    	String getPhone(){
    		return phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
    	}
    	
    	String getGender(){
    		if(gender == 0) {
    			return "Male";
    		}
    		else if(gender == 1){
    			return "Female";
    		}
    		else {
    			return "please set gender Male or Female";
    		}
    	}
    	
    	int getFileNumber(){
    		return fileNumber;
    	}
    	
    	Date getRegDate() throws ParseException{
    		String date =regDate;
    		String format = "MMDDYYYY";
    		return new SimpleDateFormat(format).parse(date);
    	}
    	
    	public void setName(String nameIn){
    		name = nameIn;
    	}
    	
    	public void setAddress(String addressIn){
    		address = addressIn;
    	}
    	
    	public void setPhone(String phoneIn){
    		phone = phoneIn;
    	}
    	
    	public void setGender(int genderIn){
    		if(genderIn >= 0 && genderIn <=1) {
    			gender = genderIn;
    			}
    			else {
    				System.out.println("Gender is not valid");
    			}
    	}
    	
    	public void setFileNumber(int fileNumberIn){
    		fileNumber = fileNumberIn;
    	}
    	
    	public void setRegDate(String regDateIn){
    		regDate = regDateIn;
    	}

}