package July2025.OOPSConcept.ex_21072025_ExceptionHandling;

public class Lab159_Bank_CustmomException {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR", 100);
        Bank kotak = new Bank("INR", 234);
        Bank jpmorgan = new Bank("USD", 1000);
        System.out.println(sbi.add(kotak));
        System.out.println(sbi.add(jpmorgan));
        
    }
}

