
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here

//        MagicSquareFactory msFactory = new MagicSquareFactory();
//        System.out.println(msFactory.createMagicSquare(5));
        MagicSquare ms = new MagicSquare(2);

        System.out.println(ms.sumsOfDiagonals());
    }
}
