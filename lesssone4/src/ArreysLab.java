public class ArreysLab {
    public static void main(String[] args) {
//        System.out.println("1.Print numbers from 1 to 15");
//        for (int i = 1; i <16; i++){
//            System.out.print(i+ " ");
//        }
//        System.out.println("\n\n2.Print even numbers from -10 to 20");
//        for (int i = -10; i<=20; i += 2){
//            if (i == 0)
//                continue;
//            System.out.print(i + " ");}
//        System.out.println("\n\n3.Print * symbols using given number");
//        int n=4;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//        }
//
//
//        System.out.println("\n\n5.Creat an arrey with number 1-11");
        int[] arrey = new int[11];
//
//        for (int i = 0; i < arrey.length ; i++) {
//        arrey[i] = i+1;
//
//    }
//        for (int i = 0 ; i < arrey.length; i++) {
//        System.out.print(arrey[i] + " ");}
//        System.out.println("\n\n6. Creat an arrey with even numbers from -10 to 10");
        int[] arrey2;
        arrey2 = new int[11];
//        for (int i = 0, j = -10; i < arrey2.length ; i++,j += 2) {
//        arrey2[i] = j;
//
//    }
//            for(int i: arrey2){
//        System.out.print(i + " ");
//    }
//        System.out.println("\n\n7. Given an arrey. Print odd elements");
        int[] arrey3 = {4, 0, 5, 87, -9, -4, -1, 2, -3, 56, 4};
//            for(int a : arrey3) {
//        if (a % 2 !=0)
//            System.out.print(a + " ");}
//
//        System.out.println("\n\n8. Given an arrey. Print elements from -10 to 5");
//            for (int a : arrey3){
//        if (a >= -10 && a <= 5)
//
//                System.out.print(a +" ");
//             }
//        System.out.println("\n\n9. Given an arrey. Print elements whitch can be divided 3 or 4");
//        for (int a: arrey3) {
//            if (a % 3 ==0 || a % 4 ==0)
//                System.out.print(a +" ");
//        }
//
//        System.out.println("\n\n10. Given an arrey. Print cout of even elements");
//        int countOfEvens = 0;
//        for (int a: arrey3) {
//        if (a % 2 ==0)
//           countOfEvens++;
//        }
//        System.out.println("Counter Of Even Elements is " + countOfEvens);
//
//        System.out.println("\n\n11.Given an arrey. Print sum of elements");
        int[] arrey4 = new int[]{4, 1, 9, -4, 5, 3};
//
//        int sum = arrey4[0];
//        for (int i = 1; i < arrey4.length ; i++) {
//            sum = sum + arrey4[i];
//        }
//        System.out.print(sum);
//        System.out.println("\n\n12.Given an arrey. Print sum of positive elements");
//        sum = 0;
//        for (int i = 0; i < arrey4.length; i++) {
//            if (arrey4[i]>0)
//                sum += arrey4[i];
//
//        }
//        System.out.println(sum);
//        System.out.println("\n\n13. Given an arrey. Print multiplications of positive elements");
//        int m = 1;
//        for (int i = 0; i < arrey4.length; i++) {
//            m = m * arrey4[i];
//
//
//        }
//        System.out.println(m);
//        System.out.println("\n\n14. Find maiximal elements from arrey");
//        int max = arrey4[0];
//        for (int i = 1; i < arrey4.length ; i++) {
//            if (arrey4[i] > max)
//                max = arrey4[i];
//
//        }
//        System.out.println(max);
//        System.out.println("\n\n15. Find minimal elements from arrey");
//        int min = arrey4[0];
//        for (int i = 1; i < arrey4.length ; i++) {
//            if(arrey4[i] < min)
//                min = arrey4[i];
//        }
//        System.out.println(min);
//        System.out.println("\n\n16.find elements whitch is alone");
        int[] arrey5 = new int[]{4, 2, 1, 1, 9, 4, 2};
//        int resultat = arrey5[0];
//        for (int i = 1; i < arrey5.length ; i++) {
//            resultat= resultat ^ arrey5[i];
//
//        }
//        System.out.println(resultat);
        arrey = new int[]{4, 8, 5, 78, 96, -6, -32, -96, -55, -86};
        System.out.println("\n17.Sort arrey in asc.");
        for (int a : arrey) {
            System.out.print(a + " ");
        }
 boolean qaniderifmtnume = true;
        while (qaniderifmtnume){
            qaniderifmtnume = false;
        for (int i = 0; i < arrey.length - 1; i++) {
            if (arrey[i] > arrey[i + 1]) {
                int z = arrey[i];
                arrey[i] = arrey[i + 1];
                arrey[i + 1] = z;
                qaniderifmtnume = true;
            }
        }}
            System.out.println();
            for (int a : arrey) {
                System.out.print(a + " ");

            }


    }
}