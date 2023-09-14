package Exercise_04_Datenstrukturen;

public class Tree<E extends Comparable>{
    Tree<E> leftChild;
    Tree<E> rightChild;
    
    E data;


    public Tree<E> add(E data){
        //This method only returns a Tree object to chain .add() calls in the main class
        // this should also work with a void method


        // if this node is free then put data in here
        if(this.data == null){
            this.data = data;
        }else{
            //check which child should get the data   and if there is no child then create one
            if(data.compareTo(this.data) < 1){
                if(leftChild == null){
                    leftChild = new Tree<>();
                }
                leftChild.add(data);
            }else{
                if(rightChild == null){
                    rightChild = new Tree<>();
                }
                rightChild.add(data);
            }
        }
        //just to chain .add() in main class   could also be void
        return this;
    }

    public E find(E data){
        //if data is in the current node then we return it
        if(this.data.compareTo(data) == 0){
            return this.data;
        }else{
            //else we traverse the childs till we find the specified person or there are no childs
            if(data.compareTo(this.data) < 1){
                if(leftChild != null){
                    return leftChild.find(data);
                }else
                    return null;
            }else{
                if(rightChild != null){
                    return rightChild.find(data);
                }else
                    return null;
            }
        }
    }


}
