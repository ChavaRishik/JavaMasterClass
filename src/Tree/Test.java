package Tree;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node: ");
        TreeNode root = new TreeNode(sc.nextInt());
        populate(root, sc);
        System.out.println("Tree Created Successfully ");
        System.out.println();
        display(root, "");
    }

    public static void display(TreeNode root, String indent) {
        System.out.println(indent + root.value);
        if (root.left != null) {
            display(root.left, indent + "    ");
        }
        if (root.right != null) {
            display(root.right, indent + "    ");
        }
    }



    private static void populate(TreeNode root, Scanner sc) {

        System.out.println("Is it left Node of " + root.value + "? True or False: ");
        Boolean left = sc.nextBoolean();

        if(left) {
            root.left = new TreeNode(sc.nextInt());
            populate(root.left, sc);
        }

        System.out.println("Is it right Node of " + root.value + "? True or False: ");
        Boolean right = sc.nextBoolean();
        if(right) {
            root.right = new TreeNode(sc.nextInt());
            populate(root.right, sc);
        }
    }
}
