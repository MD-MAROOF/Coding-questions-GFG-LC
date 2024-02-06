/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> ans = new ArrayList<>();
        
        if(root == null)
            return ans;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.offer(root);
         Double sum = 0.0;
        while(!queue.isEmpty())
        {
            sum = 0.0;
            int levelNum = queue.size();
            for(int i=0;i<levelNum;i++)
            {    
                TreeNode curr = queue.poll();
                sum = sum + curr.val;
                
                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);
            
            }
            ans.add(sum/levelNum);
        }
        return ans;
    }
}

/* 
 List<Double> res = new LinkedList<>();
        if(root == null)    return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        double sum = 0;
        while(!q.isEmpty()){
            sum = 0;
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                sum += curr.val;
                if(curr.left != null)   q.offer(curr.left);
                if(curr.right != null)   q.offer(curr.right);
            }
            double avg = sum  / size;
            res.add(avg);
        }
        
        return res;
        */