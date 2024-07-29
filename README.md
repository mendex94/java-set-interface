# Java Set

## Set Interface

- Set is a collection of unique elements.
- Set interface does not allow duplicate elements.
- Set interface does not have any additional methods other than the collection interface.
- Set interface is implemented by HashSet, LinkedHashSet, and TreeSet.
- Set interface is not index-based.

## HashSet

- HashSet is the implementation class of the Set interface.
- HashSet does not maintain the insertion order.
- HashSet does not allow duplicate elements.
- O(1) time complexity for the add, remove, contains, and size methods.

## LinkedHashSet

- LinkedHashSet is the implementation class of the Set interface.
- LinkedHashSet maintains the insertion order.
- LinkedHashSet does not allow duplicate elements.
- O(1) time complexity for the add, remove, contains, and size methods.
- LinkedHashSet is slower than HashSet because it maintains the insertion order.

## TreeSet

- TreeSet is the implementation class of the Set interface.
- TreeSet does not maintain the insertion order.
- TreeSet does not allow duplicate elements.
- TreeSet stores elements in ascending order.
- O(log(n)) time complexity for the add, remove, contains, and size methods.

## Set Example

```java
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        System.out.println("HashSet: " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);
        System.out.println("TreeSet: " + treeSet);
    }
}
```

