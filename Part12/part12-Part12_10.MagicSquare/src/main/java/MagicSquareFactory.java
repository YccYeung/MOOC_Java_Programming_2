
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here

        //        row
        //      0  1  2
        //   0     1  6     column       1: (1, 0)  2: (2, 2)  3: (0, 1)  4: (0, 2)  5: (1, 1)  6: (2, 0)
        //   1  3  5
        //   2  4     2
        
        int row = size/2;
        int column = 0;
        int num = 1;

        square.placeValue(row, column, num);

        while (num != size*size) {

            int currentRow = row;
            int currentColumn = column;

            row++;
            if (row == size) {
                row = 0;
            } 
            
            column--;
            if (column == -1) {
                column = size - 1;
            } 

            if (square.readValue(row, column) != 0) {
                currentColumn++;
                column = currentColumn;
                row = currentRow;
            } 

            num++;
            square.placeValue(row, column, num);
            
        }

        return square;
    }      
     
}


