# CheckSubTree

The following problem is taken from Cracking the Coding Interview

Check Subtree: Tl and T2 are two very large binary trees, with Tl much bigger 
than T2. Create an algorithm to determine if T2 is a subtree of Tl.
A tree T2 is a subtree of Tl if there exists a node n in Tl such that the 
subtree of n is identical to T2. That is, if you cut off the tree at node n, 
the two trees would be identical.


Solution explanation:

in following test case I have created following two trees:

t1 =                 15
                   /    \
                  9      18
                 / \    /  \
                4  12  17  25
                             \
                             28


t2 =                18
                   /  \
                  17  25
                        \
                        28

Using preOrderTraversal of the tree we can find out and compare the two 
generated lists. Making sure to insert null when the value of the object is null 
