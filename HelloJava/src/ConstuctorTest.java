public class ConstuctorTest {


    public ConstuctorTest(){

        System.out.println("This Construtor has no parameters.");
    }

    public ConstuctorTest(int i){

        System.out.println("This Construtor has 1 integer parameters.");
    }

    public ConstuctorTest(int i, String n){

        System.out.println("This Construtor has 2 parameters." + i + n);
    }

    public ConstuctorTest(int j, String m, int k){

        System.out.println("This Construtor has 3 parameters." + j + m+k);
    }
}
