package lec6_Patterns;

public class main {
    public static void main(String[] args) {
        // Solid Rectangle Pattern
        // solidRect();

        // Hollow Rectangle Pattern
        hollowRect();
    }

    static void hollowRect() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == 3 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    static void solidRect() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
