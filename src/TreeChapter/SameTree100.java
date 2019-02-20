package TreeChapter;

/**
 * created by Hannah Li on 19/2/19
 * Project name: LeetcodeProject
 * LeetCode NO.: 100
 */
public class SameTree100 {



    /**
     * Given two binary trees, write a function to check if they are the same or not.
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        if(p == null || q == null) return false;
        if(p.val == q.val){
            return ( isSameTree(p.left,q.left) &&
                    isSameTree(p.right, q.right));
        }
        return false;
    }

}
