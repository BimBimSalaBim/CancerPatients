import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		CancerPatient cp= new CancerPatient();
/*//		For user input
 		Scanner in = new Scanner(System.in);
		out("What is name");
		cp.setName(in.nextLine());
    	out("What is Address");
    	cp.setAddress(in.nextLine());
    	out("What is Phone");
    	cp.setPhone(in.nextLine());
    	out("What is gender (0 for Male 1 for Female)");
    	cp.setGender(in.nextInt());
    	out("What is File Number");
    	cp.setFileNumber(in.nextInt());
    	out("What is reg date (MMDDYYYY)");
    	cp.setRegDate(in.next());
    	out("what is the cancer type?");
    	cp.setCancerType(in.next());
		out("what is the cancer Stage (1,2 or 3)");
		cp.setCancerStage(in.nextInt());
		out("what is the diagnoses Date (MMDDYYYY)");
		cp.setDiagnosesDate(in.next());
		out("How many meds are there?");
		int i = in.nextInt();
		String[] medication = new String[i];
		for(int j = 0; i > j; j++) {
			out("What is med "+(j+1));
			medication[j] = in.next();
		}
		cp.setMedication(medication);
		*/
		String[] meds2= {"meds3", "meds4"};
		cp.setName("John Doe");
		out("Patient Name: "+cp.getName() +"\n");
		cp.setGender(3);
		cp.setGender(1);
		out("Gender is: "+cp.getGender() +"\n");
		cp.setAddress("123 some street");
		out("Address is: "+cp.getAddress()+"\n");
		cp.setPhone("3102345678");
		out("Phone Number is: "+cp.getPhone()+"\n");
		cp.setFileNumber(1111);
		out("File Number is: "+cp.getFileNumber()+"\n");
		cp.setDiagnosesDate("01222019");
		out("Diagnoses Date is: "+cp.getDiagnosesDate()+"\n");
		cp.setRegDate("03122018");
		out("Reg Date is: "+cp.getRegDate()+"\n");
		cp.setCancerType("Bone");
		out("Type Of Cancer is: "+cp.getCancerType()+"\n");
		cp.setCancerStage(5);
		cp.setCancerStage(2);
		out("Current stage: "+cp.getCancerStage()+"\n");
		cp.setMedication(meds2);
		out("Medication list: "+cp.getMedication());

	}

	public static void out(String out) {
		System.out.println(out);
	}
}
