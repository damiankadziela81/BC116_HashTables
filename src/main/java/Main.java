import java.util.Hashtable;

public class Main {

    // Hashtable =  A data structure that stores unique keys to values ex.<Integer, String>
    //	            Each key/value pair is known as an Entry
    //			    FAST insertion, look up, deletion of key/value pairs
    // 			    Not ideal for small data sets, great with large data sets

    // hashing =    Takes a key and computes an integer (formula will vary based on key & data type)
    //		        In a Hashtable, we use the hash % capacity to calculate an index number

    //			    key.hashCode() % capacity = index

    // bucket =     an indexed storage location for one or more Entries
    //	            can store multiple Entries in case of a collision (linked similarly as LinkedList)

    // collision =  hash function generates the same index for more than one key
    //		     	less collisions = more efficiency

    // Runtime complexity: Best Case O(1)
    //                     Worst Case O(n)

    public static void main(String[] args) {

        Hashtable<Integer, String> table1 = new Hashtable<>(10);

        table1.put(100, "Spongebob");
        table1.put(123, "Patrick");
        table1.put(321, "Sandy");
        table1.put(555, "Squidward");
        table1.put(777, "Gary");

        table1.remove(100);

        for(Integer key : table1.keySet()) {
            System.out.println(key.hashCode() + "\t\t" + key.hashCode() % 10 + "\t" + key + "\t" + table1.get(key));
        }

        System.out.println();
        
        Hashtable<String, String> table2 = new Hashtable<>(10);

        table2.put("100", "Spongebob");
        table2.put("123", "Patrick");
        table2.put("321", "Sandy");
        table2.put("555", "Squidward");
        table2.put("777", "Gary");

        for(String key : table2.keySet()) {
            System.out.println(key.hashCode() + "\t" + key.hashCode() % 10 + "\t" + key + "\t" + table2.get(key));
        }
        
    }
}
    