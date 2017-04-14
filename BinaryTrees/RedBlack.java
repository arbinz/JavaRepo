package BinaryTrees;

/* 1. Explain at least four properties of a red-black tree 
 * structure that make it unique from a regular binary tree. 
 * (see pages 786-788)
 * 
 * -Red-Black trees automatically balance after each insertion 
 * or deletion
 * -Every node is either red or black
 * -the root is black
 * -No double reds rule: no red node can have a red child
 * -Equal Exit Cost: all paths from the root to a null have
 * the same number of black nodes
 * 
 * 2. Examine code in worked_example_2 in a new window 
 * and describe to the best of your ability, what is really 
 * happening in the for loop within the insertionTest method.
 * 
 * It seems to be creating all possible permutations of the
 * insertion point to test if you can successfully insert the
 * chosen data point to the tree, and remove any spaces in
 * the process
 * 
 * 
 * 3. Explain what a heap or mini-heap structure is and what 
 * actually happens inside the data structure when an insertion 
 * occurs.
 * 
 * it is shifting the empty node up until it fills the requirement
 * for the rule that a parent can only be as large as all of its
 * descendants. When the value fills this requirement, it is
 * placed in the empty node
 * 
 * 4. Provide an explanation of the remove method in section_6 
 * in a new window MinHeap textbook demo. What is actually 
 * happening?
 * 
 * it is testing to see if a node is more valuable than the
 * previous one, and if it is, it switches the node for the 
 * previously selected value and continues until all nodes are
 * in the proper order
 */

public class RedBlack
{

}
