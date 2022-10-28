import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestorPersonal {
    private ArrayList<Persona> personas;
    public GestorPersonal(){
        this.personas = new ArrayList<Persona>();
    }
    public Persona agregarPersona(String nombre, String apellido, String rut) {
        Persona persona = new Persona(nombre, apellido, rut);
        this.personas.add(persona);
        return persona;
    }
    public List buscarAutoMarca(String marca) {
        ArrayList<Persona> personas = new ArrayList<>();
        for (Persona persona : this.personas) {
            for (Automovil automovil : this.automoviles){

            }
        }
    }
    public List buscarPersonasNombre(String nombre){
        ArrayList<Persona> personas = new ArrayList<>();
        for (Persona persona : this.personas) {
            if(persona.getNombre().equals(nombre)){
                personas.add(persona);
            }
        }
        return personas;
    }
    public Persona buscarPersonaRut(String rut){
        for (Persona persona : this.personas) {
            if(persona.getRut().equals(rut)){
                return persona;
            }
        } return null;
    }
    public Persona agregarAutoYCorreo()
}

