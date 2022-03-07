package GB_JC_HW1;

public class Team {
    public String name;
    public Member[] members = new Member[4];

    public Team() {
        this.members[0] = new Member("Alex","Abra",5,50, 5);
        this.members[1] = new Member("Boris","Britva", 5, 5,7);
        this.members[2] = new Member("Coca","Colya", 40, 25,2);
        this.members[3] = new Member("Dasha","Dvezda", 25, 30,3);
    }

    public void printTeamInf() {
        name = "Rebzi";
        System.out.println("***** Hello, " + name + "! Welcome to our code!");
        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i].firstName + " " + members[i].lastName);
        }
    }


}
