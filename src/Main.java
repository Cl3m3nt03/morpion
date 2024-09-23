import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Initilisation dataValues
    static int player1 = 1;
    static int player2 = 2;
    // Initialisation valeur max
    static int xMax = 3, yMax = 3;

    // Initilisation d'un tableau en 4 par 5
    static int[][] carre = new int[xMax][yMax];

    public static void main(String[] args) {
        game();
        showMap();

    }

    public static void showMap() {
        StringBuilder visuel = new StringBuilder();

        for (int yCoord = 0; yCoord < yMax; yCoord++) {
            for (int xCoord = 0; xCoord < xMax; xCoord++) {
                visuel.append(carre[xCoord][yCoord]);
            }
            visuel.append("\n");
        }

        System.out.println(visuel);
    }

    public static void verification() {

        if(!=int i = 0;){

        }
    }

    public static boolean game() {

        for (int i = 0; i < 9999; i++) {

            System.out.println("Choisi ta ligne");
            Scanner scanner = new Scanner(System.in);
            int ligne = scanner.nextInt();

            System.out.println("Choisi ta colonne");
            Scanner scanner1 = new Scanner(System.in);
            int col = scanner.nextInt();

            carre[ligne][col] = player1;

            showMap();

            System.out.println("Choisi ta ligne");
            Scanner scanner2 = new Scanner(System.in);
            int ligne2 = scanner2.nextInt();

            System.out.println("Choisi ta colonne");
            Scanner scanner3 = new Scanner(System.in);
            int ligne3 = scanner2.nextInt();

            carre[ligne2][ligne3] = player2;

        }
    }

//    public static boolean end(){
//        return ((carre[0][0]==carre[0][1])&&(carre[0][0]==carre[0][2]))
//                ||((carre[1][0]==carre[1][1])&&(carre[1][0]==carre[1][2]))
//                ||((carre[2][0]==carre[2][1])&&(carre[2][0]==carre[2][2]))
//                ||((carre[0][0]==carre[1][0])&&(carre[0][0]==carre[2][0]))
//                ||((carre[0][1]==carre[1][1])&&(carre[0][1]==carre[2][1]))
//                ||((carre[0][2]==carre[1][2])&&(carre[0][2]==carre[2][2]))
//                ||((carre[0][0]==carre[1][1])&&(carre[0][0]==carre[2][2]))
//                ||((carre[0][2]==carre[1][1])&&(carre[0][2]==carre[2][0]));
//    }
}