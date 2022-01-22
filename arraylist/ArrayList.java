import java.util.*;
import java.util.NoSuchElementException;

public class ArrayList < T >
{
  public static final int INITIAL_CAPACITY = 9;
  private T[] backingArray;
  private int size;
  public ArrayList ()
  {
    //DO NOT MODIFY THIS METHOD!
    backingArray = (T[])new Object[INITIAL_CAPACITY];
  }

  public void addToFront (T data)
  {
    if (data == null)
      {
	throw new IllegalArgumentException ();
      }
    increaseSize ();
    T[]tempArray = createTempArray ();
    tempArray[0] = data;
    for (int i = 1; i < size; i++)
      {
	tempArray[i] = backingArray[i - 1];
      }
    backingArray = tempArray;
  }

  public void addToBack (T data)
  {
    if (data == null)
      {
	throw new IllegalArgumentException ();
      }
    increaseSize ();
    if (size < backingArray.length){
        backingArray[size-1] = data;
    } else {
        T[]tempArray = createTempArray ();
        for (int i = 0; i < size - 1; i++) {
	        tempArray[i] = backingArray[i];
        }
        tempArray[size - 1] = data;
        backingArray = tempArray;
    }
  }
  
   public T removeFromFront() {
       if(size == 0) {
           throw new NoSuchElementException();
       }
       T[]tempArray = createTempArray ();
       for (int i=1;i<backingArray.length ;i++ ){
           tempArray[i-1] = backingArray[i];
       } 
       T frontItem = backingArray[0];
       backingArray = tempArray;
       decreaseSize();
       return frontItem;
    }
    
    public T removeFromBack() {
       if(size == 0) {
           throw new NoSuchElementException();
       }
        int lastItemIndex = size - 1;
        T backItem = backingArray[lastItemIndex];
        backingArray[lastItemIndex] = null;
        decreaseSize();
        return backItem;
    }

  public void printAll ()
  {
    System.out.println (Arrays.toString (backingArray));
  }

  public T[] getBackingArray ()
  {
    // DO NOT MODIFY THIS METHOD!
    return backingArray;
  }

  public int size ()
  {
    // DO NOT MODIFY THIS METHOD!
    return size;
  }

  private void increaseSize ()
  {
    size++;
  }

  private void decreaseSize ()
  {
    size--;
  }

  private T[] createTempArray ()
  {
      return (T[])new Object[size > backingArray.length ? backingArray.length * 2 : backingArray.length];
  }
}
