import java.util.Arrays;

public class CancerPatient extends Patient {
	static String Type;
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
	static String getcancerType(){
		return Type;
	}
	static int getCancerStage() {
		return Stage;
		
	}
	static String getDiagnosesDate() {
		return diagnosesDate;
		
	}
	static String getMedication(){
		return Arrays.toString(medication);
		
	}
	static void setCancerType(String cancerType){
		Type = cancerType;
	}
	static void setCancerStage(int cancerStage) {
		Stage = cancerStage;
		
	}
	static void setDiagnosesDate(String DiagnosesDate) {
		diagnosesDate = DiagnosesDate;
		
	}
	static void setMedication(String[] Medication){
		medication = Medication;
		
	}
	
}
