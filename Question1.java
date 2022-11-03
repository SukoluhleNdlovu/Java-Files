/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question1;

/**
 *
 * @author ADMIN
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Using single and two‐dimensional arrays, produce the hospital inspection report
	    int hospital[][]={{4,8,6},{5,4,2},{4,2,8}}; //2D array
	    float  calculate[]=new float[3];  //1D array to store monthly scores
            //Create a for loop for 
	    for(int i=0;i<3;i++)
            {
	        for(int j=0;j<3;j++)
	        {
	            calculate[i]+=hospital[i][j];
	        }
	    }
	    //Display the report complete
	    System.out.println("***************************************************************");
	    System.out.println("HEALTH INSPECTION REPORT");
	    System.out.println("***************************************************************");
	    //Display all 3 months and the average 
	    System.out.println(" \t\t Jan\tFeb\tMarch\tAVG");
	    for(int i=0;i<3;i++)
	    {
	        System.out.print("Hospital "+(i+1)+" : --> "+hospital[i][0]+"\t"+hospital[i][1]+"\t"+hospital[i][2]);
	        System.out.printf("\t%.2f\n",calculate[i]/3); 
	    }
	    System.out.println("***************************************************************");
	    System.out.println("MONTHLY TOTALS");
	    System.out.println("***************************************************************");
	    //Create a for loop to get total 
	    for(int i=0;i<3;i++)
	    {
	        System.out.print("Hospital "+(i+1)+":");
	        System.out.printf("\t%.1f\n",calculate[i]); 
	    }
	    System.out.println("***************************************************************");
	}
    }
    

