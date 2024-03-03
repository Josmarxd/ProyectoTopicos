package CarHup;
import java.util.ArrayList;
import java.util.List;
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
    
}
