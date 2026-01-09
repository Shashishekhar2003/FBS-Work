package p1;

public class TestUniversity {

    public static void main(String[] args) {

        AdmissionForm AF = new AdmissionForm("Yash", 20, 100, 50000, 50000);

        try {
            AF.validateForm();
            System.out.println("Admission Successful!");
        } 
        catch (EmptyNameException e) {
            System.out.println(e);
        } 
        catch (UnderageException e) {
            System.out.println(e);
        } 
        catch (InvalidPercentageException e) {
            System.out.println(e);
        } 
        catch (NotFitForAdmissionException e) {
            System.out.println(e);
        } 
        catch (FeesNotPaidException e) {
            System.out.println(e);
        } 
        catch (InsufficientFeesException e) {
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println("Unknown error occurred");
        }

    }
}
