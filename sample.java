import java.util.Scanner;
class sample {
    public static void main(String args[]) {
        System.out.print("Enter any character: ");
        Scanner sc = new Scanner(System.in);
        char inp = sc.next().charAt(0);
        String output = (inp == 'a') ? ("vowel")
                : (inp == 'e') ? ("vowel")
                        : (inp == 'i') ? ("vowel")
                                : (inp == 'o') ? ("vowel")
                                        : (inp == 'u') ? ("vowel")
                                                : (inp == 'A') ? ("vowel")
                                                        : (inp == 'E') ? ("vowel")
                                                                : (inp == 'I') ? ("vowel")
                                                                        : (inp == 'O') ? ("vowel")
                                                                                : (inp == 'U') ? ("vowel")
                                                                                        : "consonent";
        System.out.println("Given character is " + output);
        sc.close();
    }
}
