/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraydriver;

import java.util.*;

/**
 *
 * @author dausingardner
 */
public class ArrayDriver {

    public static void main(String[] args) {
        String FLAG = "Exit";
        String prompt = "";
        int sizeinp = 0;
        ArrayClass newclass = new ArrayClass(sizeinp);
        
        Scanner promptscan = new Scanner(System.in);
        
        while (!prompt.equals(FLAG)){
            System.out.println("What would you like to do?");
            System.out.println("Options:");
            System.out.println("1: Random Fill");
            System.out.println("2: Set array");
            System.out.println("3: Print array values");
            System.out.println("4: Modify array value");
            System.out.println("5: Retreive a value");
            System.out.println("6: Check if value exists");
            System.out.println("7: Compute the array average");
            System.out.println("Exit");
            
            prompt = promptscan.next();
            
            if("1".equals(prompt)){
                System.out.println("What is the max value you would like your array to have?");
                int max = promptscan.nextInt();
                
                if (max>10){
                    System.out.println("Error! Maximum value for array is 10 spots");
                }
                else{
                    newclass.generateRandom(max);
                }
            }
           
            else if ("2".equals(prompt)){
                System.out.println("Enter how many spots in the array you wish to enter: ");
                int setinp = promptscan.nextInt();
                if(setinp >10){
                    System.out.println("ERROR: Array cannot be larger than 10 spaces");
                }
                else{
                    newclass.setHowMany(setinp);
                    
                    for(int i = 0; i < newclass.getHowMany(); i++){
                    System.out.println("Please input a value for index " + i);
                    int indiceinp = i;
                    int valueinp = promptscan.nextInt();
                
                    newclass.changeIndex(indiceinp, valueinp);
                    }
                }
            }
            else if("3".equals(prompt)){
                newclass.displayArray();
            
            }
            
            else if("4".equals(prompt)){
                System.out.println("Please enter the index you wish to modify");
                
                int indiceinp = promptscan.nextInt();
                
                System.out.println("Please enter the value you wish to place in index " + indiceinp);
                
                int valueinp = promptscan.nextInt();
                
                
                newclass.changeIndex(indiceinp, valueinp);
            }
            
            else if ("5".equals(prompt)){
                System.out.println("Please enter the index you wish to see");
                
                int retrieveinp = promptscan.nextInt();
                
                System.out.println(newclass.getValue(retrieveinp));
            }
            
            else if ("6".equals(prompt)){
                System.out.println("Which number would you like to find");
                
                int value = promptscan.nextInt();
                
               
                
                if (newclass.search(value)==false){
                    System.out.println("Value could not be found!");
                }
                else if (newclass.search(value)==true){
                    System.out.println("Value was found!");
                }
            }
            
            else if ("7".equals(prompt)){                
                if (newclass.getHowMany() == 0){
                    System.out.println("Your array is empty!");
                }
                
                else{
                    newclass.averageVal();
                }
            }
        }
    }
}
