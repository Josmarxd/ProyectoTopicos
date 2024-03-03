package CarHup;
public class Usuario {
        private String nombre;
        private String fechaNacimiento;
        private String correo;
        private String passaword;
    
        public Usuario(String nombre, String fechaNacimiento, String correo, String passaword) {
            setCorreo(correo);
            setFechaNacimiento(fechaNacimiento);
            setNombre(nombre);
            setPassaword(passaword);
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPassaword(String passaword) {
            this.passaword = passaword;
        }

        public String getCorreo() {
            return correo;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public String getNombre() {
            return nombre;
        }

        public String getPassaword() {
            return passaword;
        }
}
