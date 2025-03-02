fun main(){
var tree =BinarySearchTree<Int>()
    println( tree.isEmpty())
    println( tree.contains(5))
    tree.add(4)
    tree.add(16)
    tree.add(6)
    tree.add(7)
    tree.add(9)
    tree.add(3)
    tree.add(1)
    println("$tree.toString()")
}

class BinarySearchTree<E:Comparable<E>>{
    var root:BinaryNode<E>? = null
    fun add(element:E){
        val newNode = BinaryNode(element)
        if (root == null){
            root = newNode
            return
        }
        var current : BinaryNode<E> = root ?: return
        while (true){
            when{
                current.data == element -> return
                element<current.data -> {
                    if (current.leftNode == null){
                        current.leftNode = newNode
                        return
                    }
                    current.leftNode?.let { current == it }
                }
                element>current.data -> {
                    if (current.rightNode == null){
                        current.rightNode = newNode
                        return
                    }
                    current.rightNode?.let { current == it }
                }
            }
        }
    }
    fun contains(element:E):Boolean{
        var current = root
        while (true){
            if (current == null){
                break
            }
            else if (current.data == element){
                return true
            }
            else if (element<current.data){
                current=current.leftNode
            }
            else if (element>current.data){
                current=current.rightNode
            }
        }
        return false
    }
    fun isEmpty() = root == null


    data class BinaryNode<E:Comparable<E>>(
        val data:E,
        var leftNode : BinaryNode<E>? = null,
        var rightNode : BinaryNode<E>? = null
    )
}