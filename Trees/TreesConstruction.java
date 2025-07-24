import java.util.*;
public class TreesConstruction {
    static class  TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        TreeNode ans = construct(preorder, 0, n-1, inorder, 0, n-1);
        return ans;
    }
    public static TreeNode construct(int[] pre,int ps,int pe,int[]in,int is,int ie){
        if (ps>pe || is>ie) {
            return null;
        }
        TreeNode root = new TreeNode(pre[ps]);
        int idx = 0;
        for (int i = is; i <= ie; i++) {
            if (in[i]==pre[ps]) {
                idx = i;
                break;
            }
        }
        int count = idx-is;
        root.left = construct(pre,ps+1,ps+count,in,is,idx-1);
        root.right = construct(pre,ps+count+1,pe,in,idx+1,ie);
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] preOrder = new int[n];
        for (int i = 0; i < preOrder.length; i++) {
            preOrder[i] = sc.nextInt();
        }
        int[] inOrder = new int[n];
        for (int i = 0; i < inOrder.length; i++) {
            inOrder[i] = sc.nextInt();
        }
        TreeNode ans = buildTree(preOrder,inOrder);
        System.out.println(ans);
        sc.close();
    }
}
