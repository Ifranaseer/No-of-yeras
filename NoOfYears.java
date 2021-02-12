/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.of.years;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class NoOfYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int seconds;
        int years;
        int no, days;
        seconds=3456789;
        years=seconds/(365*24*60);
        no=seconds%(365*24*60);
        days=no/(24*60);
        System.out.println("No of years = "+years);
        System.out.println("No of days = " +days);
        // TODO code application logic here
    }
    
}
