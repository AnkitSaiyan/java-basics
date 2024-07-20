public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        int a = 20;

//		Auto boxing primitive to wrapper class type
        Integer b = a;
//      Note:  float b = a will work, but Float b = a will not
        System.out.println(a + " " + b);

        Integer c = 40;

//		Auto unboxing wrapper class type to primitive
        int d = c;

        System.out.println(c + " " + d);

        Integer x = 400, y = 400;
//		Integer is a class so x and y are objects so x is not equals to y
        if (x == y) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        x = y = 40;
//      Smaller values are equal because java caches it
        if (x == y) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
