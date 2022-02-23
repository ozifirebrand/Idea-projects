import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BinaryTree {
    public int solution (Tree tree) {
        List<Integer> biggestValue = new ArrayList<>();
        HashSet<Integer> uniqueValues = new HashSet<>();
        int uniquePathLength;
        Tree newTree = getRightPath(tree);

        uniquePathLength = checkLeftPath(uniqueValues, tree);
        biggestValue.add(uniquePathLength);

        return 0;

    }

    private Tree getRightPath(Tree tree) {
        Tree newTree = new Tree();
        if ( tree.left == null ){
            newTree = tree.right;
        }
        return newTree;
    }

    private int checkLeftPath(HashSet<Integer> uniqueValues, Tree newTree) {
        int value;
        while (newTree != null){
            value= newTree.x;
            if ( uniqueValues.contains(value) )
                break;
            else {
                uniqueValues.add(value);
                newTree = newTree.left;
                newTree = getRightPath(newTree);

            }
        }
        return uniqueValues.size();

    }

    static class Tree {
        private int x;
        private Tree left;
        private Tree right;
    }
}
