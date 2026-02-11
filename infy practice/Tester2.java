
public class Tester2 {

    public static void main(String[] args) {
        // Case 1: Valid Public 'H' Movie (Expected 4019000)
        Model m1 = new Model(23534, 35000.0); 
        AdMovies ad1 = new AdMovies("public", m1, 10.0, 'H');
        System.out.println("Valid 'H' Case: " + ad1.calculateQuotationAmount());

        // Case 2: Invalid Model Remuneration for Grade
        // Grade 1 (from 12345) range is 25000 < x <= 30000
        Model m2 = new Model(12345, 40000.0); 
        AdMovies ad2 = new AdMovies("Government", m2, 5.0, 'A');
        System.out.println("Invalid Remuneration Case: " + ad2.calculateQuotationAmount()); 
        // Expected: -1 

        // Case 3: Invalid Shooting Days
        Model m3 = new Model(34567, 50000.0);
        AdMovies ad3 = new AdMovies("Private", m3, 101.0, 'L');
        System.out.println("Invalid Days Case: " + ad3.calculateQuotationAmount()); 
        // Expected: -1 
    }
}

class AdAgencyService {
    protected String quotationId;
    private String customerType;
    private Model model;
    private static int counter = 1001;

    public AdAgencyService(String customerType, Model model) {
        this.customerType = customerType;
        this.model = model;
        identifyCustomerType();

        // Generate quotationId: First 3 letters of customerType (uppercase) + counter
        this.quotationId = getCustomerType().substring(0, 3).toUpperCase() + counter;
        counter++; // Incrementing counter for the next service instance
    }

    public String getCustomerType() {
        return customerType;
    }

    public Model getModel() {
        return model;
    }

    public void identifyCustomerType() {
        // Case-insensitive validation of customer type
        if (!(customerType.equalsIgnoreCase("Government") ||
                customerType.equalsIgnoreCase("Public") ||
                customerType.equalsIgnoreCase("Private"))) {
            customerType = "Private";
        }
    }

    public long calculateQuotationAmount() {
        return 500L; // Base quotation amount
    }
}

class Model {
    private int modelId;
    private int modelGrade;
    private double remunerationPerDay;
    private static double[] modelRemuneration = { 25000.0, 30000.0, 45000.0, 57500.0, 100000.0, 150000.0 };

    public Model(int modelId, double remunerationPerDay) {
        this.modelId = modelId;
        this.remunerationPerDay = remunerationPerDay;
        this.modelGrade = modelId / 10000;

    }

    public int getModelId() {
        return modelId;
    }

    public int getModelGrade() {
        return modelGrade;
    }

    public double getRemunerationPerDay() {
        return remunerationPerDay;
    }

    public static double[] getModelRemuneration() {
        return Model.modelRemuneration;
    }

    public Boolean validateRemunerationPerDay() {
        // modelGrade determines the maxLimit; the previous index is the minLimit
        double maximumLimit = Model.modelRemuneration[modelGrade];
        double minimumLimit = Model.modelRemuneration[modelGrade - 1];

        if (this.getRemunerationPerDay() > minimumLimit && this.getRemunerationPerDay() <= maximumLimit) {
            return true;
        }
        return false;
    }
}

class AdMovies extends AdAgencyService {
    private double noOfDaysOfShooting;
    private char typeOfAdMovie;

    public AdMovies(String customerType, Model model, double noOfDaysOfShooting, char typeOfAdMovie) {
        super(customerType, model);
        this.noOfDaysOfShooting = noOfDaysOfShooting;
        this.typeOfAdMovie = typeOfAdMovie;
    }

    public double getNoOfDaysOfShooting() {
        return noOfDaysOfShooting;
    }

    public Boolean validateNoOfDaysOfShooting() {
        if (this.getNoOfDaysOfShooting() >= 2.0 && this.getNoOfDaysOfShooting() <= 100.0) {
            return true;
        }
        return false;
    }

    public Boolean validateTypeOfAdMovie() {
        // Case-sensitive validation as per requirements
        return typeOfAdMovie == 'H' || typeOfAdMovie == 'A' || typeOfAdMovie == 'L';
    }

    @Override
public long calculateQuotationAmount() {
    if (this.validateTypeOfAdMovie() &&
        this.validateNoOfDaysOfShooting() &&
        super.getModel().validateRemunerationPerDay()) {

        int budget = 0;
        double serviceChargePct = 0.0;
        if (this.typeOfAdMovie == 'H') {
            budget = 2500000;
            serviceChargePct = 25.25;
        } else if (this.typeOfAdMovie == 'A') {
            budget = 2000000;
            serviceChargePct = 17.5;
        } else if (this.typeOfAdMovie == 'L') {
            budget = 1500000;
            serviceChargePct = 12.75;
        }

        double taxPct = 0.0;
        // Requirement: Perform case-insensitive comparison 
        String cType = super.getCustomerType();
        if (cType.equalsIgnoreCase("Government")) {
            taxPct = 0.0;
        } else if (cType.equalsIgnoreCase("Public")) {
            taxPct = 15.75;
        } else if (cType.equalsIgnoreCase("Private")) {
            taxPct = 20.25;
        }

        long actualDays = (long) Math.floor(this.getNoOfDaysOfShooting());
        
        // totalBudget = budget + remunerationPerDay * actualNumberofShootingDays [cite: 257, 365]
        double baseBudget = budget + (super.getModel().getRemunerationPerDay() * actualDays);

        // Calculate serviceCharge and taxAmount on totalBudget 
        double serviceChargeAmount = (baseBudget * serviceChargePct / 100.0);
        double taxAmount = (baseBudget * taxPct / 100.0);

        // Final total is baseBudget + serviceCharge + taxAmount + baseQuotationAmount [cite: 267, 269, 368, 370]
        double finalQuotation = baseBudget + serviceChargeAmount + taxAmount + super.calculateQuotationAmount();

        return (long) finalQuotation;
    }
    return -1L;
}
}