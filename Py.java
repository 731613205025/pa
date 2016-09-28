/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Py {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int l=s.nextInt();
		System.out.println("Enter the elements: ");
		int[] elements=new int[l];
		for(int i=0;i<l;i++){
			elements[i]=s.nextInt();
		}
		for(int i=0;i<elements.length-1;i++){
			for(int j=i+1;j<elements.length;j++){
				for(int k=0;k<elements.length;k++){
				if((elements[i]+elements[j])==elements[k])
					System.out.println(elements[i]+","+elements[j]+","+elements[k]);
				}
			}
		}
	}

}
    

