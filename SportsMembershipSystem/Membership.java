package SportsMembershipSystem;

public interface Membership {
    public double calculateMonthlyFee(int age, MembershipType type);
    public double calculateDiscountedFee(double baseFee, int visits);
}
