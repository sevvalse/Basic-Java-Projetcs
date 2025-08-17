package SportsMembershipSystem;

import java.util.ArrayList;

public class MembershipSystem {
    ArrayList<Member> memberships;

    public MembershipSystem(ArrayList<Member> memberships) {
        this.memberships = memberships;
    }

    public void addMember(Member member) {
        memberships.add(member);
    }

    public void removeMember(Member member) {
        memberships.remove(member);
    }

    public void getMembers(){
        for (Member member : memberships) {
            System.out.println(member);
        }
    }

    public double getMonthlyMembershipRevenue(){
        double total = 0;
        for (Member member : memberships) {
            total += member.calculateDiscountedFee(member.calculateMonthlyFee(member.age, member.membershipType), member.visits);
        }
        return total;
    }

}
