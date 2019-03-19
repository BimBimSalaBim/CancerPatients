import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Scanner in = new Scanner(System.in);
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
    	String regDate = in.nextLine();*/
		
		Patient Patient;
		Patient = new Patient("Name of person", "Address of person", "9999999999", 0, 343243243,"03182019"/*name, address, phone, gender, fileNumber, regDate*/);	
		CancerPatient cp;
	/*	out("what is the cancer type?");
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
		cp = new CancerPatient("Brain",3,"03182019",meds/*Type, Stage, diagnosesDate, medication*/);
		CancerPatient.setCancerStage(2);
		System.out.println("Patient "+CancerPatient.getName());
		System.out.println("Current stage: "+CancerPatient.getCancerStage());
	}

	public static void out(String out) {
		System.out.println(out);
	}
}
