Why does inorder traversal of a BST return elements in sorted order?
> Because the order is left, root, right and we are traversing a Binary Search Tree, 
> the values to the left will be less than the root and the values to the right will
> be greater than the root, therefore the values will be listed in ascending order.

Give an example of an insertion order that produces a highly unbalanced BST.
What does the inorder traversal look like for that tree?
> If you insert the values in ascending order they will all go down to the right 
> of the root and make one branch. However, inorder traversal will still return the
> values in a sorted order.

In your own words, explain the differences between:

Recursive vs iterative traversal
> Recursive uses the call stack, it's clean but, it can lead to stack overflow.
> Recursive solutions often work well for tree structures bc a tree is recursive. 
> Iterative uses a data structure instead of a call stack.
> Iterative may be more complex to implement but can also be more memory-efficient. 

Depth-first vs breadth-first traversal
> Depth-first follows each branch all the way down and then backtracks. It also uses a Stack.
> Breadth-first follows all the nodes at one level and the moves to a lower level. It uses a Queue.

When might you prefer a breadth-first traversal in a real application?
> In a situation where you would want the shortest path it would be best to use breadth-first traversal
> Example- a GPS (basic version) where you want to find the fewest number of roads btwn two points