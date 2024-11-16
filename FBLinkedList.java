public class FBLinkedList<E> {

  private int size;
  private Node<E> front, back;

  // Returns the number of items in the list
  public int size() {
    return size;
  }

  public E get(int idx) {
    if (idx >= size || idx < 0)
      throw new IndexOutOfBoundsException("Index out of range! Requested idx: " + idx + ", size = " + size);
    return getNode(idx).data;
  }

  // only intended to be called from inside the FBLinkedList class
  private Node<E> getNode(int idx) {
    Node<E> current = front;
    for (int i = 0; i < idx; i++)
      current = current.next;
    return current;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    if (size == 0)
      return "[]";
    Node<E> current = front;
    for (int i = 0; i < size - 1; i++) {
      sb.append(current.data + " ==> ");
      current = current.next;
    }
    sb.append(current.data + "]");
    return sb.toString();
  }

  private static class Node<E> {

    private E data;
    /** The data value. */
    private Node<E> next = null;

    /** The link to the next Node in the list */

    // Our Nodes are SINGLY-LINKED, meaning they maintain only a next
    // reference, NOT a previous. You MAY NOT add a previous reference.

    public Node(E data, Node<E> next) {
      this.data = data;
      this.next = next;
    }

    public Node(E data) {
      this(data, null);
    }
  }

  // ***************************************************************
  // ** **
  // ** YOU DON"T NEED TO MODIFY ANYTHING ABOVE THIS LINE **
  // ** YOUR TASKS ARE BELOW **
  // ** **
  // ***************************************************************

  // Appends argument element to the end of the list
  public void add(E toAdd) {
    add(this.size, toAdd);
  }

  // Inserts the argument element at the specified index
  // can also be used to append to the end of the list
  // If an invalid index is provided, throws an IndexOutOfBoundsException
  public void add(int index, E toAdd) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("Out of range");
    }
    if (index == 0) {
      front = new Node<E>(toAdd, front);
    } else {
      Node<E> temp = this.getNode(index - 1);
      temp.next = new Node<E>(toAdd, temp.next);
      if (index == this.size) {
        back = temp.next;
        back.next = null;
      }
    }
    this.size++;
  }

  // Removes all elements from the reference list that appear AFTER
  // the first occurrence of target:
  // list1 = "cat" -> "bat" -> "dog" -> "bird" -> "dog" -> "frog"
  // after list1.retainUpTo("dog");
  // list1 = "cat" -> "bat" -> "dog"
  public void retainUpTo(E target) {
    if (this.size == 0 || front == null) {
      return;
    }

    Node<E> traverse = front;
    int newSize = 1;

    while (traverse != null) {
      if (traverse.data.equals(target)) {
        back = traverse;
        traverse.next = null;
        break;
      }

      traverse = traverse.next;
      newSize++;
    }

    if (traverse == null) {
      newSize = this.size;
    }

    this.size = newSize;
  }

  // ignore these methoods... used for testing-------------------------
  public E getBackElement() {
    if (back == null)
      return null;
    return back.data;
  }

  public boolean getBackNext() {
    return back == null || back.next == null;
  }
  // -------------------------------------------------------------------

}
