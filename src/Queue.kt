fun main() {
    var q1 = Queue<Int>()
    var q2 = Queue<Char>()

    q1.add(5)
    q1.add(6)

    q2.add('c')
    q2.add('d')
    q2.add('e')



    println(q1.combine(q1,q2).toString())



}

class Queue<E> {
    var size = 0

    var first: Node<E>? = null
    var last: Node<E>? = null

    fun add(element: E) {
        val node = Node(element)

        if (first == null) {
            first = node
        } else {
            last?.nextNode = node  //If you assign node.nextNode = first
        }
        size++
        last = node                // and here first = node this two changes will make it stack

    }

    fun remove(): E? {
        if (size == 0) return null

        val node = first
        first = node?.nextNode
        size--
        return node?.data

    }

    fun peek() = first?.data
    fun isEmpty() = first == null


    data class Node<E>(val data: E, var nextNode: Node<E>? = null)

    fun combine(q1: Queue<*>, q2: Queue<*>): Queue<Any> {
        var result = Queue<Any>()

        while (true) {
            q1.remove()?.let { result.add(it) }
            q2.remove()?.let { result.add(it) }

            if (q1.peek() == null && q2.peek() == null) {
                break
            }
        }

        return result
    }





}