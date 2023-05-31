package forLoopExamples;

public class NestedForLoop {

    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*****************************************");
        System.out.println();

        int rows = 10;
        for(int n=1; n<= rows; ++n){
            for (int m=1; m<=n; ++m){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
