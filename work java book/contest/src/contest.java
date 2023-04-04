import java.awt.*;
import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ann = scanner.nextLine();
        String bnn = ann;
        Scanner scanner1 = new Scanner(System.in);
        String block = scanner1.nextLine();
        char road = "ann".charAt(Integer.parseInt(block));
        char path = block.charAt(Integer.parseInt(ann));
        char energy = block.charAt(Integer.parseInt("ann"));
        String alphabet;
        for ("0" >= ann) {
            if (alphabet = "b") (road(ann) = "O"){
                ann - bnn = path(ann);
                ann = ann - path(ann);
                path(ann) * path(ann) = energy(ann);
                bnn = ann;
                alphabet = "O";
            }
            else if (alphabet = "o" & road('ann') = "j") {
                ann - bnn = path(ann);
                ann = ann - path(ann);
                path(ann) * path(ann) = energy('ann');
                bnn = ann;
                alphabet = "j";
            } else if (alphabet = "j" road(ann) = "b"){
                ann - bnn = path(ann);
                ann = ann - path(ann);
                path(ann) * path(ann) = energy(ann);
                bnn = ann;
                alphabet = "b";
            }
            else
            System.out.println("-1");
        }

    }


pr
            }

    private static String road(String ann) {
        return null;
    }

    private static int path(String ann) {
        return 0;
    }
}





    }
}




public class GenderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ssn number (13 digits) : ");
        String socialSecurityNumber = scanner.nextLine();
        //System.out.println(socialSecurityNumber);

        char gender = socialSecurityNumber.charAt(6);
//        System.out.println(socialSecurityNumber);
        //System.out.println(gender);
        String genderstring =  switch (gender){
            case '1', '3' -> "Male";
            case '2', '4' -> "Female";
            default -> "Wrong ssn!";
        };
        System.out.println(genderstring);

    }
}
