package head_16.tree_set;

import java.util.TreeSet;

public class TestTreeSet2 {
    public static void main(String[] args) {
        new TestTreeSet2().go();
    }

    public void go(){
        Book b1 = new Book("Как устроены кошки");
        Book b2 = new Book("Постройте заново свое тело");
        Book b3 = new Book("В поисках Эмо");

        BookCompare bookCompare = new BookCompare();
        TreeSet<Book> treeSet = new TreeSet<>(bookCompare);
        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);

        System.out.println(treeSet);
    }

}
