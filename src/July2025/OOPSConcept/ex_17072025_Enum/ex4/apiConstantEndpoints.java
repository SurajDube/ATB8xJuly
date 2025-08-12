package July2025.OOPSConcept.ex_17072025_Enum.ex4;

public enum apiConstantEndpoints {

    BASE_URL("www.google.co.in/"),
    BOOKS_URL("www.books.google.com/"),
    GMAIL_URL("www.Gmail.com");

    private String name;

    public String getName() {//getter
        return name;
    }
    apiConstantEndpoints(String name) {//constructor
        this.name = name;
    }
}

