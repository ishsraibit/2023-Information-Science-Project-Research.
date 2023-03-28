public class MainDemo {
    //javac MainDemo.java-encoding utf-8
    //java MainDemo 0604074123456

    //Male

    //InteliJidea
    //Run -> Edit Configurations -> Build and run -> Program arguments

    public static void main(String[] args) {
        String socialSecurityNumber = args[0];
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
