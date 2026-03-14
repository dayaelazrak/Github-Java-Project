public class JavaProjectQ5 {

    static void main() {


        int i = 20;
        int j = 5;

        System.out.println("i= "+ i);
        System.out.println("j= " + j);
        int temp = i;//temp = 20
        i=j; // i=5
        j=temp; // j= 20

        System.out.println("i= "+ i);
        System.out.println("j= " + j);

    }
}
