package SportsMembershipSystem;

public enum MembershipType {
    STANDARD, PREMIUM, VIP;

    int fee(int age){
        if (this == VIP){
            return 150;
        }
        if (age < 60){
            if (this == STANDARD){
                return 50;
            }
                if (this == PREMIUM){
                return 80;
            }
        }
        if (age > 60){
            if (this == STANDARD){
                return 30;
            }
            if (this == PREMIUM){
                return 60;
            }
        }
        return 0;
    }

}
