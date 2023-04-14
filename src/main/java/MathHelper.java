public class MathHelper {
    private static MathHelper instance = null;

    private MathHelper() {
    }

    public static MathHelper getInstance() {
        if (instance == null) {
            instance = new MathHelper();
        }
        return instance;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public int sqrt(int a) {
        return (int) Math.sqrt(a);
    }

    public int prime(int a) {
        int i,m=0,flag=0;
        m=a/2;
        if(a==0||a==1){
         return 0;
        }else{
         for(i=2;i<=m;i++){
          if(a%i==0){
           return 0;
          }
         }
         if(flag==0)  { return 1; }
        }//end of else
        return 0;
    }

    public int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
    //method to check date is valid or not
    public int date(int a, int b, int c) {
        if (a > 0 && a <= 31 && b > 0 && b <= 12 && c > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //test  method to check date is valid or not
    public int dateTest(int a, int b, int c) {
        if (a > 0 && a <= 31 && b > 0 && b <= 12 && c > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //method to check leap year
    public int leapYear(int a) {
        if (a % 4 == 0) {
            return 1;
        } else {
            return 0;
        }
    }



}
