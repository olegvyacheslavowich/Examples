package kz.karpenko.turn;

/**
 * Created by Олег on 26.01.2017.
 */
public class Start {
    public static void main(String[] args) {
        Matrix m = new Matrix(3,3);
        m.showMatrix();
        System.out.println();
        m.turnTo(90);

    };

}
