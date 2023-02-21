package com.mayab.desarrollo.comportamiento.adapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Clase PersonaViejaAdapter que adapta PersonaVieja a IPersonaNueva
class PersonaViejaAdapter implements IPersonaNueva {
    private PersonaVieja personaVieja;

    public PersonaViejaAdapter(PersonaVieja personaVieja) {
        this.personaVieja = personaVieja;
    }

    public String getNombre() {
        return this.personaVieja.getNombre() + " " + this.personaVieja.getApellido();
    }

    public int getEdad() {
        String fechaNacimiento = this.personaVieja.getFechaNacimiento();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNac = null;
        try {
            fechaNac = sdf.parse(fechaNacimiento);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar fechaNacimientoCal = Calendar.getInstance();
        fechaNacimientoCal.setTime(fechaNac);
        Calendar fechaActual = Calendar.getInstance();
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimientoCal.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }
}