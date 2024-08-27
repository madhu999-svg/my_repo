public class Strings{
    public static void main(String[]args){
        String str="Java Programming",str2="java Programming";
        System.out.println(str.length());
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());
        /*Scanner sc=new Scann(System.in);
         * char ch=sc.nextLine().charAt(0);
         * System.out.println(0);
         */
        System.out.println(str.charAt(6));
        System.out.println(str.startsWith("Java"));
    }
}