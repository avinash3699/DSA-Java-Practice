public class Q3 {
    
    public static void main(String[] args) {

        // int salary = 1100000; // Eleven Lacs
        // int salary = 5500000; // Fifty Five Lacs ONLY
        int salary = 200000; // Two Lacs

        double taxAmount = getIncomeTax(salary);

        System.out.printf("Tax Amount for salary %d is %f", salary, taxAmount);

    }

    private static double getIncomeTax(int salary) {

        float salaryInLakhs = salary/100000.0f;
        
        double incomeTaxLiability = 0;
        double incomeTax = getIncomeTaxOnTaxableIncome(salaryInLakhs);
        double surcharge = getSurcharge(salaryInLakhs, incomeTax);

        incomeTaxLiability = incomeTax + surcharge;

        double healthAndEduCess = (incomeTaxLiability * 0.04);

        incomeTaxLiability += healthAndEduCess;

        System.out.println("Income Tax " + incomeTax);
        System.out.println("surcharge " + surcharge);
        System.out.println("Health and Edu cess " + healthAndEduCess);

        return incomeTaxLiability;
    }

    private static double getIncomeTaxOnTaxableIncome(float salaryInLakhs) {
        
        double incomeTax = 0.0;

        if(salaryInLakhs > 15.0){
            double subtractedIncome = salaryInLakhs - 15.0;
            incomeTax += (subtractedIncome * 0.3);
            salaryInLakhs -= subtractedIncome;
        }

        if(salaryInLakhs > 12.5){
            double subtractedIncome = salaryInLakhs - 12.5;
            incomeTax += (subtractedIncome * 0.25);
            salaryInLakhs -= subtractedIncome;
        }

        if(salaryInLakhs > 10.0){
            double subtractedIncome = salaryInLakhs - 10.0;
            incomeTax += (subtractedIncome * 0.2);
            salaryInLakhs -= subtractedIncome;
        }

        if(salaryInLakhs > 7.5){
            double subtractedIncome = salaryInLakhs - 7.5;
            incomeTax += (subtractedIncome * 0.15);
            salaryInLakhs -= subtractedIncome;
        }

        if(salaryInLakhs > 5.0){
            double subtractedIncome = salaryInLakhs - 5.0;
            incomeTax += (subtractedIncome * 0.1);
            salaryInLakhs -= subtractedIncome;
        }

        if(salaryInLakhs > 2.5){
            double subtractedIncome = salaryInLakhs - 2.5;
            incomeTax += (subtractedIncome * 0.05);
            salaryInLakhs -= subtractedIncome;
        }

        return incomeTax * 100000;
    }

    private static double getSurcharge(float salaryInLakhs, double incomeTax) {
        
        double surcharge = 0.0;

        if(salaryInLakhs > 500.0)
            surcharge = (incomeTax * 0.37);

        else if(salaryInLakhs > 200.0)
            surcharge = (incomeTax * 0.2);
        
        else if(salaryInLakhs > 100.0)
            surcharge = (incomeTax * 0.15);

        else if(salaryInLakhs > 50.0)
            surcharge = (incomeTax * 0.1);

        return surcharge;
    }

}