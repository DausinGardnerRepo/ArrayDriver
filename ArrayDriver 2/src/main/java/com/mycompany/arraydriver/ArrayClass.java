/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraydriver;

import java.util.*;

/**
 *
 * @author dausingardner
 */
public class ArrayClass {
    private int SIZE = 10;
    private final int [] array = new int [SIZE];
    private int howmany;
    private int total = 0;
    
    public ArrayClass(int sizeinp){
        howmany = sizeinp;
    }
    
    public void setHowMany(int setinp){
        howmany = setinp;
    }
    
    public int getHowMany(){
        return howmany;
    }
    
    public void changeIndex(int indiceinp, int valueinp){
        array[indiceinp] = valueinp;
    }
    
    public int getValue(int retrieveinp){
        return array[retrieveinp];
    }
    
    public void displayArray(){
        for (int i = 0; i < howmany; i++){
            System.out.println(array[i]);
        }
    }
    
    public void averageVal(){        
        for (int i = 0; i < howmany+1; i++){
            total += array[i];
        }
        
        System.out.println("Average: " + total/howmany);
    }
    
    public void generateRandom(int max){
        for (int i=0; i<howmany+1; i++){
            Random arrayfiller = new Random();
            
            int spotnum = arrayfiller.nextInt(max);
            
            array[i] = spotnum;
        }
        
    }
    
    public boolean search(int value){
        boolean searchflag = false;
        int count = 0;
        
        while (searchflag!=true && count<howmany+1){
            if (array[count] == value){
               searchflag = true;
            }
            else{
                count++;
            }
        }
        return searchflag;
    }
}
