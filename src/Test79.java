public class Test79 {
    public static void main(String[] args) {
        String s="123";
        int i=Integer.parseInt(s);//static parseInt will convert string to integer
        System.out.println(i+5);//123+5=128
        Integer i1=10;//wrapper class object1(I1)
        Integer i2=100;//wrapper class object2(I2)
        //equals method compares the content value
        //System.out.println(i1.equals(i2));
        System.out.println(i1==i2);
        System.out.println(12==12);




    }
}
