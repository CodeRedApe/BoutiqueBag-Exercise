public class ClothingBag<T> implements BagInterface<T>
{
    private final T[] bag;
    private int EntryQTY;
    private static final int Default_size = 20;

    public ClothingBag()
    {
        this(Default_size);
    }

    @SuppressWarnings("unchecked")
    public ClothingBag(int size) {
        // constructor stub
        T[] tempBag = (T[])new Object[Default_size];
        bag = tempBag;
        EntryQTY = 0;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[EntryQTY]; // Unchecked cast
        System.arraycopy(bag, 0, result, 0, EntryQTY); // end for

        return result;
    }
    @Override
    public boolean add(T newEntry) {
        // Adds ClothingArticle to Bag
        boolean result = true;
        if (isArrayFull())
        {
            result = false;
        }
        else
        { 
            bag[EntryQTY] = newEntry;
            EntryQTY++;
        } 

        return result;
    }
    @Override
    public int getCurrentSize() {
        return 0;
    }

    // Will Return false if bag is not full, true if bag is full - test whether the bag is at the maximum capacity
    private boolean isArrayFull()
    {
        return EntryQTY >= bag.length;
    } // end 

}