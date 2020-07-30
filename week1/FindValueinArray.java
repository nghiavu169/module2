import java.util.Scanner;

public class FindValueinArray {
    public static void main(String[] args) {
        System.out.println("Who tf are you looking for?");
        Scanner scanner = new Scanner(System.in);
        String[] students =  {"a","b","c","d","e","f","g","h","i"};
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println(name + " have in class at position: " + (i+1));
                isExist = true;
            }
            if (!isExist){
                System.out.println("Not found" + name + " in the class.");
            }
        }
    }
}
