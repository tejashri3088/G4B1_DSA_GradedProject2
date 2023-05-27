package gl.g4b1.assemblingfloors.main;

import java.util.ArrayList;
import java.util.Scanner;

import gl.g4b1.assemblingfloors.orderofassemblingfloors.OrderOfAssemblingFloors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrderOfAssemblingFloors oc = new OrderOfAssemblingFloors();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total no of floors in the building");
		int noOfFloors = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		int floorSize;

		for (int i = 0; i < noOfFloors; i++) {

			System.out.println("enter the floor size given on day : " + (i + 1));
			floorSize = sc.nextInt();

			if (floorSize != 0) {

				if (!list.contains(floorSize)) {

					list.add(floorSize);
				} else {
					System.out.println("cannot enter dublicate floor size");
					i--;
				}

			} else {
				System.out.println("floor size cannot be zero");
				i--;
			}
		}

		oc.orderOfAssemblingFloors(list, noOfFloors);
		sc.close();
	}

}
