// package Trees;

// public class SerializationAndDeserialization {
//     public String serialize(TreeNode root) {
//         StringBuilder sb = new StringBuilder();
//         helper1(root,sb);
//         return sb.toString();
//     }
//     public void helper1(TreeNode root, StringBuilder sb){
//         if (root==null) {
//             sb.append("# ");
//             return;
//         }
//         sb.append(root.val+" ");
//         helper1(root.left, sb);
//         helper1(root.right, sb);
//     }
//     int i;
//     // Decodes your encoded data to tree.
//     public TreeNode deserialize(String data) {
//         String[] ch = data.split(" ");
//         i=0;
//         TreeNode root = helper2(ch);
//         return root;
//     }
//     public TreeNode helper2(String[] ch){
//         if (ch[i].equals("#")) {
//             i++;
//             return null;
//         }
//         TreeNode root = new TreeNode(Integer.parseInt(ch[i]));
//         i++;
//         root.left = helper2(ch);
//         root.right = helper2(ch);
//         return root;
//     }
// }
