package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х : ");
        int x = scanner.nextInt();
        System.out.println("Введите у : ");
        int y = scanner.nextInt();
        Formula formula = Formula.getFormula();
        formula.setFormula(x, y);
        formula.displayFormula();
        Formula formula1 = Formula.getFormula();
        if (formula.hashCode() == formula1.hashCode()){
            System.out.println("Okey");
        } else {
            System.out.println("Error");
        }
    }
}
class Formula{
    private static Formula formula = new Formula();
    private static Formula Formula1;
    private int x;
    private int y;
    public static Formula getFormula(){
        return formula;
    }
    public void setFormula(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public static Formula getInstance(){
        return Formula1;
    }
    public void displayFormula(){
        double vector = 2 * x + 3 / y;
        System.out.println(vector);
    }
}