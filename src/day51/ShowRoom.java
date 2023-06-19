package day51;

import java.util.Iterator;
import java.util.Objects;

public class ShowRoom implements Iterable<Car> {

    private static final int DEFAULT_CAPACITY = 10;
    private Car[] cars;
    private int count;


    public ShowRoom(int capacity) {
        cars = new Car[capacity];
    }

    public ShowRoom() {
        this(DEFAULT_CAPACITY);
    }

    public int capacity() {
        return cars.length;
    }


    public int size() {
        return count;
    }

    public void add(Car car) {
        cars[count++] = car;
        if (size() == capacity() / 2 + 1) {
            Car[] tmp = new Car[size()];
            for (int i = 0; i < size(); i++) {
                tmp[i] = cars[i];
            }
            cars = new Car[capacity() * 2];
            for (int i = 0; i < size(); i++) {
                cars[i] = tmp[i];
            }
        }

    }

    public Car get(int index) {
        Objects.checkIndex(index, size());
        return cars[index];
    }


    @Override
    public Iterator<Car> iterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator<Car> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }


}
