public class VarEx {

    public static void main(String[] args) {

        int mach; //
        int distance;
        mach=340; //int mach =
        distance=mach*60*60;
        System.out.println(""+ distance + "m");

        double radius;
        double area;
        final double PI=3.141592;
        radius=10.0;
        area = radius*radius*PI;
        System.out.println("" + radius+":"+area);

        radius=100.0;
        area = radius*radius*PI;
        System.out.println("" + radius+":"+area);

        char ga1 = '\uac00';
        char ga2 = '\uac00';
        String str = "hello";
        boolean cham=true;
        System.out.println("" + ga1 + ga2);
        System.out.println(""+cham);


        int i;
        double d;
        i=7/4; // ==>
        System.out.println(i);
        d=7/ (double) 4;
        d=7/4.0;
        System.out.println(":" + d+ d);
        double d2 = 1.999999;
        int j = (int) d2;
        System.out.println(j);
        byte b = (byte) 300;
        System.out.println(b);

    }


}