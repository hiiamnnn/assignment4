/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyfootballreport;

import java.util.Scanner;

/**
 *
 * @author nkotchs
 */
public class BoundPropertyFootballReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MPropertyBean mySource = new MPropertyBean();
        Listener1 people1 = new Listener1();
        Listener2 people2 = new Listener2();
        mySource.addPropertyChangeListener(people1);
        mySource.addPropertyChangeListener(people2);
        //mySource.setScore("Thai 1-0 UAE");
        //mySource.setScore("Thai 2-0 UAE");
        Scanner sc = new Scanner(System.in);
        String score;
        do{
            System.out.print("Enter Score  ");
            score = sc.nextLine();
            if(!score.equals(""))
                mySource.setScore(score);
        }while(!score.equals(""));
    }
    
}
