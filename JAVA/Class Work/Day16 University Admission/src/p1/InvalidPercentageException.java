package p1;

public class InvalidPercentageException extends Exception {
    @Override
    public String toString() {
        return "Invalid Percentage! Please enter a valid percentage.";
    }
}
