import java.util.*;
import java.util.Scanner;

class Sports {
    public String get_name() {
        return "Generic Sports";
    }

    public void get_number_of_team_members() {
        System.out.println("Each team has n players in " + get_name());
    }
}

class Soccer extends Sports {
    public String get_name() {
        return "Soccer Class";
    }

    public void get_number_of_team_members() {
        System.out.println("Each team has 11 players in " + get_name());
    }
}

public class Mohit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sports s = new Sports();
        Soccer so = new Soccer();
        s.get_number_of_team_members();
        so.get_number_of_team_members();
        sc.close();
    }
}
