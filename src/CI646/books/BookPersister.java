package CI646.books;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Optional;

public interface BookPersister extends Serializable {
    public static Optional<Book> read(String path) {
        try {
            FileInputStream fin = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fin);
            return Optional.of((Book) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public void save();
}
