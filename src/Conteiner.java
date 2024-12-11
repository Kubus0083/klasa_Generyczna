import java.util.ArrayList;
import java.util.List;

public class Conteiner<T> {
    private List<T> elements;

    // Konstruktor inicjalizujący listę
    public Conteiner() {
        elements = new ArrayList<>();
    }

    // Dodawanie elementu do kontenera
    public void add(T element) {
        elements.add(element);
    }

    // Usuwanie elementu z kontenera
    public void remove(T element) {
        elements.remove(element);
    }

    // Pobieranie elementu na podstawie indeksu
    public T get(int index) {
        return  elements.get(index);
    }

    // Wyświetlanie wszystkich elementów w postaci tekstowej
    @Override
    public String toString() {
        return elements.toString();
    }
}
//git
