package Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] img = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        roateCW(img);
        print(img);
    }

    static void roateCW(int[][] img) {
        for (int i = 0; i < img.length; i++) {
            for (int j = i; j < img.length; j++) {
                int temp = img[i][j];
                img[i][j] = img[j][i];
                img[j][i] = temp;
            }
        }
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length /2 ; j++) {
              int temp = img [ i] [ j] ;
              img [ i] [ j] = img[ i] [ img.length -1 - j ] ;
              img [i][ img.length - 1- j]  = temp ;
            }
        }
    }

    static void print(int[][] rotatedImg) {
        for (int[] row : rotatedImg) {
            for (int elem : row) {
                System.out.print(elem + ", ");
            }
            System.out.println();
        }
    }
}
