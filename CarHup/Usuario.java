import javax.swing.JOptionPane;

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
        private boolean tieneCuenta;
        private String [] reservas = new String[10];
        private String [] usuarioAsignado = new String[10];
        private int cont;


        public Usuario(String estado, String municipio, String localidad, String numeroDeTelefono, boolean tieneCuenta, String passaword) {
            setEstado(estado);
            setMunicipio(municipio);
            setLocalidad(localidad);
            setNumeroDeTelefono(numeroDeTelefono);
            setPassaword(passaword); // Asignar la contraseña proporcionada
            this.tieneCuenta = false; // Corregido
            this.esConductor = false; // Corregido
            cont=0;
            
        }
    
        public Usuario(String nombre, String fechaNacimiento, String correo, String passaword, String sexo, boolean tieneCuenta) {
            setCorreo(correo);
            setFechaNacimiento(fechaNacimiento);
            setNombre(nombre);
            setPassaword(passaword);
            setSexo(sexo);
            this.esConductor = false; // Corregido
            this.tieneCuenta = false; // Corregido
            cont = 0;
        }


        public void agregarReserva(String reserva) {
            if (reservas[reservas.length - 1] != null) {
                JOptionPane.showMessageDialog(null, "No se puede agregar más reservas. Ya se han alcanzado las 10 reservas.");
                return; 
            }
            
            // Buscar la primera posición nula para agregar la nueva reserva
            for (int i = 0; i < reservas.length; i++) {
                if (reservas[i] == null) {
                    reservas[i] = reserva;
                    break;
                }
            }
        }        
        

        public void eliminarReserva(int indice) {
            if (indice >= 0 && indice < reservas.length && reservas[indice] != null) {
                // Eliminar la reserva desplazando los elementos hacia la izquierda
                for (int i = indice; i < reservas.length - 1; i++) {
                    reservas[i] = reservas[i + 1];
                }
                reservas[reservas.length - 1] = null; // Establecer el último elemento como nulo
                JOptionPane.showMessageDialog(null, "Reserva eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El índice de reserva especificado no es válido.");
            }
        }




        public void agregarUsuario(String reserva) {
            if (usuarioAsignado[usuarioAsignado.length - 1] != null) {
                JOptionPane.showMessageDialog(null, "No se puede agregar más reservas. Ya se han alcanzado las 10 reservas.");
                return; 
            }

            for (int i = 0; i < usuarioAsignado.length; i++) {
                if (usuarioAsignado[i] == null) {
                    usuarioAsignado[i] = reserva;
                    break;
                }
            }
        }

        
        public void eliminarUsuario(String nombreUsuario) {
            int indice = -1;
            for (int i = 0; i < usuarioAsignado.length; i++) {
                if (usuarioAsignado[i] != null && usuarioAsignado[i].equals(nombreUsuario)) {
                    indice = i;
                    break;
                }
            }
            if (indice != -1) {
                for (int i = indice; i < usuarioAsignado.length - 1; i++) {
                    usuarioAsignado[i] = usuarioAsignado[i + 1];
                }
                usuarioAsignado[usuarioAsignado.length - 1] = null; // Establecer el último elemento como nulo
                JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El usuario especificado no existe en el arreglo.");
            }
        }
        
        
        


    
        public Usuario() {
            nombre = "";
            fechaNacimiento = "";
            correo = "";
            passaword = "";
            tieneCuenta = false;
            cont =0;
            
        }


        public String[] getUsuarioAsignado() {
            return usuarioAsignado;
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


        public String getCorreo() {
            return correo;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public String getNombre() {
            return nombre;
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

        public void setTieneCuenta(boolean tieneCuenta) {
            this.tieneCuenta = tieneCuenta;
        }

        public boolean getTieneCuenta(){
            return tieneCuenta;
        }

        public void setPassaword(String passaword) {
            this.passaword = passaword;
        }
    
        public String getPassaword() {
            return passaword;
        }
        

        public String[] getReservas() {
            return reservas;
        }



        public void setCont(int cont) {
            this.cont = cont;
        }


        public int getCont() {
            return cont;
        }
}
