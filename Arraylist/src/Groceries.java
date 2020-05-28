import java.util.ArrayList;
import java.util.Scanner;

public class Groceries {
	Scanner scanner = new Scanner(System.in);
	public static ArrayList<String> groceries = new ArrayList<String>();

	public static void main(String[] args) {
		groceries();
		
	}
	public static void groceries() {
		groceries.add("rice");
		groceries.add("dal");
		groceries.add("curd");
		groceries.add(2, "rasam");
		System.out.println(groceries);
		System.out.println(groceries.contains("rasam"));
		System.out.println(groceries.contains("rice"));
		groceries.remove("dal");
		System.out.println(groceries);
	}

}
