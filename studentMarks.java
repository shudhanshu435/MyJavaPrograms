public class studentMarks {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

        // 1. Traversal - print all marks
        System.out.println("Marks of students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // 2. Search - find a specific mark
        int search = 90;
        boolean found = false;
        for (int mark : marks) {
            if (mark == search) {
                found = true;
                break;
            }
        }
        System.out.println("Is " + search + " present? " + found);

        // 3. Count - how many passed (>= 40)
        int passCount = 0;
        for (int mark : marks) {
            if (mark >= 40) {
                passCount++;
            }
        }
        System.out.println("Number of students passed: " + passCount);
    }
}

