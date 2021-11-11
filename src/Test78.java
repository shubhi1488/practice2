public class Test78 {
    public static void main(String[] args){
        Integer i1= Integer.valueOf(34);//boxing
        int res=i1.intValue();//unboxing
        //System.out.println(res+2);
        String str=i1.toString();//it will perform concatenation
        System.out.println(str+4);
    }
}
