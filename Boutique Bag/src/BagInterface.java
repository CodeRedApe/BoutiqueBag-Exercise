public interface BagInterface<T>
{
    //gets current number of items in bag.

    public int getCurrentSize();

    // Adds new item to bag.

    public boolean add(T newEntry);

    // fecthes all item that are in bag.
   public T[] toArray();
}