
public class FBLLClient {

  private static void testAdd() {
    System.out.println("*****    ADD TESTS    *****");

    // Test 1.1
    FBLinkedList<String> test1 = new FBLinkedList<String>();
    test1.add("cat");
    test1.add("dog");
    test1.add("frog");
    System.out.println("Test #1 (append to end):\n\t" + test1 + "\n");

    // Test 1.2
    FBLinkedList<String> test2 = new FBLinkedList<String>();
    test2.add("cat");
    test2.add("dog");
    test2.add(1, "frog");
    System.out.println("Test #2 (insert at idx 1):\n\t" + test2 + "\n");

    // Add more of your own!

  }

  private static void testRetainUpTo() {
    System.out.println("*****    RETAIN UP TO TESTS    *****");
    String target;

    System.out.println("Test #1:");
    FBLinkedList<String> test1 = new FBLinkedList<String>();
    test1.add("cat");
    test1.add("bat");
    test1.add("dog");
    test1.add("bird");
    test1.add("dog");
    test1.add("frog");
    target = "dog";

    System.out.println("list before:\t" + test1 + ", target: " + target);
    test1.retainUpTo(target);
    System.out.println("list after:\t" + test1 + "\n");

    System.out.println("Test #2:");
    FBLinkedList<String> test2 = new FBLinkedList<String>();
    test2.add("deer");
    test2.add("steer");
    test2.add("lark");
    test2.add("shark");
    target = "aardvark";

    System.out.println("list before:\t" + test2 + ", target: " + target);
    test2.retainUpTo(target);
    System.out.println("list after:\t" + test2 + "\n");

  }

  public static void main(String[] args) {

    // Come up with test cases of your own
    // the provided tests are not sufficient!

    testAdd(); // uncomment me for Part 2.3!
    testRetainUpTo(); // uncomment me for Part 2.6!

  }

}
