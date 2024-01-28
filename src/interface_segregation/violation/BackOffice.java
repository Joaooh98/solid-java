package interface_segregation.violation;

public class BackOffice implements IGenerateSalesReport {

    @Override
    public void generateExcel() {
        System.out.println("Thank you, and congratulations on the work in Execel.");
    }

    @Override
    public void generatePDF() {
        System.out.println("Thank you, and congratulations on the work in PDF.");
    }
    
}
