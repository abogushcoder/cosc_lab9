
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

  private static void testRetainUpToEdgeCases() {
    System.out.println("*****    RETAIN UP TO EDGE CASES    *****");

    FBLinkedList<String> test1 = new FBLinkedList<String>();
    String target = "cat";
    System.out.println("Test #1 (empty list):");
    System.out.println("list before:\t" + test1 + ", target: " + target);
    test1.retainUpTo(target);
    System.out.println("list after:\t" + test1 + "\n");

    FBLinkedList<String> test2 = new FBLinkedList<String>();
    test2.add("cat");
    target = "cat";
    System.out.println("Test #2 (single element, target exists):");
    System.out.println("list before:\t" + test2 + ", target: " + target);
    test2.retainUpTo(target);
    System.out.println("list after:\t" + test2 + "\n");

    FBLinkedList<String> test3 = new FBLinkedList<String>();
    test3.add("cat");
    target = "dog";
    System.out.println("Test #3 (single element, target does not exist):");
    System.out.println("list before:\t" + test3 + ", target: " + target);
    test3.retainUpTo(target);
    System.out.println("list after:\t" + test3 + "\n");

    FBLinkedList<String> test4 = new FBLinkedList<String>();
    test4.add("cat");
    test4.add("bat");
    test4.add("rat");
    target = "dog";
    System.out.println("Test #4 (target does not exist):");
    System.out.println("list before:\t" + test4 + ", target: " + target);
    test4.retainUpTo(target);
    System.out.println("list after:\t" + test4 + "\n");

    FBLinkedList<String> test5 = new FBLinkedList<String>();
    test5.add("cat");
    test5.add("bat");
    test5.add("rat");
    target = "cat";
    System.out.println("Test #5 (target is first element):");
    System.out.println("list before:\t" + test5 + ", target: " + target);
    test5.retainUpTo(target);
    System.out.println("list after:\t" + test5 + "\n");

  }

  private static void testAddEdgeCases() {
    System.out.println("*****    ADD EDGE CASES    *****");

    FBLinkedList<String> test1 = new FBLinkedList<String>();
    System.out.println("Test #1 (add to empty list):");
    test1.add("cat");
    System.out.println("list after:\t" + test1 + "\n");

    FBLinkedList<String> test2 = new FBLinkedList<String>();
    System.out.println("Test #2 (add at index 0):");
    test2.add(0, "dog");
    System.out.println("list after:\t" + test2 + "\n");

    FBLinkedList<String> test3 = new FBLinkedList<String>();
    test3.add("cat");
    test3.add("dog");
    System.out.println("Test #3 (add at end of list):");
    test3.add(2, "frog");
    System.out.println("list after:\t" + test3 + "\n");

    FBLinkedList<String> test4 = new FBLinkedList<String>();
    test4.add("cat");
    test4.add("dog");
    test4.add("frog");
    System.out.println("Test #4 (add to middle of list):");
    test4.add(1, "bat");
    System.out.println("list after:\t" + test4 + "\n");
  }

  public static void main(String[] args) {

    // Come up with test cases of your own
    // the provided tests are not sufficient!

    testAdd(); // uncomment me for Part 2.3!
    testRetainUpTo(); // uncomment me for Part 2.6!
    testAddEdgeCases();
    testRetainUpToEdgeCases();

  }

}
