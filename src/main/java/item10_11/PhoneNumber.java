package item10_11;

import java.util.Objects;

public class PhoneNumber extends Number{

    private int first;
    private int middle;
    private int last;

    public PhoneNumber(int first, int middle, int last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return first == that.first && middle == that.middle && last == that.last;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, middle, last);
    }
}
