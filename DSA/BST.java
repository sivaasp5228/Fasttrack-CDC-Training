// BST Create ( Insert )

static Node insert(Node root, int value) {
    if(root == null) {
        return new Node(value);
    }
    if(value < root.data) {
        root.left = insert(root.left, value);
    }
    else if(value > root.data) {
        root.right = insert(root.right, value);
    }
    return root;
}

// BST Read ( Search )

static boolean search(Node root, int value) {
    if(root == null)
        return false;
    if(root.data == value)
        return true;
    if(value < root.data)
        return search(root.left, value);
    return search(root.right, value);
}

// BST Update ( Modify ) - should be normally implemented as delete() + insert()
// " Generic UPDATE Value"
// update 30 -> 35
// delete (30)
// insert (35)

// BST Delete ( delete )
// DELETE :
// Case 1 -> Leaf Node : delete 20 - Simply remove it
// case 2