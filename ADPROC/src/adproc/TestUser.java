/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc;

/**
 *
 * @author Fred
 */
import java.util.Scanner;

/**
 * Created by Fred on 01/12/15.
 */
public class TestUser {
    public static void main(String[] args) {
        new PipeType1 pipey = new PipeType1();


        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter outer diameter");
        int n = reader.nextInt();
        System.out.println("Enter Length");
        int m = reader.nextInt();

        System.out.print("n = " + n + "   m = " + m);
    }
}