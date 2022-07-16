package com.gl.lab2;

import java.util.Arrays;
import java.util.Scanner;
 import com.gl.lab2.*;
public class main {
	
	public static void main (String[] args) {
		
		MergeSortImplentation mergeSortImplementation = new MergeSortImplentation();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("Enter the size of currency denominations");
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<size;i++) {
			notes[i] = sc.nextInt();
		}
		
		System.out.println("Enter amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes,amount);
				
	}

}
