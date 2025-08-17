package SportsMembershipSystem;

public class Member implements Membership{

    String name;
    int age;
    MembershipType membershipType;
    int visits;

    public Member(String name, int age, MembershipType membershipType, int visits) {
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.visits = visits;
    }

    @Override
    public double calculateMonthlyFee(int age, MembershipType type) {
        return type.fee(age);
    }

    @Override
    public double calculateDiscountedFee(double baseFee, int visits) {
        if (visits <= 4){
            return baseFee;
        }
        if(visits <= 9 && visits >= 5){
            return baseFee * 95/100;
        }
        if(visits <= 14 && visits >= 10){
            return baseFee * 90/100;
        }
        if(visits >= 15){
            return baseFee * 85/100;
        }
        return baseFee;
    }

}



