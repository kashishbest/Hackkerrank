package GoogleInterview;

import java.util.Scanner;

/**
 * Created by Kashish-Mac on 26/10/16.
 *
 * Given a Binary Search Tree, find out the number of elements within a given range
 */
public class ElementBetweenRanges {
    private int data;
    private ElementBetweenRanges left;
    private ElementBetweenRanges right;

    private static ElementBetweenRanges constructBinarySearchTree(ElementBetweenRanges root, int data) {
        if (root.left != null && root.data >= data) {
            root.left = constructBinarySearchTree(root.left,data);
        } else if( root.right != null && root.data < data) {
            root.right = constructBinarySearchTree(root.right,data);
        }
        else if(root.data >= data && root.left == null) {
            ElementBetweenRanges node = new ElementBetweenRanges();
            node.data = data;
            node.left = null;
            node.right = null;
            root.left = node;
        } else if(root.data < data && root.right == null) {
            ElementBetweenRanges node = new ElementBetweenRanges();
            node.data = data;
            node.left = null;
            node.right = null;
            root.right = node;
        }
        return root;
    }
    public static void main(String args[]) {
        ElementBetweenRanges root = null;
        int[] array = {7,2,3,4,5,6,7,8,9,10};
        for(int i : array) {
            System.out.println(i);
            if (root == null) {
                root = new ElementBetweenRanges();
                root.data = i;
                root.left = null;
                root.right = null;
            } else {
                root = constructBinarySearchTree(root, i);
            }
        }

            Scanner sc =new Scanner(System.in);
            int lb = sc.nextInt();
            int ub = sc.nextInt();
            System.out.print(lb);


    }

}
