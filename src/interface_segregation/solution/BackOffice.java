package interface_segregation.solution;

public class BackOffice implements IGenerateSalesReportExecel, IGenerateSalesReportPDF{

    @Override
    public void generateExcel() {
        System.out.println("Thank you, and congratulations on the work in Execel.");
    }

    @Override
    public void generatePDF() {
        System.out.println("Thank you, and congratulations on the work in PDF.");
    }
    
}
