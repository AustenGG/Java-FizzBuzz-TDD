public class FIZZBUZZ {
    private String name;
    private int number;

    public void name (String name) {
        this.name = name;

    }

    public String getName() {
        return "Welcome to fizzbuzz "+name;
    }

    public int returnNumber(int number) {
        this.number = number;
        return number;
    }

}
