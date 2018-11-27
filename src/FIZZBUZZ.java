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
    public String results() {
        String result = "";
        for (int i=1; i<=this.number; i++){
            if (i % 15 == 0) {
                result+= "FizzBuzz ";
            } else if (i % 5 == 0) {
                result+= "Fizz ";
            } else if (i % 3 == 0) {
                result+= "Buzz ";
            } else {
                result+= i + " ";
            }
        }
        return result.trim();
    }
}
