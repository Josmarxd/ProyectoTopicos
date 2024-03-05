package CarHup;
public class Usuario {
        private String nombre;
        private String fechaNacimiento;
        private String correo;
        private String passaword;
        private String estado;
        private String municipio;
        private String localidad;
        private String numeroDeTelefono;
        private String sexo;
        private boolean esConductor;

        public Usuario(String nombre, String fechaNacimiento, String correo, String passaword, String estado,String municipio, String localidad) {
            setCorreo(correo);
            setFechaNacimiento(fechaNacimiento);
            setNombre(nombre);
            setPassaword(passaword);
            setEstado(estado);
            setMunicipio(municipio);
            setLocalidad(localidad);
            setNumeroDeTelefono(localidad);
            esConductor = true;
            
            
        }
    
        public Usuario(String nombre, String fechaNacimiento, String correo, String passaword,String sexo) {
            setCorreo(correo);
            setFechaNacimiento(fechaNacimiento);
            setNombre(nombre);
            setPassaword(passaword);
            setSexo(sexo);
            esConductor = false;
        }

        public Usuario(){
            nombre = null;
            fechaNacimiento = null;
            correo = null;
            passaword = null;
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

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public void setLocalidad(String localidad) {
            this.localidad = localidad;
        }


        public void setMunicipio(String municipio) {
            this.municipio = municipio;
        }

        public void setNumeroDeTelefono(String numeroDeTelefono) {
            this.numeroDeTelefono = numeroDeTelefono;
        }


        public String getEstado() {
            return estado;
        }


        public String getLocalidad() {
            return localidad;
        }

        public String getMunicipio() {
            return municipio;
        }

        public String getNumeroDeTelefono() {
            return numeroDeTelefono;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public String getSexo() {
            return sexo;
        }

        public void setEsConductor(boolean esConductor) {
            this.esConductor = esConductor;
        }

        public boolean getEsConductor(){
            return esConductor;
        }
}
