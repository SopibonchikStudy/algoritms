public interface Iterator<T> {
    T next();
    boolean hasNext();
    void reset();
}
