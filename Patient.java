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
    	static String getName(){
    		return name;
    	}
    	
    	static String getaddress(){
    		return address;
    	}
    	
    	static String getPhone(){
    		return phone;
    	}
    	
    	static String getGender(){
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
    	
    	static int getFileNumber(){
    		return fileNumber;
    	}
    	
    	static String getRegDate(){
    		return regDate;
    	}
    	
    	static public void setName(String nameIn){
    		name = nameIn;
    	}
    	
    	static public void setAddress(String addressIn){
    		address = addressIn;
    	}
    	
    	static public void setPhone(String phoneIn){
    		phone = phoneIn;
    	}
    	
    	static public void setGender(int genderIn){
    		gender = genderIn;
    	}
    	
    	static public void setFileNumber(int fileNumberIn){
    		fileNumber = fileNumberIn;
    	}
    	
    	static public void setRegDate(String regDateIn){
    		regDate = regDateIn;
    	}

}