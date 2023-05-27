package gl.g4b1.assemblingfloors.orderofassemblingfloors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class OrderOfAssemblingFloors {

	public void orderOfAssemblingFloors(ArrayList<Integer> list, int noOfFloors) {

		System.out.println("The order of construction is as follows");

		LinkedList<Integer> priority = new LinkedList<Integer>();
		priority.addAll(list);
		Collections.sort(priority, Collections.reverseOrder());

		ArrayList<Integer> leftBehindList = new ArrayList<Integer>();

		for (int i = 0; i < noOfFloors; i++) {
			System.out.println("\nDay: " + (i + 1));

			if (list.get(i) == priority.peek()) {

				System.out.print(list.get(i) + " ");
				priority.poll();
				int count = 0;

				for (int value : priority) {

					if (leftBehindList.contains(value)) {
						System.out.print(value + " ");
						leftBehindList.remove(leftBehindList.indexOf(value));
						count++;
					} else {
						break;
					}
				}

				for (int j = 0; j < count; j++) {
					priority.poll();
				}

			} else {
				leftBehindList.add(list.get(i));
			}
		}
	}
}