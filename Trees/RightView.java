// package Trees;
// import java.util.*;

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }

// public class RightView {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         TreeNode root = buildTree(arr);
//         List<Integer> leftView = leftView(root);
        
//         for (int num : leftView) {
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
    
//     public static List<Integer> leftView(TreeNode root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         while (q.size()>0) {
//             int n = q.size();
//             for (int i = 1; i <= n; i++) {
//                 TreeNode temp = q.remove();
//                 if (i == n) {
//                     ans.add(temp.val);
//                 }
//                 if (temp.left != null) {
//                     q.add(temp.left);
//                 }
//                 if (temp.right != null) {
//                     q.add(temp.right);
//                 }
//             }
//         }
//         return ans;
//     }
// }