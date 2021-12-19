/*
 * Java 1. Homework #4
 * @autor Galina Nasonova
 * @version 19.12.2021
 */

import java.util.Scanner;
import java.util.Random;
class TicTacToe {
    
    final char SIGN_X='x';
    final char SIGN_O='o';
    final char SIGN_EMPTY='.';
    char [] [] table;
    Scanner sc;
    Random random;
    
    public static void main(String[] args) {
    TicTacToe ttt=new TicTacToe();
    ttt.game();
    }
    
    TicTacToe()  {
        //инициализация
        table =new char [3] [3];
        sc= new Scanner(System.in);
        random= new Random();
    }
    
    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (isWin (SIGN_X)) {
                System.out.println("YOU WON");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            
            turnAi();
            printTable();
            if (isWin (SIGN_O)) {
                System.out.println("YOU WON");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        printTable();
    }
    void initTable (){
        for (int i=0;i<table.length;i++) {
            for (int j=0;j<table.length;j++) {
                table[i][j]=SIGN_EMPTY;
            }
        }
    }
    void printTable() {
        for (int i=0;i<table.length;i++) {
            for (int j=0;j<table.length;j++) {
                System.out.print (table[i][j]+ " " );    
            }
            System.out.println ();
        }
        
    }
    
    void turnHuman() {
        int x,y;
        do {
            System.out.print ("Enter X Y [1..3]:");    
            x=sc.nextInt()-1;
            y=sc.nextInt()-1;
        }while (!isCellValid(x,y));
        table[y][x]=SIGN_X;
    }
    
    void turnAi() {
        int x,y;
        do {
            x=random.nextInt(3);
            y=random.nextInt(3);
        }while (!isCellValid(x,y));
        table[y][x]=SIGN_O;
    }
    
    boolean isCellValid(int x, int y) {
        if (x<0 || x>2 || y<0 || y>2)  {
            return false; 
        }
        return table[y][x]==SIGN_EMPTY;
    }
    
    boolean isWin(char ch) {
        int i,j;
        for (i=0;i<table.length;i++) {
            for (j=0;j<table.length;j++) {
                if (table[i][j]!=ch) {
                    break;
                }
            }if (j==3) return true;
        }
        for (j=0;j<table.length;j++) {
            for (i=0;i<table.length;i++) {
                if (table[i][j]!=ch) {
                    break;
                }
            }if (i==3) return true;
        } 
        if (table[0][0]==ch &&  table[1][1]==ch && table[2][2]==ch) return true;
        if (table[0][2]==ch && table[1][1]==ch && table[2][0]==ch) return true;
        return false;
    }
    
    boolean isTableFull() {
        for (int i=0;i<table.length;i++) {
            for (int j=0;j<table.length;j++) {
                if (table[i][j]==SIGN_EMPTY) {
                    return false;
                }
            }
        }return true; 
    }

}