import java.util.*;
public class TreeMapOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int q = scanner.nextInt();
        
        for (int i = 0; i < q; i++) {
            char queryType = scanner.next().charAt(0);
            
            switch (queryType) {
                case 'a':
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    treeMap.put(x, y);
                    break;
                case 'b':
                    x = scanner.nextInt();
                    System.out.println(treeMap.getOrDefault(x, -1));
                    break;
                case 'c':
                    System.out.println(treeMap.size());
                    break;
                case 'd':
                    x = scanner.nextInt();
                    treeMap.remove(x);
                    break;
                case 'e':
                    for (int key : treeMap.keySet()) {
                        System.out.print(key + " ");
                    }
                    System.out.println();
                    break;
            }
        }
        
        scanner.close();
    }
}