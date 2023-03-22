public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for(int i = 0; i<array2d[0].length;i++){
            sum = sum + array2d[0][i];
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        int sum;
        boolean check = true;
        for(int i = 1;i<array2d.length;i++){
            sum = 0;
            for(int j = 0;j<array2d[1].length;j++){
                sum = sum + array2d[i][j];
            }
            if (sum != checkSum){
                check = false;
                break;
            }
        }
        return check;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        int sum;
        boolean check = true;
        for(int i = 0;i<array2d[1].length;i++){
            sum = 0;
            for(int j = 0;j<array2d.length;j++){
                sum = sum + array2d[j][i];
            }
            if (sum != checkSum){
                check = false;
                break;
            }
        }
        return check;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {{
        int sum1 = 0;
        int sum2 = 0;
        boolean check = false;
        for(int i = 0;i<array2d.length;i++){
            sum1 = sum1 + array2d[i][i];
        }
        for (int j = 0;j<array2d.length;j++){
            sum2 = sum2 + array2d[j][array2d.length-1-j];
        }
        if ((sum1 == checkSum) && (sum2 == checkSum)) {
            check = true;
        }
        System.out.println(check);
        return check;
        }
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        boolean check = false;
        int checkSum = calculateCheckSum(array2d);
        if(magicRows(array2d, checkSum) && magicColumns(array2d,checkSum) && magicDiagonals(array2d,checkSum)){
            check = true;
        }
        return check;
    }

}
