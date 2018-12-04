package search.sort.java;

/**
 * Created by antonia on 2017/03/20.
 */
public class NewClass {
    private int value;

    public NewClass(int v) {
        value = v;
    }

    public void showme() {
        System.out.println("Value = " + value);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.value;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        final NewClass other = (NewClass) obj;
        if (this.value == other.value) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        NewClass n1 = new NewClass(3),
                n2 = new NewClass(5),
                n3 = new NewClass(3),
                n4;

        n1.showme();
        n2.showme();

        if (n1.equals(n2)) {
            System.out.println("n1 and n2 are equals: I useed equals overrirdedm ");
        } else {
            System.out.println("Objects are NOT equals: I useed equals overrirdedm ");
        }

        if (n1.equals(n3)) {
            System.out.println("n1 and n3 are equals: I useed equals overrirdedm ");
        } else {
            System.out.println("n1 and n3 are NOT equals: I useed equals overrirdedm ");
        }
    }

        static int binarySearch(Comparable target, Comparable[] a, int left, int right) {
            int l = left,
               r = right;

            while (l <= r) {
                int m = (l + r) / 2;
                int comp = target.compareTo(a[m]);
                if (comp == 0) return m;
                else if {
                    int i = 1;
                }
            }
            return C_NOT_FOUND;
        }


    }

