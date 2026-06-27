package DSA.TREE;

import com.sun.source.tree.Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int v){
        val = v;
    }

}
public class ZigZag_Travel {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans ;
        q.offer(root);
        boolean ltr = true ;
        while(q.size()!=0){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i =0 ;i< size;i++){
                TreeNode node = q.poll();
                temp.add(node.val);
                if(node.left !=null) q.offer(node.left);
                if(node.right !=null) q.offer(node.right);
            }
            if(!ltr){
                Collections.reverse(temp);
            }
            ans.add(temp);
            ltr = !ltr ;
        }
        return ans ;
    }
}
