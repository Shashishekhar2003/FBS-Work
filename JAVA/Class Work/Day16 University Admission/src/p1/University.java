package p1;

class AdmissionForm {
    String studentName;
    int age;
    double percentage;
    double courseFees;
    double feesPaid;

    AdmissionForm(String studentName, int age, double percentage, double courseFees, double feesPaid) {
        this.studentName = studentName;
        this.age = age;
        this.percentage = percentage;
        this.courseFees = courseFees;
        this.feesPaid = feesPaid;
    }

    void validateForm() throws EmptyNameException, UnderageException, InvalidPercentageException,
            NotFitForAdmissionException, FeesNotPaidException, InsufficientFeesException {
        
        // FIXED: Correct check for empty name
        if (this.studentName == null || this.studentName.trim().isEmpty()) {
            throw new EmptyNameException();
        }

        if (this.age < 17) {
            throw new UnderageException();
        }

        if (this.percentage < 0 || this.percentage > 100) {
            throw new InvalidPercentageException();
        }

        if (this.percentage < 35) {
            throw new NotFitForAdmissionException();
        }

        if (this.feesPaid == 0) {
            throw new FeesNotPaidException();
        }

        double minFees = courseFees * 0.30;

        if (feesPaid < minFees) {
            throw new InsufficientFeesException();
        }
    }
}
