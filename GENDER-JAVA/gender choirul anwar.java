import java.util.*;
import java.lang.Math;

public class gender {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String gender;

        System.out.println("mssukkan gender anda");
        gender = input.nextLine();
        if (gender.equals("laki") || gender.equals("laki-laki") || gender.equals("cowo")) {
            System.out.println("anda ternyata LAKIKKK");
        } else {
            if (gender.equals("cewe") || gender.equals("perempuan")) {
                System.out.println("iya anda ceue");
            } else {
                System.out.println("anda tidak punya kelamin");
            }
        }
    }
}
