package DSA.LinkedList.randomQuestions;

public class Remove_duplicates {
    DNode removeDuplicates(DNode headRef) {
        DNode t1 = headRef;

        while (t1 != null) {
            DNode t2 = t1.next;

            while (t2 != null && t1.data == t2.data) {
                t2 = t2.next;
            }

            t1.next = t2;

            if (t2 != null) {
                t2.prev = t1;
            }

            t1 = t2;
        }

        return headRef;
    }
}
