// package Packages;
public class Main {
    public static void main(String[] args) {
        String str = "Sukkur iba university";
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u'){
                count++;
            }
        }
        System.out.println(count);

        // Person person = new Person();
        // Student student = new Student();
        // student.setData("Gulabi ", 19, 210086);
        // student.display();
    }
}
