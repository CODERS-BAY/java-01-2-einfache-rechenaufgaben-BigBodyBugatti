import java.io.PrintStream;
public class Rechnen {
    public static void main(String[] args) {
        int a = 1720;
        int b = 849;
        double c = 10.5;
        double d = 20.451;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.printf("%d + %d = %d \n", a,b, a+b); //die %d sind ein kürzel um meine rechnung nicht wie oben geschrieben schreiben zu müssen.
        System.out.printf("%d - %d = %d\n",a, a, a-a);
        System.out.printf("%.2f / %.2f = %.2f \n",d,c,d/c );// f ist ein float oder double welche mit .und einer zahl wie bei mir 2 auf bestimmte dezimalstellen gerundet werden kann.
        System.out.printf("%d * %.5f = %.3f\n" ,a,c,a/c);
    }
}