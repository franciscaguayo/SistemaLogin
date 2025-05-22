public class Login {
    public boolean autenticar(String usuario, String clave, DatosLogin datos){
        String intento = usuario + ";" + clave;
        for (String credencial: datos.credenciales) {
            if (credencial.equals(intento)) {
                return true;
            }
        }
        return false;
    }
}
