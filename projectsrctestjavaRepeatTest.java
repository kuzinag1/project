import junit.framework.TestCase;

import java.util.ArrayList;

public class RepeatTest  extends TestCase {

    ArrayList<String> list;

    protected void addList(){
        list = new ArrayList<>();
        list.add("Bob");
        list.add("Alice");
        list.add("Joe");
        list.add("bob");
        list.add("alice");
        list.add("dEN");
    }

    public void testNumberOfRepeat(){
        addList();
        String actual = Main.numberOfRepeat(list);
        String expected = "Alice : 2\n" + "Bob : 2\n" + "Den : 1\n" + "Joe : 1";
        assertEquals(expected,actual);
    }
}
