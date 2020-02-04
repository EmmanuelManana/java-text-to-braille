import java.util.Scanner;

public class MyClass {
    //check for cases
    static void translate(String str, String[] rebri, String[] rebri2, String[] rebri3) {
      
        int r;
        r = 0;

        while (r <= 3){

            if (r == 0){

                for (int i = 0 ; i < str.length(); i++){

                        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                            System.out.print(rebri[i- 65]);
                            System.out.print("  |");
                        }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                            System.out.print(rebri[str.charAt(i) - 97]);
                            System.out.print("  |");
                        }else if (str.charAt(i) == ' '){
                            System.out.print(" ");
                        }
                        else{
                            System.out.println(str.charAt(i));
                        }
                }
                System.out.println(" ");
            }else if (r == 2){

                for (int i = 0 ; i < str.length(); i++){

                        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                            System.out.print(rebri2[i- 65]);
                            System.out.print("  |");
                        }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                            System.out.print(rebri2[str.charAt(i) - 97]);
                            System.out.print("  |");
                        }else if (str.charAt(i) == ' '){
                            System.out.print(" ");
                        }
                        else{
                            System.out.println(str.charAt(i));
                        }
                }
                System.out.println(" ");
            }else if (r == 3){

                for (int i = 0 ; i < str.length(); i++){

                        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                            System.out.print(rebri3[i- 65]);
                            System.out.print("  |");
                        }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                            System.out.print(rebri3[str.charAt(i) - 97]);
                            System.out.print("  |");
                        }else if (str.charAt(i) == ' '){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print(" ");
                        }
                }
                System.out.println(" ");
            }

            r++;
        }}

    //another function here, handle invalid input
    static int checkinput(String str){

        int i;

        i = 0;
        while (str.charAt(i++) != '\0'){

            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ||
                 (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
                     return 1;
            }
         }
         return 0;
    }



    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

     // System.out.println("Hello World");
    String[] rebri = {"*  ", "*  ", "** ", "** ", "*  ", "** ", "** ","*  " ," * " , " * ",
                      "*  " ,"*  ", "** ", "** " , "*  ", "** ", "** " , "*  " ," * " , " * ",
                      "*  ", "*  " , " * ","** " ,"** " ,"*  "};

    String[] rebri2 = {"   ", "*  ", "   ", " * ", " * ", "*  ", "** ","** " ,"*  " , "** ",
                       "   ", "*  ", "   ", " * ", " * ", "*  ", "** ", "** ","*  " , "** ",
                       "   ", "*  ", "** ","   " ," * " ," * "};

    String[] rebri3 = {"   ", "   ", "   ", "   ", "   ", "   ", "   ","   " ,"   " , "   ",
                       "*  " ,"*  ", "*  ", "*  " , "*  ", "*  ", "*  " , "*  " ,"*  " , "*  ",
                       "** ", "** " , " * ","** " ,"** " ,"** "};

    
    //N:B add if statement to valiadte user input first.
    //while(str){

    while (myObj.hasNextLine()){

        String str = myObj.nextLine();  // Read user input
        if (str.equals("")){
            myObj.close();
            break;
        }
        if (checkinput(str) == 1){
            translate(str, rebri, rebri2, rebri3);
        }else{
            System.out.println("Invalid input");
        }
    }


  // System.out.println(str);
    
    }}
