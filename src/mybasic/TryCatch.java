package mybasic;

public class TryCatch {
    public static void main(String[]args){

        int apple=30;
        int orange=0;

        try {
            int result=apple/orange;

            System.out.println("Result="+result);
        }

        catch(Exception e){


            System.out.println("can't divide--"+e);


        }

    }

}
