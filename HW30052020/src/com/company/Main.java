package com.company;

public class Main {

    public static int howManyTimes(String[] String, String str){
        int i=0;
        int counterString=0;
        while(i<String.length){
            if(String[i] == str){
                counterString++;
            }
            i++;
        }
        return counterString;
    }

    //--------------------------------------------------------------------

    public static int[] firstNNumbersOfFib(int n){
        int[] Fib= new int[n];
        Fib[0]=1;
        int i=1;
        while (i<Fib.length){
            if (i == 1){
                Fib[i]=1;
            }else {
                Fib[i] = Fib[i - 1] + Fib[i - 2];
            }
            i++;
        }
        return Fib;
    }

    public static void printFirstNNumbers(int n) {
        int i = 0;
        while (i < n) {
            System.out.println(firstNNumbersOfFib(n)[i]);
            i++;
        }
    }

        //--------------------------------------------------------------------

    public static int biggestNumberMinusSmallestNumber(int[] array){
        int i=1;
        int smallest=array[0];
        int biggest=array[0];
        while (i<array.length){
            if(array[i]<smallest){
                smallest = array[i];
            }
            if(array[i]>biggest){
                biggest = array[i];
            }
            i++;
        }
        return biggest-smallest;
    }

    //--------------------------------------------------------------------

    public static int smallestNumber(int[] array){
        int i=1;
        int indexSmallest = 0;
        int smallest=array[0];
        while (i<array.length){
            if(array[i]<smallest){
                smallest = array[i];
                indexSmallest = i;
            }
            i++;
        }
        return indexSmallest;
    }


    public static int biggestNumber(int[] array){
        int i=1;
        int indexBiggest =0;
        int biggest=array[0];
        while (i<array.length){
            if(array[i]>biggest){
                biggest = array[i];
                indexBiggest = i;
            }
            i++;
        }
        return indexBiggest;
    }

    public static int[] changePositions(int[] orig, int smallestPosition,int biggestPosition){
        int smallestNumber=orig[smallestPosition];
        int biggestNumber=orig[biggestPosition];
        int k = orig[orig.length-1];
        if((smallestPosition !=0 && smallestPosition !=orig.length-1)&&(biggestPosition !=0 && biggestPosition !=orig.length-1))
        orig[orig.length-1]=smallestNumber;
        orig[smallestPosition]=k;
        k = orig[0];
        orig[0]=biggestNumber;
        orig[biggestPosition]=k;
        return orig;
    }

    public static void print(int[] array,int indexSmallest,int indexBiggest){
        int i=0;
        while (i<array.length){
            System.out.println(changePositions(array,indexSmallest,indexBiggest)[i]);
            i++;
        }
    }
    //------------------------------------------------------------------------------------

    public static boolean areThereTwoOrMoreElements(String[] String){
        int i =0;
        while (i<String.length-1){
            if(String[i] == String[i+1]){
                return true;
            }
            i++;
        }
        return false;
    }

//----------------------------------------------------------------------

    public static String listAndOldest(String[] names, int[] yearsOfBirth, int border){
        int i =0;
        int oldest=yearsOfBirth[0];
        int oldestIndex=0;
        int year=2020;
        while (i<names.length-1){
            if(year-yearsOfBirth[i]>border){
                System.out.println(names[i]+" "+(year-yearsOfBirth[i]) + " years");
            }
            if(oldest>yearsOfBirth[i]){
                oldest=yearsOfBirth[i];
                oldestIndex=i;
            }
            i++;
        }
        return (names[oldestIndex]+ " " + (year-yearsOfBirth[oldestIndex])+" years, is oldest");
    }


    public static void main(String[] args) {
        System.out.println("--------------10.1-------------------");
        String[] String = {"Oleg","Jack","Joe","Sam","Jack"};
        System.out.println(howManyTimes(String,"Jack"));
        System.out.println("--------------10.2-------------------");
        printFirstNNumbers(10);
        System.out.println("--------------10.3-------------------");
        int[] array = {3423,2,3343,33,53,9999,654};
        System.out.println(biggestNumberMinusSmallestNumber(array));
        System.out.println("--------------10.4-------------------");
        print(array,smallestNumber(array),biggestNumber(array));
        System.out.println("--------------10.5-------------------");
        System.out.println(areThereTwoOrMoreElements(String));
        System.out.println("--------------10.6-------------------");
        String[] names =        {"Alex","Boris","Carol","Diana"};
        int[] yearsOfBirthday = {1985  ,2000   ,1993   ,1990   };
        System.out.println(listAndOldest(names,yearsOfBirthday,20));

    }
}
