package lec4_Conditionals;

public class main {
    public static void main(String[] args) {
        int a = 5, b = 20;
        if (a > b) {
            System.out.println("A is Greater than B");
        } else {
            System.out.println("B is Greater than A");
        }
        switch (a) {
            case 10:
                System.out.println("A is 10");
                break;
            case 20:
                System.out.println("A is 20");
            default:
                System.out.println("A is Default");
                break;
        }
    }
}
