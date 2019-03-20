import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient  {
    	 String name;
    	 String address;
    	 String phone;
    	 int gender;
    	 int fileNumber;
    	 String regDate;
    	
  public Patient() {
  	
  }
  public String getName(){
    		return name;
    	}
    	
  public String getAddress(){
    		return address;
    	}
    	
  public String getPhone(){
    		return phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
    	}
    	
  public String getGender(){
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
    	
  public int getFileNumber(){
    		return fileNumber;
    	}
    	
  public Date getRegDate() throws ParseException{
    		String date =regDate;
    		String format = "MMddyyyy";
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