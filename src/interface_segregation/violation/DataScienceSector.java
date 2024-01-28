package interface_segregation.violation;

public class DataScienceSector implements IGenerateSalesReport{

    @Override
    public void generateExcel() {
        System.out.println("dataScience used");
    }

    @Override
    public void generatePDF() {
       System.out.println("never used");
    }
    
}
