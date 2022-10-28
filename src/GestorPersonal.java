import java.util.ArrayList;
import java.util.List;

public class GestorPersonal {
    private ArrayList<Persona> personas;
    public GestorPersonal(){
        this.personas = new ArrayList<Persona>();
    }
    public boolean agregarPersona(String nombre, String apellido, String rut) {
        if(buscarPersonaRut(rut) == null) {
            Persona persona = new Persona(nombre, apellido, rut);
            this.personas.add(persona);
            return true;
        }
        else{
            return false;
        }
    }
    public List<Persona> buscarAutoMarca(String marca) {
        ArrayList<Persona> personas = new ArrayList<>();
        for (Persona persona : this.personas) {
            for(Automovil automovil : persona.getAutomoviles()){
                if(automovil.getMarca().equals(marca)){
                    personas.add(persona);
                }
            }
        }
        return personas;
    }
    public List<Persona> buscarPersonasNombre(String nombre){
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
    public Persona agregarCorreo(String rut, CorreoElectronico correoElectronico, Automovil automovil){
        for (Persona persona : this.personas){
            if(persona.getRut().equals(rut)){
                persona.correos.add(correoElectronico);
            }
        }
        return null;
    }
    public Persona agregarAuto(String rut, CorreoElectronico correoElectronico, Automovil automovil){
        for (Persona persona : this.personas){
            if(persona.getRut().equals(rut)){
                persona.automoviles.add(automovil);
            }
        }
        return null;
    }
}

