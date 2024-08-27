A3public class ControlStmts{
    public static void main(String[]args){
        //conditional syatements
        //simple if
        int a=25,b=20;
        if(a>50)
        {
            System.out.println("the code is correct");//the condition is false then go to next stmt
        }    
        System.out.println("the code is not correct");
                //if-else
        if(a>b)
        {
            System.out.println("a is big");
        }
        else{
            System.out.println("b is big");
        }
        //else-if ladder
         if(a<b)
        {
            System.out.println("a is big");
        }
        else if(a==25){
            System.out.println("which is true");
        }
        else{
            System.out.println("b is big");
        }
    }

}