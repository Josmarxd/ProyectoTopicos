import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConfiguracionModel {
    
        private List<Usuario> listaUsuarios;
    
        public ConfiguracionModel() {
            this.listaUsuarios = new ArrayList<>();
        }
    
        public List<Usuario> getListaUsuarios() {
            return listaUsuarios;
        }
    
        public void agregarUsuario(Usuario usuario) {
            listaUsuarios.add(usuario);
        }   

         public List<Usuario> obtenerConductoresAleatorios() {
    
        List<Usuario> conductores = listaUsuarios.stream()
                .filter(Usuario::getEsConductor)
                .collect(Collectors.toList());

        
        Collections.shuffle(conductores);

        return conductores.size() > 5 ? conductores.subList(0, 5) : conductores;
    }

    public void llamarConductor(Usuario conductor) {
        System.out.println("Llamando a " + conductor.getNombre() + " al número " + conductor.getNumeroDeTelefono());
    }
}
