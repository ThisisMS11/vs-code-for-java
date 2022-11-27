import java.util.*;
class Player {

    String name, team;
    int jersey;
    Scanner sc = new Scanner(System.in);

    void Inputplayer() {
        System.out.println("Enter player Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter team: ");
        this.team = sc.nextLine();
        System.out.println("Enter jersey Number: ");
        this.jersey = sc.nextInt();
    }

    void Outputplayer() {
        System.out.println("Player Name: " + name);
        System.out.println("Team: " + team);
        System.out.println("Jersey Number: " + jersey);
    }
}

class Compare extends Player {
    void check(Player a, Player b) {
        if ((a.name).equals(b.name) && (a.team).equals(b.team) && a.jersey == b.jersey) {
            System.out.println("Player Exists");
        } else {
            System.out.println("Player does not exist");
        }
    }
}

class BCS133_W8P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        Compare compare = new Compare();
        player1.Inputplayer();
        player2.Inputplayer();
        compare.check(player1, player2);
        sc.close();
    }
}
