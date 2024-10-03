import java.util.Scanner;

class BloodData {
    static String bloodType;
    static String rhFactor;
    
    public BloodData() {
        bloodType = "0";
        rhFactor = "+";
    }
    
    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }
    
    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter blood type of patient: ");
        String bloodTypeInput = in.nextLine();
        
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFactorInput = in.nextLine();
        
        BloodData bd;
        if (bloodTypeInput.isEmpty() || rhFactorInput.isEmpty()) {
            bd = new BloodData();
        } else {
            bd = new BloodData(bloodTypeInput, rhFactorInput);
        }
        
        bd.display();
        
        in.close();
    }
}