
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder stringbuilder = new StringBuilder();
        String output = "";
        for (int row = 0; row < array.length; row++) {
            output += "\n";
            for (int column = 0; column < array[row].length; column++) {
                output += array[row][column];
            }
        }
        return output;
    }

}
