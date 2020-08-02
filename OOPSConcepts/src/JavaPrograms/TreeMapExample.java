package JavaPrograms;

import java.util.TreeMap;

public class TreeMapExample {

			public static void main(String[] args) {
			System.out.println("Tree Map Expample");
			
			TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
			tMap.put(1, "Sunday");
			tMap.put(2, "Monday");
			tMap.put(3, "Tuesday");
			tMap.put(4, "Wednesday");
			tMap.put(5, "Thursday");
			tMap.put(6, "Friday");
			tMap.put(7, "Saturday");
			System.out.println("Keys of the treemap are " +tMap.keySet());
			System.out.println("Values of the treemap are " +tMap.values());
			
			System.out.println("Key 5 value is " +tMap.get(5));
			int lkey = tMap.lastKey();
			int fkey = tMap.firstKey();
			System.out.println("Last Key is " +lkey+ " and its value is " +tMap.get(lkey));
			System.out.println("Removing the first key " +tMap.remove(fkey));
			System.out.println("Removing the last key " +tMap.remove(lkey));
			System.out.println("Now Keys of the treemap are " +tMap.keySet());
			System.out.println("Now Values of the treemap are " +tMap.values());
			}
			

			}
