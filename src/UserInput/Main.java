package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public void read() {
		try {
			System.out.println("Fill something");
			int num = System.in.read(); // return ascii value
			// just read 1 char 
			System.out.println(num);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		
		}
	}
	
	public void readBufferedReader() {
		try {
			System.out.println("Fill something");
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader bf = new BufferedReader(in);
			String str = bf.readLine();
			System.out.println(str);
			bf.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		
		}
	}
	
	public void scannerRead() {
		try {
			System.out.println("Fill something");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println(num);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		Main m = new Main();
//		m.read();
//		m.readBufferedReader();
		m.scannerRead();
		

	}

}
