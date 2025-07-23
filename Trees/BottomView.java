// package Trees;
// import java.util.*;

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
// class Pair{
//     TreeNode n;
//     int vLevel;
//     Pair(TreeNode n1,int x){
//         n=n1;
//         vLevel=x;
//     }
// }
// public class BottomView {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         TreeNode root = buildTree(arr);
//         List<Integer> bottomView = bottomView(root);
        
//         for (int num : bottomView) {
//             System.out.print(num + " ");
//         }
//         sc.close();
//     }
    
//     public static TreeNode buildTree(int[] arr) {
//         if (arr.length == 0 || arr[0] == -1) {
//             return null;
//         }
        
//         TreeNode root = new TreeNode(arr[0]);
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.add(root);
        
//         int i = 1;
//         while (!queue.isEmpty() && i < arr.length) {
//             TreeNode current = queue.poll();
            
//             if (i < arr.length && arr[i] != -1) {
//                 current.left = new TreeNode(arr[i]);
//                 queue.add(current.left);
//             }
//             i++;
            
//             if (i < arr.length && arr[i] != -1) {
//                 current.right = new TreeNode(arr[i]);
//                 queue.add(current.right);
//             }
//             i++;
//         }
        
//         return root;
//     }
    
//     public static List<Integer> bottomView(TreeNode root) {
//         Queue<Pair> q = new LinkedList<>();
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         q.add(new Pair(root, 0));
//         while (q.size()>0) {
//             Pair rem = q.remove();
//             TreeNode remN = rem.n;
//             int remVL = rem.vLevel;
//             hm.put(remVL, remN.val);
//             if (remN.left != null) {
//                 q.add(new Pair(remN.left, remVL-1));
//             }
//             if (remN.right != null) {
//                 q.add(new Pair(remN.right, remVL+1));
//             }
//         }
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         for (Integer key : hm.keySet()) {
//             if (key<min) {
//                 min = key;
//             }
//             if (key > max) {
//                 max=key; 
//             }
//         }
//         ArrayList<Integer> ans = new ArrayList<>();
//         for (int i = min; i <= max; i++) {
//             ans.add(hm.get(i));
//         }
//         return ans;
//     }
// }