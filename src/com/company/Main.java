package com.company;

        /*
            Write a program that will allow a robot to assemble 10 burritos.
            Use a random generator for each burrito option and build a list of
            10 burrito customizations:

            Rice: white, brown, no rice
            Meat: chicken, steak, carnidas, chorizo, sofritas, veggies
            Beans: pinto, black, no beans
            Salsa: mild, medium, hot, no salsa
            Veggies: lettuce, fajita veggies, no veggies*
        */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Initialization of random numbers specific to burrito options
        Random r = new Random();
        Random m = new Random();
        Random b = new Random();
        Random s = new Random();
        Random v = new Random();


        // Int list of random variables specific to burrito options
        int rx = r.nextInt(3);
        int mx = m.nextInt(6);
        int bx = b.nextInt(3);
        int sx = s.nextInt(4);
        int vx = v.nextInt(4);


        //String array of Options
        String[] rice = {"white rice, ", "brown rice, ", "no rice, "};
        String[] meat = {"chicken meat", "steak meat", "carnitas meat", "chorizo meat", "sofritas", "veggies"};
        String[] beans = {"pinto beans", "black beans", "no beans"};
        String[] salsa = {"mild salsa", "medium salsa", "hot salsa", "no salsa"};
        String[] veggies = {"lettuce", "fajita", "veggies", "no veggies"};

        //Extra options
        String[] cheese = {"yes cheese", "no cheese"};     // yes/no;
        String[] guac = {"yes guac", "no guac"};      // yes/no;
        String[] queso = {"yes queso", "no queso"};      // yes/no;
        String[] sourcream = {"yes sourcream", "no sourcream"};  // yes/no;

        //Price options
       double price = 3.00;     // yes/no;
  /*       if(cheese.contains("yes cheese"){
            price +=.5;
        } else if(guac.contains("yes guac"){
            price +=.5;
        } else if(queso.contains("yes queso"){
            price +=.5;
        } else if(sourcream.contains("yes sourcream"){
            price +=.5;
        };
*/

  /* Creating a Method*
        public static int calcPrice(cheese,guac,queso,sourcream) { //method header
            // method body

             if(cheese.contains("yes cheese"){
            price +=.5;
            }
        if(guac.contains("yes guac"){
            price +=.5;
        } else if(queso.contains("yes queso"){
            price +=.5;
        } else if(sourcream.contains("yes sourcream"){
            price +=.5;
            return price;
        };
*/
    /* Method Structure
        public static - access type, modifier
        int - return type
        AddTwoNumbers - method name
        num1, num2 - parameters
        method body - series of statements that defines what the method does
     */



        for (int i = 1; i < 26; i++) {
            System.out.println();
            System.out.print("Burrito " + i + ": ");
            System.out.print(rice[r.nextInt(3)]);
            System.out.print(meat[m.nextInt(6)] + ", ");
            System.out.print(beans[b.nextInt(3)] + ", ");
            System.out.print(salsa[s.nextInt(4)] + ", ");
            System.out.print(veggies[v.nextInt(4)] + ", ");
            System.out.print(cheese[v.nextInt(2)] + ", ");
            System.out.print(guac[v.nextInt(2)] + ", ");
            System.out.print(queso[v.nextInt(2)] + ", ");
            System.out.print(sourcream[v.nextInt(2)] + ", ");
            System.out.print(price);
            System.out.println();
        }

    }

}


