import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
		public static void main(String[] args) {
			Set<String> hashSet = new HashSet<>();
			Set<String> linkedHashSet = new LinkedHashSet<>();
			Set<String> treeSet = new TreeSet<>();

			// Add elements to the hashSet
			hashSet.add("Bob");
			hashSet.add("Alice");
			hashSet.add("John");
			hashSet.add("Richard");
			hashSet.add("Charles");
			hashSet.add("David");
			hashSet.add("Robert");
			hashSet.add("Michael");
			hashSet.add("William");
			hashSet.add("Joseph");

			// Add elements to the linkedHashSet
			linkedHashSet.add("Bob");
			linkedHashSet.add("Alice");
			linkedHashSet.add("John");
			linkedHashSet.add("Richard");
			linkedHashSet.add("Charles");
			linkedHashSet.add("David");
			linkedHashSet.add("Robert");
			linkedHashSet.add("Michael");
			linkedHashSet.add("William");
			linkedHashSet.add("Joseph");

			// Add elements to the treeSet
			treeSet.add("Bob");
			treeSet.add("Alice");
			treeSet.add("John");
			treeSet.add("Richard");
			treeSet.add("Charles");
			treeSet.add("David");
			treeSet.add("Robert");
			treeSet.add("Michael");
			treeSet.add("William");
			treeSet.add("Joseph");

			// Display the hashSet
			System.out.println("HashSet: " + hashSet);

			// Display the linkedHashSet
			System.out.println("LinkedHashSet: " + linkedHashSet);

			// Display the treeSet
			System.out.println("TreeSet: " + treeSet);
		}
}