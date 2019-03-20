import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class CancerPatient extends Patient {
	String Type;
	 int Stage;
	 String diagnosesDate;
	 String[] medication;
	public CancerPatient() {
		super();
	}  
	public String getCancerType(){
		return Type;
	}
	public	int getCancerStage() {
		return Stage;
		
	}
	public	Date getDiagnosesDate() throws ParseException {
		String date =diagnosesDate;
		String format = "MMddyyyy";
		return new SimpleDateFormat(format).parse(date);
		
	}
	public	String getMedication(){
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
