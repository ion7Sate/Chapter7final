public class VariableLengthArgumentList {
    public static void main(String[] args) {

        System.out.println("Product 1*2*3 is "+product(1,2,3));
        System.out.println("Product 1*5*4*7*21 is "+product(1,5,4,7,21));
        System.out.println("Product 1*5*4*7*21*34*52 is "+product(1,5,4,7,21,34,52));
    }

    public static int  product(int... a) {
        int product = 1;
        for (int i : a)
            product = product * i;
        return product;
    }
}
