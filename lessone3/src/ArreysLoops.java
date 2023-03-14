public class ArreysLoops {
    public static void main(String[] args) {
    //    int[] a = new int[5];
   //     a[0] = 1;
   //     a[1] = 3;
   //     a[2] = 4;
   //     a[3] = -9;
   ////         a[4] = 29;
    ////    System.out.println(a[0]);
    //  System.out.println(a[0] + a[a.length - 1]);
    //        int[] arrey = {1, 4, 8, 9, 74, -43};
    //    System.out.println(arrey[0] + arrey[arrey.length - 1]);

    ////    int x = 4;
     //   if (x > 0)
     //       System.out.println("Positiv");
     //   else
    //       System.out.println("Non Positive");

    //    int b;
    //   if (x > 0) {
    //        b = 1;
    //    } else
    //        b = 0;
    //    b = x > 0 ? 1 : 0;
    //    System.out.println(b);
    //    x = -3;
    //    System.out.println(x > 0 ? "positive" : "Non Positive");
    //    x = 0;
    //    if (x > 0)
    //        System.out.println("drakan");
    //    else {
     //       if (x < 0)
      ///          System.out.println("bacasakan");
       //     else System.out.println("zro");
      //      System.out.println("------------");
      //     System.out.println(x > 0 ? "positive" : x < 0 ? "negative" : "zerro");
      // }

      //  System.out.println("-------------------------------");
     //   x = 4;
     //   if (x == 1)
      //      System.out.println("one");
      //  else if (x == 2)
      //      System.out.println("two");
      //  else if (x == 3)
      //      System.out.println("three");
      //  else if (x == 4)
      //      System.out.println("for");
    //    else
    //        System.out.println("bigger");
    //    x = -9;
     //   switch (x){
    //        case 1:
     //           System.out.println("one");
     //           break;
     //       case 2:
      //              System.out.println("two");
      //          break;
       //     case 3:
       ///             System.out.println("three");
       //     case 4:
       //         System.out.println("for");
       //         break;
       //     default:
        //        System.out.println("bigger");

     //   }
     //   System.out.println("--------");
       // int counter = 1;
       /// while (counter < 11){
          //  System.out.print(counter++ + " ");

      //  }
       // int x;
       // x = 554;
       // do {
         //   System.out.println("barev");
          //  x++;
       // } while (x<=4);{
         //   System.out.println("barev");


      //  }
     //   for (int i = 1; i<=10 ; i++){
       //     System.out.print(i + " ");
        //}
       // System.out.println("--------");
        //int c = 1;
       //while (c <= 10){  //qani der = while
         //      System.out.println(c + " ");
       // }

            String[] names = {"anun1", "anun2", "anun3", "anun4","anun5"};
       // System.out.println(names[1]);
      //  System.out.println(names[2]);
     //   System.out.println(names[3]);
     //   System.out.println(names[4]);
        for (int index = 0; index<= names.length-1; index = index + 2 ){  //zuyg indexner@ tpelu hamar
            System.out.print(names[index] + " ");
        }
        System.out.println("---");
        for (int index = names.length - 1; index >= 0; index--){ // verjic tpelu hamar
            System.out.println(names[index]);
        }
             //forichi greladzev@
        for (String s : names){
            System.out.println(s);
        }
        int[] arrey2 = {5, 4, 8, 8, 6, 6};
        for (int element: arrey2){
            if (element<0){
                System.out.println("ayo");
            break;}
            else {System.out.println("voch");
            break;}}
            for (int i = 1; i<=10; i++){
                if (i == 5)
                    continue;
                System.out.println(i);
            }

        }



    }
