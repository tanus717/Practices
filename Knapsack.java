package Code;

public class Knapsack {

	public static void main(String[] args) {
		int weight[] = { 10, 20, 30 };
		int value[] = { 60, 100, 120 };
		int maxWeight = 50;
		int item = weight.length;

		System.out.println(knapsack(maxWeight, weight, value, item));
	}
	public static int knapsack(int W, int[] wt, int[] val, int item) {
		if (item == 0 || W == 0)
			return 0;
		if (wt[item - 1] > W)
			return knapsack(W, wt, val, item - 1);
		else {
			return Math.max(val[item - 1] + knapsack(W - wt[item - 1], wt, val, item - 1),
					knapsack(W, wt, val, item - 1));
		}
	}
}
