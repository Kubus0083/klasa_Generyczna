import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiCon<T, M> {
    private Map<T,M> elements = new HashMap<>();


    // Dodawanie elementu do kontenera
    public void add(T element, M m) {
        elements.put(element, m);
    }

    // Usuwanie elementu z kontenera
    public void remove(T element, M m) {
        elements.remove(element,m);
    }
    public void remove(int i) {
        elements.remove(i);
    }

    // Pobieranie elementu na podstawie indeksu
    public T get(int index) {
        return (T) elements.get(index);
    }

    // Wyświetlanie wszystkich elementów w postaci tekstowej
    @Override
    public String toString() {
        return elements.toString();
    }
}
//git
