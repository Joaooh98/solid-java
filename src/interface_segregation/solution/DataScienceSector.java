package interface_segregation.solution;

public class DataScienceSector implements IGenerateSalesReportExecel{

    @Override
    public void generateExcel() {
        System.out.println("dataScience used");
    }
    
}
