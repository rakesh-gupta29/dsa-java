package Arrays;

public class RoboReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(isOrigin(moves));

    }

    public static boolean isOrigin(String moves) {
        int UD = 0, LR = 0;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U':
                    UD++;
                    break;
                case 'D':
                    UD--;
                    break;
                case 'R':
                    LR++;
                    break;
                case 'L':
                    LR--;

            }
        }
        return UD== 0 && LR == 0 ;
    }
}
