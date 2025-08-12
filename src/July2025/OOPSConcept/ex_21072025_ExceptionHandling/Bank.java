package July2025.OOPSConcept.ex_21072025_ExceptionHandling;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception {    // Throws for announcment
        if (!bankName.currency.equalsIgnoreCase("INR")) {
            throw new Exception("Currency mismatch Cant proceed");
        } return bankName.amount + this.amount;
    }
}

