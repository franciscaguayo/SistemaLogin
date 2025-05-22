import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DatosLogin {
    public ArrayList<String> credenciales = new ArrayList<>();

    public DatosLogin() {
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("login.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.contains(";") && !linea.trim().isEmpty()) {
                    credenciales.add(linea.trim());
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("error al leer el archivo: " + e.getMessage());
        }
    }
}
