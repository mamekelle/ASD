package Lab9_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListProfiler<T> extends ListProfiler<T> {

	public ArrayListProfiler(List<T> list) {
		this.list = list;
	}

	@Override
	public boolean add(T item) {
		long startTime = System.currentTimeMillis();
		boolean result = this.list.add(item);
		System.out.println("Array List - add: " + (System.currentTimeMillis() - startTime));
		return result;
	}

	@Override
	public boolean remove(Object o) {
		long startTime = System.currentTimeMillis();
		boolean result = this.list.remove(o);
		System.out.println("Array List - remove: " + (System.currentTimeMillis() - startTime));
		return result;
	}

	@Override
	public boolean contains(Object o) {
		long startTime = System.currentTimeMillis();
		boolean result = this.list.contains(o);
		System.out.println("Array List - contains: " + (System.currentTimeMillis() - startTime));
		return result;
	}

	@Override
	public int size() {
		long startTime = System.currentTimeMillis();
		int result = this.list.size();
		System.out.println("Array List - size(): " + (System.currentTimeMillis() - startTime));
		return result;
	}

	// Methods which need to be implemented
	@Override
	public boolean isEmpty() {

		return false;
	}

	@Override
	public Iterator<T> iterator() {

		return null;
	}

	@Override
	public Object[] toArray() {

		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {

		return null;
	}

	@Override
	public boolean containsAll(Collection<?> c) {

		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {

		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {

		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {

		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {

		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public T get(int index) {

		return null;
	}

	@Override
	public T set(int index, T element) {

		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub

	}

	@Override
	public T remove(int index) {

		return null;
	}

	@Override
	public int indexOf(Object o) {

		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {

		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {

		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {

		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {

		return null;
	}

}
