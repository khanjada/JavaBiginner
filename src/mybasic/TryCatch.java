package mybasic;

public class TryCatch {
    public static void main(String[]args){

        int apple=5;
        int orrange=20;

        try {
            int result=apple/orrange;

            System.out.println("Result="+result);
        }

        catch(Exception e){


            System.out.println("cant devided"+e);


        }

    }

}
