import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class CancerPatient extends Patient {
	String Type;
	static int Stage;
	static String diagnosesDate;
	static String[] medication;
	public CancerPatient(String cancerType, int cancerStage,String cancerdiagnosesDate,String[] cancermedication) {
		super(name, address, phone, gender, fileNumber, regDate);
		Type = cancerType;
		Stage = cancerStage;
		diagnosesDate = cancerdiagnosesDate;
		medication = cancermedication;
	}  
	 String getCancerType(){
		return Type;
	}
	int getCancerStage() {
		return Stage;
		
	}
	Date getDiagnosesDate() throws ParseException {
		String date =diagnosesDate;
		String format = "MMddyyyy";
		return new SimpleDateFormat(format).parse(date);
		
	}
	String getMedication(){
		return Arrays.toString(medication);
		
	}
	void setCancerType(String cancerType){
		Type = cancerType;
	}
	void setCancerStage(int cancerStage) {
		if(cancerStage >= 0 && cancerStage <=3) {
		Stage = cancerStage;
		}
		else {
			System.out.println("Cancer Stage is not valid");
		}
		
	}
	void setDiagnosesDate(String DiagnosesDate) {
		diagnosesDate = DiagnosesDate;
		
	}
	void setMedication(String[] Medication){
		medication = Medication;
		
	}
	
}
