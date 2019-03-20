import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
/*		For user input
 		Scanner in = new Scanner(System.in);
		out("What is name");
    	String name = in.nextLine();
    	out("What is Address");
    	String address = in.nextLine();
    	out("What is Phone");
    	String phone = (int) in.nextLine();
    	out("What is gender (0 for Male 1 for Female)");
    	int gender = in.nextInt();
    	out("What is File Number");
    	int fileNumber = in.nextInt();
    	out("What is reg date (MMDDYYYY)");
    	String regDate = in.nextLine();
    	
    	out("what is the cancer type?");
		String Type = in.next();
		out("what is the cancer Stage (1,2 or 3)");
		int Stage = in.nextInt();
		out("what is the diagnoses Date (MMDDYYYY)");
		String diagnosesDate = in.nextLine();
		out("How many meds are there?");
		int i = in.nextInt();
		String[] medication = new String[i];
		for(int j = 0; i > j; j++) {
			out("What is med "+(j+1));
			medication[j] = in.nextLine();
		}*/
		String[] meds = {"meds1", "meds2"};
		Patient Patient = new Patient("Name of person", "Address of person", "9999999999", 0, 343243243,"03182019"/*name, address, phone, gender, fileNumber, regDate*/);	
		CancerPatient cp= new CancerPatient("Brain",3,"03182019",meds/*Type, Stage, diagnosesDate, medication*/);

		String[] meds2= {"meds3", "meds4"};
		out("Patient: "+cp.getName());
		cp.setName("John Doe");
		out("New Patient Name: "+cp.getName() +"\n");
		out("Gender is: "+cp.getGender());
		cp.setGender(3);
		cp.setGender(1);
		out("New Gender is: "+cp.getGender() +"\n");
		out("Address is: "+cp.getAddress());
		cp.setAddress("123 some street");
		out("New Address is: "+cp.getAddress()+"\n");
		out("Phone Number is: "+cp.getPhone());
		cp.setPhone("3102345678");
		out("New Phone Number is: "+cp.getPhone()+"\n");
		out("File Number is: "+cp.getFileNumber());
		cp.setFileNumber(1111);
		out("New File Number is: "+cp.getFileNumber()+"\n");
		out("Diagnoses Date is: "+cp.getDiagnosesDate());
		cp.setDiagnosesDate("12231995");
		out("New Diagnoses Date is: "+cp.getDiagnosesDate()+"\n");
		out("Reg Date is: "+cp.getRegDate());
		cp.setRegDate("03222018");
		out("New Reg Date is: "+cp.getRegDate()+"\n");
		out("Type Of Cancer is: "+cp.getCancerType());
		cp.setCancerType("Bone");
		out("New Type Of Cancer is: "+cp.getCancerType()+"\n");
		out("Current stage: "+cp.getCancerStage());
		cp.setCancerStage(5);
		cp.setCancerStage(2);
		out("New Current stage: "+cp.getCancerStage()+"\n");
		out("Medication list: "+cp.getMedication());
		cp.setMedication(meds2);
		out("New Medication list: "+cp.getMedication());

	}

	public static void out(String out) {
		System.out.println(out);
	}
}
