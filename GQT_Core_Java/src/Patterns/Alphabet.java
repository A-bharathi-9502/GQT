package Patterns;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0&&j!=0&&j!=n-1)||(j==0&&(i!=0))||(j==n-1&&i!=0)||i==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==0&&j!=n-1)||j==0||(i==n/2&&j!=n-1)||(j==n-1&&i!=0&&i!=n-1&&i!=n/2)||(i==n-1&&j!=n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==0&&j!=0)||(j==0&&i!=0&&i!=n-1)||(i==n-1&&j!=0)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==0&&j!=n-1)||j==0||(j==n-1&&i!=0&&i!=n-1)||(i==n-1&&j!=n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==0)||j==0||(i==n/2)||(i==n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==0)||j==0||(i==n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==0&&j!=0)||(j==0&&i!=0&&i!=n-1)||(i==n-1&&j!=0)||(i>=n/2&&j==n-1&&i!=n-1)||(j>=n/2&&i==n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==n/2||j==0||j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==n/2||i==0||i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0||j==n/2||i-j==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			
			for(int j=0;j<n;j++) {
				if(j==0||j+i==n/2||i-j==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0||i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0||(i==j&&i<=n/2)||(i+j==n-1&&i<=n/2)||j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0||i==j||j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==0&&j!=0&&j!=n-1)||(j==0&&i!=n-1&&i!=0)||(i==n-1&&j!=n-1&&j!=0)||(j==n-1&&i!=n-1&&i!=0)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0||(i==0&&j!=n-1)||(i==n/2&&j!=n-1&&j!=n-1)||(j==n-1&&i!=n/2)&&i!=0&&i<=n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0||(i==0&&j<=n/2)||(i==n-1&&j<=n/2)||(j==n/2)||(i==j)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0||(i==0&&j!=n-1)||(i==n/2&&j!=n-1&&j!=n-1)||(j==n-1&&i!=n/2&&i!=0&&i<=n/2)||i-j==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			
			System.out.print("   ");
	
			for(int j=0;j<n;j++) {
				if(i==0||(j==0&&i<=n/2)||i==n/2||(j==n-1&&i>=n/2)||i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0||j==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((j==0&&i!=n-1)||(i==n-1&&j!=0&&j!=n-1)||(j==n-1&&i!=n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((j==0&&i<=n/2)||(j==n-1&&i<=n/2)||(i==n-1&&j==n/2)||(i>=n/2&&i-j==n/2)||(i>=n/2&&(i+j==(n-1)+(n/2)))) {
					System.out.print("* ");		
					}
			else {
				System.out.print("  ");
			}
			
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1||(i+j==n-1&&i>=n/2)||(i==j&&i>=n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==j||i+j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==j&&i<=n/2)||i+j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0||i+j==n-1||i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");

				}
			}
			System.out.print("   ");
			System.out.println();
		}


	}

}
