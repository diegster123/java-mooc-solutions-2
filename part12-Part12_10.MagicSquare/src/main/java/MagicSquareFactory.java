
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Siamese method works only for odd sizes");
        }     
        int n = size;
        int number = 1;
        
        int row = 0;
        int col = n / 2;
        
        while (number <= n * n) {
            square.placeValue(col, row, number);          
            number++;
            
            int nextRow = (row - 1 + n) % n;
            int nextCol = (col + 1) % n;
            
             if (square.readValue(nextCol, nextRow) != 0) {
                row = (row + 1) % n;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }
        return square;
    }

}
