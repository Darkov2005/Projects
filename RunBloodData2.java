import java.util.Scanner;

class BloodData2 {
    private String bloodType;
    private String rhFactor;
    
    public BloodData2() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }
    
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
    
    public String getBloodType() {
        return this.bloodType;
    }
    
    public String getRhFactor() {
        return this.rhFactor;
    }
    
    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}

public class RunBloodData2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BloodData2 bd = new BloodData2();
        
        System.out.print("Enter blood type of patient: ");
        String bloodTypeInput = sc.nextLine();
        
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFactorInput = sc.nextLine();
        
        if (!bloodTypeInput.isEmpty()) {
            bd.setBloodType(bloodTypeInput);
        }
        if (!rhFactorInput.isEmpty()) {
            bd.setRhFactor(rhFactorInput);
        }
        
        bd.display();
        
        sc.close();
    }
}
