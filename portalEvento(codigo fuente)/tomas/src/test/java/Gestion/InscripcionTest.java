package Gestion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import com.portal.Inscripcion;


public class InscripcionTest {
    
 private Inscripcion inscripcion;
    private LocalDateTime fecha;

    @BeforeEach
    void setUp() {
        fecha = LocalDateTime.now();
        inscripcion = new Inscripcion(1, 1001, 2001, fecha);
    }

    @Test
    void testCreacionInscripcion() {
        assertEquals(1, inscripcion.getInscripcion());
        assertEquals(1001, inscripcion.getUsuario());
        assertEquals(2001, inscripcion.getEvento());
        assertEquals(fecha, inscripcion.getFechaInscripcion());
    }

   

    @Test
    void testModificarUsuario() {
        inscripcion.setUsuario(3001);
        assertEquals(3001, inscripcion.getUsuario());
    }
    
}
