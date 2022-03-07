package GB_JC_HW1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    // lets begin
    public static void main(String[] args) {

        Team team = new Team();
        team.printTeamInf();

        Member[] members = new Member[4];
        members[0] = new Member("Alex","Abra", 5, 50, 9);
        members[1] = new Member("Boris","Britva", 5, 5,3);
        members[2] = new Member("Coca","Colya", 40, 20,5);
        members[3] = new Member("Dasha","Dvezda", 25, 30,4);


        System.out.println("***** START");

        for (int y = 0; y < members.length; y++) {

            int distance = 25;
            int weight = 25;
            int jump = 4;
            System.out.println("The distance is " + distance + "; weight is " + weight + "; jump is " + jump);
            if (members[y].maxStr >= weight && members[y].maxSpeed >= distance && members[y].maxJump >= jump) {
                System.out.println(members[y].firstName + " " + members[y].lastName + " passed! Congratulations! Here is your candy");
            } else if (members[y].maxStr >= weight && members[y].maxSpeed < distance && members[y].maxJump >= jump) {
                System.out.println(members[y].firstName + " " + members[y].lastName + ", you're strong, but slow!");
            } else if (members[y].maxStr < weight && members[y].maxSpeed >= distance && members[y].maxJump >= jump) {
                System.out.println(members[y].firstName + " " + members[y].lastName + ", you're fast, but weak");
            } else if (members[y].maxStr < weight && members[y].maxSpeed < distance && members[y].maxJump < jump) {
                System.out.println(members[y].firstName + " " + members[y].lastName + ", why did you came here? Go home...");
            }
        }
    }
}
